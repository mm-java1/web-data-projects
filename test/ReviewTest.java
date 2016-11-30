import edu.htc.gamereview.InvalidDataTypeException;
import edu.htc.gamereview.Review;
import junit.framework.Assert;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertSame;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by clifford.mauer on 4/20/2016.
 */
public class ReviewTest {

    @Test(expected = InvalidDataTypeException.class)
    public void Review_withNullReviewer() throws InvalidDataTypeException {
        //**Create the object
        Review review = new Review();
        review.setReviewer(null);
    }

    @Test (expected = InvalidDataTypeException.class)
    public void Review_zeroStarRating() throws InvalidDataTypeException {
        //** Create the object
        Review review = new Review();
        review.setStarRating(0);
     }

    @Test (expected = InvalidDataTypeException.class)
    public void Review_greaterthanfiveStarRating() throws InvalidDataTypeException {
        //** Create the object
        Review review = new Review();
        review.setStarRating(6);
    }

    @Test(expected = InvalidDataTypeException.class)
    public void Review_withNullGame() throws InvalidDataTypeException {
        //**Create the object
        Review review = new Review();
        review.setGame(null);
    }

    @Test(expected = InvalidDataTypeException.class)
    public void Review_withEmptyComment() throws InvalidDataTypeException {
        //**Create the object
        Review review = new Review();
        review.setComments("") ;
    }

    @Test(expected = InvalidDataTypeException.class)
    public void Review_withNullComment() throws InvalidDataTypeException {
        //**Create the object
        Review review = new Review();
        review.setComments(null) ;
    }

    @Test
    public void Review_withStringAsComment() throws InvalidDataTypeException {
        //**Create the object
        Review review = new Review();
        review.setComments("This is the best game ever!") ;

        assertEquals("This is the best game ever!", review.getComments().toString());
    }

    @Test
    public void Review_withDateAsDate() throws InvalidDataTypeException {
        //**Create the object
        Review review = new Review();
        review.set_Date("01/01/2016"); ;

       assertEquals("01/01/2016",review.get_Date().toString());
    }
}
