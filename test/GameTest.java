import edu.htc.Game;
import edu.htc.Review;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Gyan on 4/18/2016.
 */
public class GameTest {

    @Test
    public void addReviewList_fromEmpty(){
        Game game = new Game();
        Review review = new Review(4,"Cool game!");

        game.addReview(review);
        assertEquals(1,game.getListReview().size());


    }
//    @Test
//    public void game() {
//        Game game = new Game("Fifa 2016",2016,"PC, PlayStation, Xbox 360", "Soccer",4);
//        assertEquals("Fifa 2016", game.getGameName());
//        assertEquals(2016, game.getReleaseYear());
//        assertEquals("PC, PlayStation, Xbox 360", game.getPlatform());
//        assertEquals("Soccer", game.getTag());
//        assertEquals(4, game.getAvgRating());
//
//
//    }

}
