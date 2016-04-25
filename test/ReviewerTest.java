import edu.htc.MoonflowerGameReview.Game;
import edu.htc.MoonflowerGameReview.InvalidDataTypeException;
import edu.htc.MoonflowerGameReview.Reviewer;
import org.junit.rules.ExpectedException;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

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

    @Test
    public void Reviewer_withFirstFavoriteGame() throws InvalidDataTypeException {

        //**Create the object
        Reviewer reviewer = new Reviewer();
        //** add a tag

        reviewer.addFavoriteGame("World of War") ;
        assertEquals(reviewer.getFavoriteGames().size(), 1);
        assertEquals(reviewer.getFavoriteGames().get(0), "World of War");


    }

    @Test
    public void Reviewer_withSecondTag() throws InvalidDataTypeException {

        //**Create the object
        Reviewer reviewer = new Reviewer();

         //** add a tag

        reviewer.addFavoriteGame("World of War");
        reviewer.addFavoriteGame("MineCraft");
        assertEquals(reviewer.getFavoriteGames().size(), 2);
        assertEquals(reviewer.getFavoriteGames().get(1), "MineCraft");


    }

}

