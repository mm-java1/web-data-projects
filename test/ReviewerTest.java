import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;
/**
 * Created by Sam on 4/10/2016.
 */
public class ReviewerTest {
    @Test
    public void createReviewer_testGet(){
        Reviewer reviewer = new Reviewer("sam123", "123");
        assertEquals("sam123", reviewer.getUsername());
        assertEquals("123", reviewer.getPassword());
    }

    @Test
    public void setAndGetNameGenderAge(){
        Reviewer reviewer = new Reviewer("sam123", "123");
        reviewer.setAge(32);
        reviewer.setGender("female");
        reviewer.setName("Sam");
        assertEquals("Sam", reviewer.getName());
        assertEquals(32, reviewer.getAge());
        assertEquals("female", reviewer.getGender());

    }

    @Test
    public void setAndgetProfile(){
        Reviewer reviewer = new Reviewer("sam123", "123");
        reviewer.setProfile("I am a gamer!");
        assertEquals("I am a gamer!", reviewer.getProfile());
    }

    @Test
    public void setAndSeeFavorites(){
        Reviewer reviewer = new Reviewer("sam123", "123");
        Game game = new Game("Fallout 4");
        reviewer.addFav(game);
        assertEquals(1, reviewer.favorites.size());
    }
}
