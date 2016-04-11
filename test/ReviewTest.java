import static org.junit.Assert.assertEquals;
import java.util.Date;
import org.junit.Test;

 /* Created by Sam on 4/10/2016.
 */
public class ReviewTest {
    @Test
    public void createReviewandGetinstances(){
        Review review = new Review(4,"sam123","The Sims 4", "Fun way to pass the time");
        assertEquals(4,review.getStarRating());
        assertEquals("sam123", review.getReviewer());
        assertEquals("The Sims 4", review.getGame());
        assertEquals("Fun way to pass the time", review.getComments());
    }

     @Test
     public void setAndGetTime(){
         Review review = new Review(4,"sam123","The Sims 4", "Fun way to pass the time");
         Date currentDate = new Date(2016,04,10);
         review.setDate(currentDate);
         assertEquals(currentDate, review.getDate());
     }

}
