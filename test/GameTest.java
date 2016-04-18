/**
 * Created by cheey on 4/17/2016.
 */

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class GameTest {
    @Test
    public void setGameName(){
        Game game = new Game();
        game.setGameTitle("League of Legends");
        assertEquals("League of Legends", game.getGameTitle());
    }

    @Test
    public void addGamerTag(){
        Game game = new Game();
        game.addGamerTag("awesome");
        ArrayList<String> gamerTag = game.getGamerTag();
        assertEquals("awesome", game.getGamerTag());
    }


}
