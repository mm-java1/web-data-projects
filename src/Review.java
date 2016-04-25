import java.util.Date;
/**
 * Created by Sam on 4/10/2016.
 */
public class Review {
    int starRating;
    Reviewer reviewer;
    Game game;
    String comments;
    Date date;

    public Review(int starRating, Reviewer reviewer, Game game, String comments) {
        this.starRating = starRating;
        this.reviewer = reviewer;
        this.game = game;
        this.comments = comments;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public Object getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) {
        this.reviewer = reviewer;
    }

    public Object getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
