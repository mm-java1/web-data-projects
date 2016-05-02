
import java.util.Date;

/**
 * Created by Administrator on 4/5/16.
 */
public class Review {
    private int starRating;
    private Reviewer reviewer;
    private Game game;
    private String comments;
    private Date reviewDate; //date


    public Review() {
        starRating = -1;
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

    public void setReviewer(Reviewer reviewer) throws InvalidDataTypeException {
        if (reviewer == null)
            throw new InvalidDataTypeException("Reviewer must not be null");
        else
            this.reviewer = reviewer;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) throws InvalidDataTypeException {
        if (game == null)
            throw new InvalidDataTypeException("Game must not be null");
        else
            this.game = game;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) throws InvalidDataTypeException { //max size??
        if (comments == null || comments.trim().isEmpty())
            throw new InvalidDataTypeException("Comments must not be null or empty");
        else
            this.comments = comments;
    }

    public Date getDate() {
        return reviewDate;
    }

    protected void setDate(Date reviewDate) throws InvalidDataTypeException {
        if (reviewDate == null )
            throw new InvalidDataTypeException("Date must not be null");

        this.reviewDate = reviewDate;
    }

    public boolean validateRecord(){

        if (starRating == -1 || reviewer == null || game == null || comments == null || reviewDate == null){
            return false;
        }

        return true;
    }

}
