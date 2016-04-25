/**
 * Created by cheey on 4/17/2016.
 */
import java.util.Date;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void setRating() throws InvalidDataTypeException {
        Review review = new Review();
        review.setStarRating(3);
        assertEquals(3, review.getStarRating());
    }

    @Test
    public void setInvalidRating() throws InvalidDataTypeException {
        Review review = new Review();
        review.setStarRating(99);
        assertEquals(99, review.getStarRating());
    }

    @Test
    public void setGameTitle()throws InvalidDataTypeException {
        Review review = new Review();
        review.setGameTitle("Guild War");
        assertEquals("Guild War", review.getGameTitle());
    }

    @Test (expected = InvalidDataTypeException.class)
    public void setInvalidGameTitle()throws InvalidDataTypeException {
        Review review = new Review();
        review.setGameTitle("FFX");
        assertEquals("FFX", review.getGameTitle());
    }

    @Test
    public void validData()throws InvalidDataTypeException{
        Review review = new Review();
        review.setGameTitle("FIFA 2016");
        review.setDate(review.date);
        review.setStarRating(5);
        assertTrue(review.validInfo = true);
    }
    @Test (expected = InvalidDataTypeException.class)
    public void invalidData()throws InvalidDataTypeException{
        Review review = new Review();
        review.setGameTitle("Viva la FIFA!");
        review.setDate(review.date);
        review.setStarRating(100);
        assertTrue(review.validInfo = true);}

    @Test
    public void setDate() {
        Review review = new Review();
        review.setDate(review.getDate());
    }
}
