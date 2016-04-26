package edu.htc;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Joel on 4/24/2016.
 */
public class GameTest {

    @Test
    public void addReview_fromEmpty(){
        Game game = new Game();
        Review review = new Review();

        game.addReview(review);
        assertEquals(1, game.getLiReviews().size());
        assertEquals(review, game.getLiReviews().get(0));
    }
    @Test
    public void addAvgRate_tohigh(){
        Game game = new Game();
        Review review = new Review();

        game.setAvgRate(6);
        game.getAvgRate();
        assertEquals(null, game.getAvgRate());
        assertEquals(6, game.getAvgRate());

    }
    @Test
    public void addAvgRate_tolow(){
        Game game = new Game();
        Review review = new Review();

        game.setAvgRate(-1);
        game.getAvgRate();
        assertEquals(null, game.getAvgRate());
        assertEquals(-1, game.getAvgRate());

    }
    @Test
    public void addAvgRate_inrange(){
        Game game = new Game();
        Review review = new Review();

        game.setAvgRate(3);
        game.getAvgRate();

        assertEquals(3, game.getAvgRate());
        assertEquals(3, game.getAvgRate());

    }

}
