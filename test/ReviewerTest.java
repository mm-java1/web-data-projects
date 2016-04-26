import edu.htc.Game;
import edu.htc.Reviewer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Gyan on 4/18/2016.
 */
public class ReviewerTest {
    @Test
    public void addFavGameList_fromEmpty(){
        Reviewer reviewer = new Reviewer();
        Game game = new Game();
        game.setGameName("Call of Duty");

        reviewer.addFavGameList(game);
        assertEquals(1,reviewer.getFavGamelists().size());



    }
}
