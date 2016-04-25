import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Administrator on 4/6/16.
 */
public class ReviewerClassTest {

    public static void main(String args[]) {
        int x;
        ArrayList<Reviewer> reviewers = new ArrayList<Reviewer>();

        Reviewer reviewer1 = new Reviewer("Reviewer",34,'M',"comment","password","favorite");

        reviewer1.addFavoriteGame("Risk");
        reviewer1.addFavoriteGame("Poker");
        reviewer1.addFavoriteGame("Malarky");

        Reviewer reviewer2 = new Reviewer(34,'M',"password");

        reviewers.add(reviewer1);
        reviewers.add(reviewer2);

        for (x = 0; x < reviewers.size(); x++){
            System.out.println(reviewers.get(x).toString());
        }
        System.out.println("Favorite games for reviewer are " + reviewer1.getFavoriteGames());
        System.out.println("Favorite games for reviewer2 are: " + reviewer2.getFavoriteGames());

    }

    @Test
    public void setAge_InvalidValue(){
        Reviewer reviewer3 = new Reviewer(-1,'M',"password");
        try {
            reviewer3.setAge(0);
        } catch (InvalidDataTypeException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void setGender_InvalidValue(){
        Reviewer reviewer4 = new Reviewer(34,'x',"password");
        try {
            reviewer4.setGender('X');
        } catch (InvalidDataTypeException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void setPassword_InvalidValue(){
        Reviewer reviewer5 = new Reviewer(34,'M'," ");
        try {
            reviewer5.setPassword("");
        } catch (InvalidDataTypeException e) {
            e.printStackTrace();
        }
    }



}
