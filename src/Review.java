
import java.util.Date;

/**
 * Created by Administrator on 4/5/16.
 */
public class Review {
    private int starRating;
    private Reviewer reviewer;
    private Game game;
    private String comments;
    private Date reviewDate;

    public Review(int starRating, Reviewer reviewer, Game game, String comments, Date reviewDate) {
        try {
            this.setStarRating(starRating);
        } catch (InvalidDataTypeException e){
            e.printStackTrace();
        }
        this.reviewer = reviewer;
        this.game = game;
        this.comments = comments;
        this.reviewDate = reviewDate;
    }

    public Review(int starRating, Reviewer reviewer, Game game) {
        try {
            this.setStarRating(starRating);
        } catch (InvalidDataTypeException e){
            e.printStackTrace();
        }
        this.reviewer = reviewer;
        this.game = game;
    }

    public Review() {

    }

    @Override
    public String toString() {
        return "Review{" +
                "starRating=" + starRating +
                ", reviewer=" + reviewer +
                ", game=" + game +
                ", comments='" + comments + '\'' +
                ", reviewDate=" + reviewDate +
                '}';
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) throws InvalidDataTypeException {
        if (starRating < 0 || starRating > 5)
            throw new InvalidDataTypeException("Rating must be between 0 and 5");
        else
            this.starRating = starRating;
    }

    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) {
        this.reviewer = reviewer;
    }

    public Game getGame() {
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

    public Date getReviewDate() {
        return reviewDate;
    }

    protected void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public boolean validateRecord(){
        boolean answer = true;
        if (this.getStarRating() == 0 ){
            answer = false;
        }
        return answer;
    }

}
