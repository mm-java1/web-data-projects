package edu.htc.gamereview;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


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

    @Test (expected = InvalidDataTypeException.class)
    public void setName() throws InvalidDataTypeException {
        testGame.setName("Fallout 4");
        assertEquals("Fallout 4", testGame.getName());
    }


    @Test(expected = InvalidDataTypeException.class)
    public void addReview_Null() throws InvalidDataTypeException{
        testGame.addReview(null);
    }
    

    @Test(expected = InvalidDataTypeException.class)
    public void addReview() throws InvalidDataTypeException{
        Review review = new Review;
        testGame.addReview(review);
        assertEquals(1, testGame.getReviews().size());
        assertEquals(testGame.getReviews().get(0), review);
    }




}
