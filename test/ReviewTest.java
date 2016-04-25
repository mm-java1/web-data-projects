import edu.htc.MoonflowerGameReview.InvalidDataTypeException;
import edu.htc.MoonflowerGameReview.Review;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by clifford.mauer on 4/20/2016.
 */
public class ReviewTest {

    @Test(expected = InvalidDataTypeException.class)
    public void Review_withNoName() throws InvalidDataTypeException {
        //**Create the object
        Review review = new Review();
        review.setReviewer("");
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

}
