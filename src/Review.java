import java.util.Date;
/**
 * Created by Sam on 4/10/2016.
 */
public class Review {
    private int starRating;
    private Reviewer reviewer;
    private Game game;
    private String comments;
    private Date date;

    public Review(int starRating, Reviewer reviewer, Game game, String comments) {
        this.starRating = starRating;
        this.reviewer = reviewer;
        this.game = game;
        this.comments = comments;
    }

    public Review(){
        this.starRating = -1;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) throws InvalidDataTypeException {
        if(starRating < 0 || starRating > 5){
            throw new InvalidDataTypeException("Star Rating must be between 0 and 5");
        }else{
            this.starRating = starRating;
        }
    }

    public Object getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) throws InvalidDataTypeException{
        if (reviewer == null){
            throw new InvalidDataTypeException("Reviewer cannot be null.");
        }else {
            this.reviewer = reviewer;
        }

    }

    public Object getGame() {
        return game;
    }

    public void setGame(Game game) throws InvalidDataTypeException{
        if (game == null){
            throw new InvalidDataTypeException("Reviewer cannot be null.");
        }else {
            this.game = game;
        }
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) throws InvalidDataTypeException{
        if (comments == null || comments.trim().isEmpty()){
            throw new InvalidDataTypeException("Comments can not be null or empty.");
        }else{
            this.comments = comments;
        }

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) throws InvalidDataTypeException {
        if (date == null){
            throw new InvalidDataTypeException("Date cannot be null");
        }else{
            this.date = date;
        }

    }

    public boolean validate() {
        if (starRating == -1) {
            return false;
        } else if (reviewer == null || game == null || comments == null || date == null) {
            return false;

        } else {
            return true;
        }
    }
}
