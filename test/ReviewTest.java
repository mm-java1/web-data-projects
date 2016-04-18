/**
 * Created by cheey on 4/17/2016.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void setRating(){
        Review review = new Review();
        review.setStarRating(3);
        assertEquals(3, review.getStarRating());
    }

    @Test
    public void setGameTitle(){
        Review review = new Review();
        review.setGameTitle("Guild War");
        assertEquals("Guild War", review.getGameTitle());
    }
}
