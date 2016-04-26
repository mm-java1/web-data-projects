package edu.htc.game.review;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Joel on 4/24/2016.
 */
public class GameTest {

    @Test (expected = InvalidDataTypeException.class)
    public void setName_Null() throws  InvalidDataTypeException {
        Game testGame = new Game();
        testGame.setName(null);
    }

    @Test (expected = InvalidDataTypeException.class)
    public void setName_Empty() throws InvalidDataTypeException {
        Game testGame = new Game();
        testGame.setName(" ");
    }

    @Test
    public void setName() throws InvalidDataTypeException {
        Game testGame = new Game();
        String name = "Game Name";
        testGame.setName(name);
        assertEquals(name, testGame.getName());
    }

    @Test (expected = InvalidDataTypeException.class)
    public void addReview_nullReview() throws InvalidDataTypeException {
        Game testGame = new Game();
        testGame.addReview(null);
    }

    @Test
    public void addReview() throws InvalidDataTypeException {
        Game testGame = new Game();
        Review review = new Review();
        testGame.addReview(review);

        assertEquals(1, testGame.getLiReviews().size());
        assertEquals(review, testGame.getLiReviews().get(0));
    }

    @Test
    public void validate_noName(){
        Game testGame = new Game();

    }
    @Test
    public void validate_noPlatform() throws InvalidDataTypeException {
        Game testGame = new Game();
        testGame.setName("Somename");
        testGame.setYearReleased("1999");

    }
    @Test
    public void validate_noYear() throws InvalidDataTypeException {
        Game testGame = new Game();
        testGame.setPlatform("PC");

    }
    @Test
    public void valiate() throws InvalidDataTypeException {
        Game testGame = new Game();
        testGame.setName("Somename");
        testGame.setYearReleased("1999");
        testGame.setPlatform("PC");

        assertTrue(testGame.validate());
    }

    @Test
    public void addAvgRate_tohigh(){
        Game game = new Game();
        Review review = new Review();

        game.setAvgRate(6);
        game.getAvgRate();
        assertEquals(null, game.getAvgRate());
        assertEquals(6, game.getAvgRate());

    }
    @Test
    public void addAvgRate_tolow(){
        Game game = new Game();
        Review review = new Review();

        game.setAvgRate(-1);
        game.getAvgRate();
        assertEquals(null, game.getAvgRate());
        assertEquals(-1, game.getAvgRate());

    }
    @Test
    public void addAvgRate_inrange(){
        Game game = new Game();
        Review review = new Review();

        game.setAvgRate(3);
        game.getAvgRate();

        assertEquals(3, game.getAvgRate());
        assertEquals(3, game.getAvgRate());

    }

}
