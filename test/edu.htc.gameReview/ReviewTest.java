package edu.htc.gameReview;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Gyan on 4/18/2016.
 */
public class ReviewTest {
    @Test
    public void review_starRatingValidNumber() throws DataTypeInvalidException {
        Review review = new Review();
        review.setStarRating(5);
        assertEquals(5, review.getStarRating());
    }

    @Test(expected = DataTypeInvalidException.class)
    public void review_starRatingInValidNumber() throws DataTypeInvalidException {
        Review review = new Review();
        review.setStarRating(6);

    }

    @Test(expected = DataTypeInvalidException.class)
    public void review_setReviewerNull() throws DataTypeInvalidException{
        Review review = new Review();
        review.setReviewer(null);
    }

    @Test(expected = DataTypeInvalidException.class)
    public void review_setGameNull() throws DataTypeInvalidException{
        Review review = new Review();
        review.setGame(null);

    }

    @Test(expected = DataTypeInvalidException.class)
    public void review_setCommentNull() throws DataTypeInvalidException{
        Review review = new Review();
        review.setComments(null);

    }

    @Test
    public void review_setComment() throws DataTypeInvalidException{
        Review review = new Review();
        review.setComments("This is cool game");
        assertEquals("This is cool game",review.getComments());

    }




}

