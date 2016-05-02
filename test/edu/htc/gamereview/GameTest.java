package edu.htc.gamereview;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.model.InitializationError;


/**
 * Created by Sam on 4/10/2016.
 */
public class GameTest {
    private Game testGame;

    @Before
    public void setup(){
         testGame = new Game();
    }

    @Test (expected = InvalidDataTypeException.class)
    public void setName_Null() throws InvalidDataTypeException {
        testGame.setName(null);
    }


    @Test (expected = InvalidDataTypeException.class)
    public void setName_Empty() throws InvalidDataTypeException {
        testGame.setName(" ");
    }

    @Test
    public void setName() throws InvalidDataTypeException {
        testGame.setName("Fallout 4");
        assertEquals("Fallout 4", testGame.getName());
    }


    @Test(expected = InvalidDataTypeException.class)
    public void addReview_Null() throws InvalidDataTypeException{
        testGame.addReview(null);
    }
    

    @Test
    public void addReview() throws InvalidDataTypeException{
        Review review = new Review();
        testGame.addReview(review);
        assertEquals(1, testGame.getReviews().size());
        assertEquals(testGame.getReviews().get(0), review);
    }

    @Test(expected = InvalidDataTypeException.class)
    public void setYearReleased_null() throws InvalidDataTypeException{
        testGame.setYearReleased(null);

    }

    @Test(expected = InvalidDataTypeException.class)
    public void setYearReleased_empty() throws InvalidDataTypeException{
        testGame.setYearReleased("");

    }

    @Test(expected = InvalidDataTypeException.class)
    public void setYearReleased_not4digits() throws InvalidDataTypeException{
        testGame.setYearReleased("Not");

    }

    @Test(expected = InvalidDataTypeException.class)
    public void setYearReleased_notNumbers() throws InvalidDataTypeException{
        testGame.setYearReleased("Nope");

    }
    @Test
    public void setYearReleased() throws InvalidDataTypeException{
        testGame.setYearReleased("2016");
        assertEquals("2016", testGame.getYearReleased());

    }
    @Test(expected = InvalidDataTypeException.class)
    public void setPlatform_null() throws InvalidDataTypeException{
        testGame.setPlatform(null);

    }

    @Test(expected = InvalidDataTypeException.class)
    public void setPlatform_empty() throws InvalidDataTypeException{
        testGame.setPlatform("");

    }

    @Test
    public void setPlatform() throws InvalidDataTypeException {
        testGame.setPlatform("PS4");
        assertEquals("PS4", testGame.getPlatform());
    }

    @Test(expected = InvalidDataTypeException.class)
    public void addTag_null() throws InvalidDataTypeException{
        testGame.addTag(null);
    }
    @Test(expected = InvalidDataTypeException.class)
    public void addTag_empty() throws InvalidDataTypeException{
        testGame.addTag("");
    }
    @Test
    public void addTag() throws InvalidDataTypeException{
        testGame.addTag("fantasy");
    }

    @Test
    public void validate_true()throws InvalidDataTypeException {
        testGame.setName("Fallout 4");
        testGame.setPlatform("PS4");
        testGame.setYearReleased("2015");
        assertEquals(true, testGame.validate());
    }

    @Test
    public void validate_falseName()throws InvalidDataTypeException {
        testGame.setPlatform("PS4");
        testGame.setYearReleased("2015");
        assertEquals(false, testGame.validate());
    }

    @Test
    public void validate_falsePlatform()throws InvalidDataTypeException {
        testGame.setName("Fallout 4");
        testGame.setYearReleased("2015");
        assertEquals(false, testGame.validate());
    }

    @Test
    public void validate_falseYear()throws InvalidDataTypeException {
        testGame.setName("Fallout 4");
        testGame.setPlatform("PS4");
        assertEquals(false, testGame.validate());
    }

}
