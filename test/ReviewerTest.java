import edu.htc.gamereview.Game;
import edu.htc.gamereview.InvalidDataTypeException;
import edu.htc.gamereview.Reviewer;
import org.junit.rules.ExpectedException;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

/**
 * Created by clifford.mauer on 4/20/2016.
 */
public class ReviewerTest {

    @Test(expected = InvalidDataTypeException.class)
    public void Reviewer_withNoName() throws InvalidDataTypeException {
        //**Create the object
        Reviewer reviewer = new Reviewer();
        reviewer.setName("");
    }

    @Test(expected = InvalidDataTypeException.class)
    public void Reviewer_withNullName() throws InvalidDataTypeException {
        //**Create the object
        Reviewer reviewer = new Reviewer();
        reviewer.setName(null);
    }

    @Test
    public void Reviewer_withValidUserName() throws InvalidDataTypeException {
        //**Create the object
        Reviewer reviewer = new Reviewer();
        reviewer.setUserName("cmauer69");

        assertEquals("cmauer69", reviewer.getUserName().toString());

    }

    @Test
    public void Reviewer_withFirstFavoriteGame() throws InvalidDataTypeException {

        //**Create the object
        Reviewer reviewer = new Reviewer();
        Game game = new Game();
        //** add a tag

        reviewer.addFavoriteGame(game) ;
        assertEquals(reviewer.getFavoriteGames().size(), 1);
        assertEquals(reviewer.getFavoriteGames().get(0), game);


    }

    @Test
    public void Reviewer_withSecondTag() throws InvalidDataTypeException {

        //**Create the object
        Reviewer reviewer = new Reviewer();
        Game game1 = new Game();
        Game game2 = new Game();


         //** add a tag

        reviewer.addFavoriteGame(game1);
        reviewer.addFavoriteGame(game2);
        assertEquals(reviewer.getFavoriteGames().size(), 2);
        assertEquals(reviewer.getFavoriteGames().get(1), game2);



    }

    @Test (expected = InvalidDataTypeException.class)
    public void Reviewer_withNullAge() throws InvalidDataTypeException {
        //**Create the object
        Reviewer reviewer = new Reviewer();
        reviewer.setAge(null) ;
    }

    @Test  (expected = InvalidDataTypeException.class)
    public void Reviewer_withAgeLessThanThirteen() throws InvalidDataTypeException {
        //**Create the object
        Reviewer reviewer = new Reviewer();
        reviewer.setAge(1) ;

    }

    @Test (expected = InvalidDataTypeException.class)
    public void Reviewer_withNullGender() throws InvalidDataTypeException {
        //**Create the object
        Reviewer reviewer = new Reviewer();
        reviewer.setGender(null);
    }

    @Test (expected = InvalidDataTypeException.class)
    public void Reviewer_withEmptyStringGender() throws InvalidDataTypeException {
        //**Create the object
        Reviewer reviewer = new Reviewer();
        reviewer.setGender("");
    }

    @Test(expected = InvalidDataTypeException.class)
    public void Reviewer_withNoUserName() throws InvalidDataTypeException {
        //**Create the object
        Reviewer reviewer = new Reviewer();
        reviewer.setUserName("");
    }

    @Test(expected = InvalidDataTypeException.class)
    public void Reviewer_withNullUserName() throws InvalidDataTypeException {
        //**Create the object
        Reviewer reviewer = new Reviewer();
        reviewer.setUserName(null);
    }

    @Test (expected = InvalidDataTypeException.class)
    public void validate_noName() throws InvalidDataTypeException {
        Reviewer reviewer = new Reviewer();

        reviewer.setUserName("");
        reviewer.setPassword("Password");

        assertFalse(reviewer.validate());

    }

    @Test (expected = InvalidDataTypeException.class)
    public void validate_noPassword() throws InvalidDataTypeException {
        Reviewer reviewer = new Reviewer();

        reviewer.setUserName("cmauer69");
        reviewer.setPassword("");

        assertFalse(reviewer.validate());

    }
}

