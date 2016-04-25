import edu.htc.MoonflowerGameReview.Game;
import org.junit.rules.ExpectedException;
import edu.htc.MoonflowerGameReview.InvalidDataTypeException;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by clifford.mauer on 4/20/2016.
 */
public class GameTest {

    @Test (expected = InvalidDataTypeException.class)
    public void Game_withNoName() throws InvalidDataTypeException {
        //**Create the object
        Game game = new Game();
        game.setName("");
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
        game.setName(null);
    }

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
        Game game = new Game();
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
        //** add a tag

        game.addReview("FirstReview") ;
        assertEquals(game.getReviews().size(), 1);
        assertEquals(game.getReviews().get(0), "FirstReview");


    }

    @Test
    public void Game_withSecondReview() throws InvalidDataTypeException {

        //**Create the object
        Game game = new Game();
        game.setName("MineCraft");
        //** add a tag

        game.addReview("FirstReview");
        game.addReview("SecondReview");

        assertEquals(game.getReviews().size(), 2);
        assertEquals(game.getReviews().get(1), "SecondReview");


    }

    @Test (expected = InvalidDataTypeException.class)
    public void Game_withGameDateBefore1947() throws InvalidDataTypeException {

        //**Create the object
        Game game = new Game();
        game.setName("MineCraft");
       //** add a game date
        game.setReleaseDate(1847);

    }

    @Test (expected = InvalidDataTypeException.class)
    public void Game_withGameDateInTheFuture() throws InvalidDataTypeException {

        //**Create the object
        Game game = new Game();
        game.setName("MineCraft");
        //** add a game date
        game.setReleaseDate(2019);

    }

}
