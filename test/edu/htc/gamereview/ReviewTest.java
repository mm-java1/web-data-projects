package edu.htc.gamereview; /**
 * Created by cheey on 4/17/2016.
 */

import edu.htc.gamereview.InvalidDataTypeException;
import edu.htc.gamereview.Review;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void setRating() throws InvalidDataTypeException {
        Review review = new Review();
        review.setStarRating(3);
        assertEquals(3, review.getStarRating());
    }

    @Test (expected = InvalidDataTypeException.class)
    public void setInvalidRating() throws InvalidDataTypeException {
        Review review = new Review();
        review.setStarRating(9);
        assertEquals(9, review.getStarRating());
    }

    @Test
    public void setGameTitle()throws InvalidDataTypeException {
        Review review = new Review();
        Game game = new Game();
        game.setName("Guild War");
        assertEquals("Guild War", game.getName());
    }

    @Test (expected = InvalidDataTypeException.class)
    public void setInvalidGameTitle()throws InvalidDataTypeException {
        Review review = new Review();
        Game game = new Game();
        game.setName("");
        assertEquals("", review.getGameTitle());
    }

    @Test
    public void setReviewer () throws InvalidDataTypeException {
        Review review = new Review();
        Reviewer reviewer = new Reviewer();
        review.setReviewer(reviewer);
        assertTrue(reviewer != null);
    }

    @Test
    public void validData()throws InvalidDataTypeException{
        Review review = new Review();
        Game game = new Game();
        Reviewer reviewer = new Reviewer();

        review.setReviewer(reviewer);
        review.setComments("BEST FIFA");
        game.setName("FIFA 2016");
        review.setDate(new Date());
        review.setStarRating(5);
        assertTrue(review.validate());
    }
    @Test (expected = InvalidDataTypeException.class)
    public void invalidData()throws InvalidDataTypeException{
        Review review = new Review();
        Game game = new Game();
        game.setName("Viva la FIFA!");
        review.setDate(new Date());
        review.setStarRating(100);
        assertFalse(review.validate() == false);}
    //assertFalse(); //--IMPORT
//
    @Test
    public void setDate() throws  InvalidDataTypeException {
        Review review = new Review();
        review.setDate(new Date());
    }
}
