package edu.htc.gamereview;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by karennilson on 4/17/16.
 */
public class GameTest {
    private Game testGame;

    @Before
    public void setup(){
        testGame = new Game();
    }

    @Test(expected = InvalidDataTypeException.class)
    public void setName_Null() throws InvalidDataTypeException {
        testGame.setName(null);
    }

    @Test(expected = InvalidDataTypeException.class)
    public void setName_Empty() throws InvalidDataTypeException {
        testGame.setName(" ");
    }

    @Test
     public void setName() throws InvalidDataTypeException{
            String name = "Game Name";
            testGame.setName(name);
            assertEquals(name, testGame.getName());
        }

    @Test (expected = InvalidDataTypeException.class)
    public void addReview_NullReview() throws InvalidDataTypeException{
        testGame.addReview(null);
    }

    @Test
    public void addReview() throws InvalidDataTypeException{
        Review review = new Review();
        testGame.addReview(review);

        assertEquals(1, testGame.getReviews().size());
        assertEquals(review, testGame.getReviews().get(0));

    }

    @Test
    public void validate_noName() throws InvalidDataTypeException{
        testGame.setYearReleased("1999");
        testGame.setPlatform("PC");

        assertFalse(testGame.validate());
    }

    @Test
    public void validate_noPlatform() throws InvalidDataTypeException{
        testGame.setName("SomeName");
        testGame.setYearReleased("1999");

        assertFalse(testGame.validate());
    }

    @Test
    public void validate_noYear() throws InvalidDataTypeException{
        testGame.setName("SomeName");
        testGame.setPlatform("PC");

        assertFalse(testGame.validate());

    }

    @Test
    public void validate() throws InvalidDataTypeException {
        testGame.setName("SomeName");
        testGame.setYearReleased("1999");
        testGame.setPlatform("PC");

        assertTrue(testGame.validate());
    }



    }
