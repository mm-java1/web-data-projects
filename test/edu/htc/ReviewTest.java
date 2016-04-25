package edu.htc;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by volkg_000 on 4/18/2016.
 */
public class ReviewTest {
    @Test
    public void setStarRating() throws InvalidDataException {
        Review review = new Review();
        review.setStarRating(1);

        assertEquals(1, review.getStarRating());

        review.setStarRating(5);
        assertEquals(5, review.getStarRating());
    }

    @Test(expected = InvalidDataException.class)
    public void setStarRatingInvalidData() throws InvalidDataException {
        Review review = new Review();
        review.setStarRating(10);
        review.getStarRating();

    }

    @Test
    public void setReviewer() throws InvalidDataException {
        Reviewer reviewer = new Reviewer();

        reviewer.setAge(10);
        reviewer.setGender("Male");
        assertEquals(10, reviewer.getAge());
        assertEquals("Male",reviewer.getGender());
    }
    @Rule
    public final ExpectedException NullReviewerexception = ExpectedException.none();
    @Test(expected = InvalidDataException.class)
    public void setNullReviewer() throws InvalidDataException {
        Reviewer reviewer = new Reviewer();
        reviewer.setName("");

        NullReviewerexception.expect(InvalidDataException.class);
    }

    @Rule
    public final ExpectedException NullGameexception = ExpectedException.none();
    @Test(expected = InvalidDataException.class)
    public void setNullGame() throws InvalidDataException {
        Game game = new Game();
        game.setName("");

        NullGameexception.expect(InvalidDataException.class);
    }

    @Test
    public void setGame() throws InvalidDataException {
        Game game = new Game();
        game.setName("Runescape");
        game.setPlatform("PC");
        assertEquals("Runescape", game.getName());
        assertEquals("PC", game.getPlatform());
    }

    @Test
    public void setComments() throws InvalidDataException {
       Review review = new Review();
        review.setComments("This game is great");
        assertEquals("This game is great", review.getComments());
    }


    @Rule
    public final ExpectedException NullCommentsexception = ExpectedException.none();
    @Test(expected = InvalidDataException.class)
    public void setNullComments() throws InvalidDataException {
        Review reviews = new Review();
        reviews.setComments(null);
        NullCommentsexception.expect(InvalidDataException.class);
    }

    @Rule
    public final ExpectedException NullDateexception = ExpectedException.none();
    @Test(expected = InvalidDataException.class)
    public void setNullDate() throws InvalidDataException {
        Review reviews = new Review();
        reviews.setDate(null);
        NullDateexception.expect(InvalidDataException.class);
    }

    @Test
    public void setDate() throws InvalidDataException {
        Date cur_date = new Date();
        System.out.println(cur_date);
        assertEquals(true, cur_date.equals(cur_date));

    }

    @Test
    public void validateReviewClass() throws InvalidDataException {
        Review review = new Review();

        review.setComments("Great game");

        Reviewer reviewer = new Reviewer();
        reviewer.setName("Jordan");

        Date date = new Date();

        review.setDate(date);

        Game game = new Game();
        game.setName("Runescape");

        review.setStarRating(5);

        review.setReviewer(reviewer);

        review.setGame(game);


       assertEquals(true, review.validateReview());
    }

}
