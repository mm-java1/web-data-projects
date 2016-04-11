import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Created by Sam on 4/10/2016.
 */
public class GameTest {
    @Test
    public void setAndGetName(){
        Game game = new Game("Game");
        String name = game.getName();
        assertEquals(name, game.getName());
    }


    @Test
    public void setAndGetReleaseDate(){
        Game game = new Game("Game");
        game.setReleaseDate(2005);
        assertEquals(2005, game.getReleaseDate());
    }

    @Test
    public void setAndGetPlatform(){
        Game game = new Game("Game");
        game.setPlatform("PlayStation4");
        assertEquals("PlayStation4", game.getPlatform());
    }

    @Test
    public void setAndGetRating(){
        Game game = new Game("Game");
        game.setAverageRating(4);
        assertEquals(4, game.getAverageRating());
    }

    @Test
    public void setAndSeeTag(){
        Game game = new Game("Game");
        game.addTag("Fantasy");
        game.seeTags();
    }

    @Test
    public void setAndSeeReview(){
        Game game = new Game("Game");
        game.addReview("Awesome!");
        game.seeReviews();
    }

}
