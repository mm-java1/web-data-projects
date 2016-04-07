
import java.util.Date;

/**
 * Created by Administrator on 4/5/16.
 */
public class Review {
    private int starRating;
    private String reviewerName;
    private String gameName;
    private String comments;
    private Date reviewDate;

    public Review(int starRating, String reviewerName, String gameName, String comments) {
        this.starRating = starRating;
        this.reviewerName = reviewerName;
        this.gameName = gameName;
        this.comments = comments;
    }

    public Review(int starRating, String reviewerName, String gameName, String comments, Date reviewDate) {
        this.starRating = starRating;
        this.reviewerName = reviewerName;
        this.gameName = gameName;
        this.comments = comments;
        this.reviewDate = reviewDate;
    }

    @Override
    public String toString() {
        return "Review{" +
                "starRating=" + starRating +
                ", reviewerName='" + reviewerName + '\'' +
                ", gameName='" + gameName + '\'' +
                ", comments='" + comments + '\'' +
                ", reviewDate=" + reviewDate +
                '}';
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }




}
