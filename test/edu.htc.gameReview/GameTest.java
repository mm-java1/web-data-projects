package edu.htc.gameReview;

import edu.htc.gameReview.DataTypeInvalidException;
import edu.htc.gameReview.Game;
import edu.htc.gameReview.Review;
import org.junit.Before;
import org.junit.Test;

import javax.xml.crypto.Data;

import static org.junit.Assert.*;

/**
 * Created by Gyan on 4/18/2016.
 */
public class GameTest {

    private Game testGame;

    @Before
    public void setup(){
        testGame = new Game();
    }

    @Test(expected = DataTypeInvalidException.class)
    public void setName_Null()throws DataTypeInvalidException{
        testGame.setName(null);
    }

    @Test(expected = DataTypeInvalidException.class)
    public void setName_Empty() throws DataTypeInvalidException{
        testGame.setName(" ");
    }

    @Test
    public void setName() throws DataTypeInvalidException{
        String name = "Call of Duty";
        testGame.setName(name);
        assertEquals("Call of Duty",testGame.getName());
    }

    @Test
    public void addReview() throws DataTypeInvalidException{
        Review review = new Review();
        testGame.addReview(review);
        assertEquals(1,testGame.getReviews().size());
        assertEquals(review, testGame.getReviews().get(0));
    }

    @Test
    public void validate_noName() throws DataTypeInvalidException {
        testGame.setReleaseYear("2014");
        testGame.setPlatform("PC");

        assertFalse(testGame.validate());
    }

    @Test
    public void validate_noPlatform() throws DataTypeInvalidException {
        testGame.setName("SomeName");
        testGame.setReleaseYear("2014");


        assertFalse(testGame.validate());
    }

    @Test
    public void validate_noYear() throws DataTypeInvalidException {
        testGame.setName("SomeName");
        testGame.setPlatform("PC");

        assertFalse(testGame.validate());
    }

    @Test
    public void validate() throws DataTypeInvalidException {
        testGame.setName("SomeName");
        testGame.setReleaseYear("2014");
        testGame.setPlatform("PC");

        assertTrue(testGame.validate());
    }



}
