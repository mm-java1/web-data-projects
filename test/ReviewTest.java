import edu.htc.Review;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Gyan on 4/18/2016.
 */
public class ReviewTest {
    @Test
    public void review(){
        Review review = new Review(5,"John","Tennis","Cool game!",2016);
        assertEquals(5, review.getStarRating());
        assertEquals("John", review.getReviewer());
        assertEquals("Tennis", review.getGame());
        assertEquals("Cool game!", review.getComments());
        assertEquals(2016, review.getDate());

    }
}
