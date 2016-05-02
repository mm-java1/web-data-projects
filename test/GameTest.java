import edu.htc.gamereview.Game;
import edu.htc.gamereview.Review;
import org.junit.Before;
import org.junit.rules.ExpectedException;
import edu.htc.gamereview.InvalidDataTypeException;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;


/**
 * Created by clifford.mauer on 4/20/2016.
 */
public class GameTest {

    private Game game;

    @Before
    public void setup(){
        game = new Game();
}

    @Test (expected = InvalidDataTypeException.class)
    public void Game_withNoName() throws InvalidDataTypeException {
        //**Create the object
        game.setName("");
        //** also need " "

    }

    @Test  (expected = InvalidDataTypeException.class)
    public void Game_withNullName() throws InvalidDataTypeException{
        //**Create the object
        Game game = new Game();
        //**Test the procedure
        game.setName(null);
      }

    @Test (expected = InvalidDataTypeException.class)
    public void Game_withNoPlatform() throws InvalidDataTypeException {
        //**Create the object
        Game game = new Game();
        game.setPlatform("");
    }

    @Test  (expected = InvalidDataTypeException.class)
    public void Game_withNullPlatform() throws InvalidDataTypeException{
        //**Create the object
        Game game = new Game();
        //**Test the procedure
        game.setPlatform(null);
    }

    //** Entering a number as a game name should be ok

    @Test  (expected = InvalidDataTypeException.class)
    public void Game_withNumberAsName() throws InvalidDataTypeException{
        //**Create the object
        Game game = new Game();
        //**Test the procedure
        game.setName("123");
    }

    @Test
    public void Game_withStringAsName() throws InvalidDataTypeException{
        //**Create the object
        Game game = new Game();
        //**Test the procedure
        game.setName("cliff");
        assertEquals("cliff", game.getName().toString());
    }

    @Test (expected = InvalidDataTypeException.class)
    public void Game_withnullTag() throws InvalidDataTypeException {

        //**Create the object
        Game game = new Game();
        game.setName("MineCraft");
        //** add a tag

        game.addTag(null);


    }

    @Test
    public void Game_withFirstTag() throws InvalidDataTypeException {

        //**Create the object
        Game game = new Game();
        game.setName("MineCraft");
        //** add a tag

        game.addTag("subscriptions");
        assertEquals(game.getTags().size(), 1);
        assertEquals(game.getTags().get(0), "subscriptions");


    }

    @Test
    public void Game_withSecondTag() throws InvalidDataTypeException {

        //**Create the object
       game.setName("MineCraft");
        //** add a tag

        game.addTag("subscriptions");
        game.addTag("single/multiplayer");

        assertEquals(game.getTags().size(), 2);
        assertEquals(game.getTags().get(1), "single/multiplayer");


    }

    @Test
    public void Game_withFirstReview() throws InvalidDataTypeException {

        //**Create the object
        Game game = new Game();
        game.setName("MineCraft");

        //Create a review
        Review review = new Review();

        //** add a review

        game.addReview(review) ;
        assertEquals(game.getReviews().size(), 1);
        assertEquals(game.getReviews().get(0), review);


    }

    @Test
    public void Game_withSecondReview() throws InvalidDataTypeException {

        //**Create the object
        Game game = new Game();
        game.setName("MineCraft");

        // Create 2 reviews
        Review review1 = new Review();
        Review review2 = new Review();

        //** add two reviews

        game.addReview(review1);
        game.addReview(review2);

        assertEquals(game.getReviews().size(), 2);
        assertEquals(game.getReviews().get(1), review2);


    }

    @Test (expected = InvalidDataTypeException.class)
    public void Game_withGameDateBefore1947() throws InvalidDataTypeException {

        //**Create the object
        Game game = new Game();
        game.setName("MineCraft");
       //** add a game date
        game.setReleaseDate("1847");

    }

    @Test (expected = InvalidDataTypeException.class)
    public void Game_withGameDateInTheFuture() throws InvalidDataTypeException {

        //**Create the object
        Game game = new Game();
        game.setName("MineCraft");
        //** add a game date
        game.setReleaseDate("2019");

    }

    @Test (expected = InvalidDataTypeException.class)
        public void addReview_NullReview() throws InvalidDataTypeException {
            game.addReview(null);

    }

    //** also test validate()

    @Test
    public void validate_noName() throws InvalidDataTypeException {
        game.setReleaseDate("1999");
        game.setPlatform("PC");

        assertFalse(game.validate());

    }

    @Test
    public void validate_noReleaseDate() throws InvalidDataTypeException {
        game.setName("War of the Worlds");
        game.setPlatform("PC");

        assertFalse(game.validate());

    }

    @Test
    public void validate_noPlatform() throws InvalidDataTypeException {
        game.setName("War of the Worlds");
        game.setReleaseDate("1999");

        assertFalse(game.validate());

    }

}
