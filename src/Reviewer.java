import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 4/5/16.
 */
public class Reviewer {
    private String reviewerName;
    private int age;
    private char gender;
    private String comments;
    private String password;
    private List favoriteGames = new ArrayList<String>();

    public Reviewer(String reviewerName, int age, char gender, String comments, String password,  String favorite) {

        this.reviewerName = reviewerName;
        this.age = age;
        this.gender = gender;
        this.comments = comments;
        this.password = password;
        favoriteGames.add(favorite);
    }

    @Override
    public String toString() {
        return "Reviewer{" +
                ", reviewerName='" + reviewerName + '\'' +
                "age=" + age +
                ", gender=" + gender +
                ", comments='" + comments + '\'' +
                ", password='" + password + '\'' +
                ", favoriteGames=" + favoriteGames +
                '}';
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public ArrayList getFavoriteGames() {return (ArrayList) favoriteGames;}

    public void setFavoriteGames(ArrayList favoriteGames) {
        this.favoriteGames = favoriteGames;
    }

    public void addFavorite(String newFavorite){
        favoriteGames.add(newFavorite);
    } //add more favorites

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
