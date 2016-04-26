package edu.htc.gamereview;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by volkg_000 on 4/19/2016.
 */
public class GameTest {





    @Rule
    public final ExpectedException EmptyGameNameexception = ExpectedException.none();
    @Test(expected = InvalidDataException.class)
    public void setEmptyGameName() throws InvalidDataException {
        Game game = new Game();
        game.setName("");

        EmptyGameNameexception.expect(InvalidDataException.class);
    }

    @Rule
    public final ExpectedException NullGameNameexception = ExpectedException.none();
    @Test(expected = InvalidDataException.class)
    public void setNullGameName() throws InvalidDataException {
        Game game = new Game();
        game.setName(null);

        NullGameNameexception.expect(InvalidDataException.class);
    }



    @Test
    public void setValidGameName() throws InvalidDataException {
        Game game = new Game();
        game.setName("dota2");

        assertEquals("dota2", game.getName());
    }

    @Rule
    public final ExpectedException InvalidReleaseDateexception = ExpectedException.none();
    @Test(expected = InvalidDataException.class)
    public void setInvalidReleaseDate() throws InvalidDataException {
        Game game = new Game();
        game.setReleaseDate("0");
        System.out.println(game.getReleaseDate());

        InvalidReleaseDateexception.expect(InvalidDataException.class);
    }

    @Test
    public void setValidReleaseDate() throws InvalidDataException {
        Game game = new Game();
        game.setReleaseDate("2016");

        assertEquals("2016", game.getReleaseDate());
    }

    @Test
    public void setValidPlatform() throws InvalidDataException {
        Game game = new Game();
        game.setPlatform("PC");

        assertEquals("PC", game.getPlatform());

        Game game2 = new Game();
        game2.setPlatform("PS4");

        assertEquals("PS4", game2.getPlatform());

        Game game3 = new Game();
        game3.setPlatform("Xbox One");

        assertEquals("Xbox One", game3.getPlatform());


    }

    @Rule
    public final ExpectedException EmptyPlatformexception = ExpectedException.none();
    @Test(expected = InvalidDataException.class)
    public void setEmptyPlatform() throws InvalidDataException {
        Game game = new Game();
        game.setPlatform("");

        EmptyPlatformexception.expect(InvalidDataException.class);
    }

    @Rule
    public final ExpectedException InvalidPlatformexception = ExpectedException.none();
    @Test(expected = InvalidDataException.class)
    public void setInvalidPlatform() throws InvalidDataException {
        Game game = new Game();
        game.setPlatform(null);

        InvalidPlatformexception.expect(InvalidDataException.class);
    }

    @Test
    public void addReviewFromEmpty() throws InvalidDataException {
        Review review = new Review();
        Game game = new Game();

        review.setComments("Great game");
        game.addReview(review);

        assertEquals(1, game.getReviews().size());
        assertEquals("Great game", review.getComments());
    }

    @Test(expected = InvalidDataException.class)
    public void addNullReview() throws InvalidDataException {
        Game game = new Game();
        game.addReview(null);
    }

    @Test
    public void addTagsFromEmpty() throws InvalidDataException {
        Game game = new Game();
        String tag = "FPS";

        game.addTag(tag);
        assertEquals(1, game.getTags().size());
        //assertEquals("FPS", game.getTags());

    }








}
