import edu.htc.DataTypeInvalidException;
import edu.htc.Review;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Gyan on 4/18/2016.
 */
public class ReviewTest {
    @Test
    public void review_starRatingValidNumber() throws DataTypeInvalidException {
        Review review = new Review();
        review.setStarRating(5);
        assertEquals(5, review.getStarRating());
    }

    @Test(expected = DataTypeInvalidException.class)
    public void review_starRatingInValidNumber() throws DataTypeInvalidException {
        Review review = new Review();
        review.setStarRating(6);

    }
}

