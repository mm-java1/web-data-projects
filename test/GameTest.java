/**
 * Created by cheey on 4/17/2016.
 */

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class GameTest {
    @Test
    public void setGameName()throws InvalidDataTypeException{
        Game game = new Game();
        game.setGameTitle("League of Legends");
        assertEquals("League of Legends", game.getGameTitle());
    }

    @Test (expected =  InvalidDataTypeException.class)
    public void gameNameWithInvalidInput() throws InvalidDataTypeException{
        Game game = new Game();
        game.setGameTitle("DOA");
        assertEquals("DOA", game.getGameTitle());
    }


    @Test
    public void addGamerTag(){
        Game game = new Game();
        game.addGamerTag("awesome");
        ArrayList<String> gamerTag = game.getGamerTag();

        assertEquals(game.getGamerTag(), game.getGamerTag());
    }

    @Test
    public void validData()throws InvalidDataTypeException{
        Game game = new Game();
        game.setGameTitle("FIFA");
        game.setAverageRating(4);
        game.setReleaseDate("1999");
        assertTrue(game.validInfo = true);
    }

    @Test (expected = InvalidDataTypeException.class)
    public void invalidDate() throws InvalidDataTypeException {
        Game game = new Game();
        game.setGameTitle("FIFA");
        game.setAverageRating(4);
        game.setReleaseDate("199");
        assertTrue(game.validInfo = false);
    }

    @Test (expected = InvalidDataTypeException.class)
    public void invalidRating() throws InvalidDataTypeException {
        Game game = new Game();
        game.setGameTitle("FIFA");
        game.setAverageRating(600);
        game.setReleaseDate("1999");
        assertTrue(game.validInfo = false);
    }




}
