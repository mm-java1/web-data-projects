import java.util.ArrayList;

/**
 * Created by Administrator on 4/6/16.
 */
public class ReviewerClassTest {

    public static void main(String args[]) {
        int x;
        ArrayList<Reviewer> reviews = new ArrayList<Reviewer>();

        Reviewer reviewer1 = new Reviewer("Bob Smith", 25, 'M', "comments", "password", "Boggle");
        reviewer1.addFavorite("Risk");
        reviewer1.addFavorite("Pong");
        reviewer1.addFavorite("Kings Quest");

        Reviewer reviewer2 = new Reviewer("Charlie Smith", 5, 'F', "ace", "password1", "");

        reviews.add(reviewer1);
        reviews.add(reviewer2);

        for (x = 0; x < reviews.size(); x++){
            System.out.println(reviews.get(x).toString());
        }

        System.out.println("Favorite games for reviewer are " + reviewer1.getFavoriteGames());
        System.out.println("Favorite games for reviewer2 are: " + reviewer2.getFavoriteGames());

        //access via arraylist
        System.out.println("\nFavorite games for reviewer1 via arraylist: " + reviews.get(0).getFavoriteGames());


    }
}
