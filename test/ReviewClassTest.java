import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 * Created by Administrator on 4/6/16.
 */
public class ReviewClassTest {

    public static void main(String args[]) {
        int x;
        Reviewer reviewer = new Reviewer();
        Reviewer reviewer2 = new Reviewer();
        Game game = new Game();
        Game game2 = new Game();
        Game game3 = new Game();

        ArrayList<Review> reviews = new ArrayList<Review>();

        Review review1 = new Review(5,reviewer,game,"comment", new Date());
        Review review2 = new Review(6, reviewer2, game2, "comment2", new Date());

        try {
            reviewer.setReviewerName("Bob");
            reviewer.setGender('M');
            reviewer.setAge(34);

            game.setAverageRating(5);
            game.setGameName("Doom");
            game.setReleaseDate("1997");

            reviewer2.setReviewerName("mary");
            game2.setAverageRating(3);
            game2.setGameName("King's Quest");
            game2.setReleaseDate("1986");
        } catch (InvalidDataTypeException e){
            e.printStackTrace();
        }

        reviews.add(review1);
        reviews.add(review2);

        for (x = 0; x < reviews.size(); x++){
            System.out.println(reviews.get(x).toString());
        }
        System.out.println("Favorite games for review1 are " + review1.getGame());
        System.out.println("Favorite games for review2 are: " + review2.getGame());

    }

    @Test
    public void setStarRating_InvalidValue(){
        Review review3 = new Review(6,new Reviewer(),new Game());
        try {
            review3.setStarRating(-1);
        } catch (InvalidDataTypeException e) {
            e.printStackTrace();
        }

    }


}