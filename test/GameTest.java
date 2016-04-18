import edu.htc.Game;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Gyan on 4/18/2016.
 */
public class GameTest {
    @Test
    public void game() {
        Game game = new Game("Fifa 2016",2016,"PC, PlayStation, Xbox 360", "Soccer",4);
        assertEquals("Fifa 2016", game.getGameName());
        assertEquals(2016, game.getReleaseYear());
        assertEquals("PC, PlayStation, Xbox 360", game.getPlatform());
        assertEquals("Soccer", game.getTag());
        assertEquals(4, game.getAvgRating());


    }


}
