import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;


/**
 * Created by Administrator on 4/6/16.
 */
public class ReviewClassTest {
    Review review;


    @Before
    public void setup() {
        review = new Review();

    }

    /*
    STAR RATING
     */
    @Test(expected = InvalidDataTypeException.class)
    public void setStarRating_lessThanZero() throws InvalidDataTypeException {
        review.setStarRating(-1);
    }

    @Test(expected = InvalidDataTypeException.class)
    public void setStarRating_greaterThan5() throws InvalidDataTypeException {
        review.setStarRating(6);
    }

    @Test
    public void setStarRating() throws InvalidDataTypeException {
        int rating = 5;
        review.setStarRating(rating);
        assertEquals(rating, review.getStarRating());
    }

    /*
    SET REVIEWER
     */
    @Test
    public void setReviewer_isNull() {
        try {
            review.setStarRating(4);
        } catch (InvalidDataTypeException e) {
        }
        try {
            review.setReviewer(null);
        } catch (InvalidDataTypeException e) {
        }
    }
    @Test
    public void setReviewer() {
        try {
            review.setStarRating(4);
        } catch (InvalidDataTypeException e) {
        }
        try {
            review.setReviewer(new Reviewer());
        } catch (InvalidDataTypeException e) {
        }
        System.out.println(review.toString());
    }

    /*
    SET GAME
     */
    @Test
    public void setGame_isNull() {
        try {
            review.setStarRating(4);
        } catch (InvalidDataTypeException e) {
        }
        try {
            review.setGame(null);
        } catch (InvalidDataTypeException e) {
        }
    }
    @Test
    public void setGame() {
        try {
            review.setStarRating(4);
        } catch (InvalidDataTypeException e) {
            e.printStackTrace();
        }
        try {
            review.setGame(new Game());
        } catch (InvalidDataTypeException e) {
        }
        System.out.println(review.toString());
    }

    /*
    SET COMMENTS
     */
    @Test(expected = InvalidDataTypeException.class)
    public void setComments_isNull() throws InvalidDataTypeException {
        review.setComments(null);
    }

    @Test(expected = InvalidDataTypeException.class)
    public void setComments_isEmpty() throws InvalidDataTypeException {
        review.setComments("");
    }

    @Test
    public void setComments() throws InvalidDataTypeException {
        String comment = "Commentx";
        review.setComments(comment);
        assertEquals(comment, review.getComments());
    }

    /*
    SET REVIEw DATE
     */
    @Test(expected = InvalidDataTypeException.class)
    public void setReviewDate_isNull() throws InvalidDataTypeException {
        review.setDate(null);
    }

    @Test
    public void setReviewDate() throws InvalidDataTypeException {
        review.setDate(new Date());
    }

    /*
    VALIDATE RECORD
     */
    @Test(expected = InvalidDataTypeException.class)
    public void validateRecord_invalidRating() throws InvalidDataTypeException {
        review.setStarRating(-1);
        review.setReviewer(new Reviewer());
        review.setGame(new Game());
        review.setComments("comment1");
        review.setDate(new Date());

        System.out.println(review.toString());
        System.out.println(review.validateRecord() + " Should fail star rating and print false");
    }

    @Test
    public void validateRecord_invalidReviewer() throws InvalidDataTypeException {

        review.setStarRating(1);
        //review.setReviewer(new Reviewer());
        review.setGame(new Game());
        review.setComments("comment1");
        review.setDate(new Date());

        System.out.println(review.toString());
        System.out.println(review.validateRecord() + " Should fail missing reviewer and print false");
    }

    @Test
    public void validateRecord_invalidGame() throws InvalidDataTypeException {
        review.setStarRating(1);
        review.setReviewer(new Reviewer());
        //review.setGame(new Game());
        review.setComments("comment1");
        review.setDate(new Date());

        System.out.println(review.toString());
        System.out.println(review.validateRecord() + " Should fail missing game and print false");
    }

    @Test
    public void validateRecord_invalidComments() throws InvalidDataTypeException {
        review.setStarRating(1);
        review.setReviewer(new Reviewer());
        review.setGame(new Game());
        //review.setComments("comment1");
        review.setDate(new Date());

        System.out.println(review.toString());
        System.out.println(review.validateRecord() + " Should fail missing comment and print false");
    }

    @Test
    public void validateRecord_invalidDate() throws InvalidDataTypeException {
        review.setStarRating(1);
        review.setReviewer(new Reviewer());
        review.setGame(new Game());
        review.setComments("comment1");
        //review.setDate(new Date());

        System.out.println(review.toString());
        System.out.println(review.validateRecord() + " Should fail missing date and print false");
    }


}