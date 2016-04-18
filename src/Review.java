import java.util.ArrayList;
import java.util.Date;

/**
 * Created by cheey on 4/17/2016.
 */
public class Review {
    private int starRating;
    private String reviewer;
    private String gameTitle;
    ArrayList<String> comments = new ArrayList<>();
    private int date;

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public ArrayList<String> getComments() {
        return comments;
    }

    public void setComments(ArrayList<String> comments) {
        this.comments = comments;
    }

    public void addComments(String comments){
        this.comments.add(comments);
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
