import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Administrator on 4/6/16.
 */
public class ReviewClassTest {

    public static void main(String args[]) {
        int x;

        ArrayList<Review> reviews = new ArrayList<Review>();
        Review review1 = new Review(4,"Bob","Pong","Designed well", new Date());

        Review review2 = new Review(42,"Bob2","Pong2","Designed well2", new Date());

        reviews.add(review1);
        reviews.add(review2);

        for (x = 0; x < reviews.size(); x++){
            System.out.println(reviews.get(x).toString());
        }


    }
}