package edu.htc.gamereview; /**
 * Created by cheey on 4/17/2016.
 */

import edu.htc.gamereview.Game;
import edu.htc.gamereview.InvalidDataTypeException;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class GameTest {
    @Test
    public void setGameName()throws InvalidDataTypeException {
        Game game = new Game();
        game.setName("League of Legends");
        assertEquals("League of Legends", game.getName());
    }

    @Test (expected =  InvalidDataTypeException.class)
    public void gameNameWithInvalidInput() throws InvalidDataTypeException{
        Game game = new Game();
        game.setName("");
        assertEquals("", game.getName());
    }


    @Test
    public void addGamerTag() throws InvalidDataTypeException {
        Game game = new Game();
        game.addTag("awesome");
        ArrayList<String> gamerTag = game.getGamerTag();

        assertEquals(game.getGamerTag(), game.getGamerTag());
    }

    @Test
    public void validDate() throws InvalidDataTypeException {
        Game game = new Game();
        game.setYearReleased("1989");
        assertEquals("1989", game.getYearReleased());
    }

    @Test
    public void validPlatform() throws InvalidDataTypeException {
        Game game = new Game();
        game.setPlatform("PS4");
        assertEquals("PS4", game.getPlatform());
    }

    @Test (expected = InvalidDataTypeException.class)
    public void invalidDate() throws InvalidDataTypeException {
        Game game = new Game();
        game.setYearReleased("");
        assertTrue(game.validate() == false);
    }

    @Test
    public void validData()throws InvalidDataTypeException{
        Game game = new Game();
        game.setName("CastleVania");
        game.setPlatform("PS4");
        game.setYearReleased("1999");
        assertTrue(game.validate() == true);
    }

    @Test (expected = InvalidDataTypeException.class)
    public void invalidData_Date() throws InvalidDataTypeException {
        Game game = new Game();
        game.setName("FIFA");
        game.setAverageRating(4);
        game.setYearReleased("");
        assertTrue(game.validate() == false);
    }

    @Test //(expected = InvalidDataTypeException.class)
    public void invalidDaata_Rating() throws InvalidDataTypeException {
        Game game = new Game();
        game.setName("FIFA");
        game.setAverageRating(60);
        game.setYearReleased("1999");
        assertTrue(game.validate() == false);
    }

    @Test (expected = InvalidDataTypeException.class)
    public void invalidData_Name()throws InvalidDataTypeException{
        Game game = new Game();
        game.setName("");
        game.setPlatform("PS4");
        game.setYearReleased("1999");
        assertTrue(game.validate() == true);
    }






}
