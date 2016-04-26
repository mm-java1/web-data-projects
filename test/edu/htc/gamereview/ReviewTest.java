package edu.htc.gamereview;

import static org.junit.Assert.assertEquals;
import java.util.Date;
import org.junit.Test;

 /* Created by Sam on 4/10/2016.
 */
public class ReviewTest {
    @Test
    public void createReviewandGetinstances(){
        Game game = new Game("The Sims 4");
        Reviewer reviewer = new Reviewer("sam123", "12345");
        Review review = new Review(4,reviewer,game, "Fun way to pass the time");
        assertEquals(4,review.getStarRating());
        assertEquals(reviewer, review.getReviewer());
        assertEquals(game, review.getGame());
        assertEquals("Fun way to pass the time", review.getComments());
    }

     @Test
     public void setAndGetTime(){
         Game game = new Game("The Sims 4");
         Reviewer reviewer = new Reviewer("sam123", "12345");
         Review review = new Review(4,reviewer,game, "Fun way to pass the time");
         Date currentDate = new Date(2016,04,10);
         review.setDate(currentDate);
         assertEquals(currentDate, review.getDate());
     }

}
