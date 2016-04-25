import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by cheey on 4/17/2016.
 */
public class Review extends ValidationMethod {
    private int starRating;
    private String reviewer;
    private String gameTitle;
    ArrayList<String> comments = new ArrayList<>();
    //private int date;
    //private LocalDateTime date = LocalDateTime.now();
    Date date = new Date();

    @Override
    public void validationMethod() {
        super.validationMethod();
        validDate = true;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) throws InvalidDataTypeException{
        try {if (starRating > 0 && starRating < 6){
            this.starRating = starRating;
            validRating = true;}


        else {
            throw new InvalidDataTypeException("Ratings should be 1-5.");
        }

        }
        catch (NullPointerException e){
            throw new InvalidDataTypeException(e.getMessage());
        }
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

    public void setGameTitle(String gameTitle) throws InvalidDataTypeException{
        try {if (gameTitle.length() > 3){
            this.gameTitle = gameTitle;
            validGame = true;}

        else {
            throw new InvalidDataTypeException("Game titles should be more than 3 characters");
        }

        }
        catch (NullPointerException e){
            throw new InvalidDataTypeException(e.getMessage());
        }

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

//    public LocalDateTime getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDateTime date) {
//        this.date = date;
//        validDate = true;
//    }

    public Date setDate  (Date date){
        this.date = date;
        return date;

    }


    public Date getDate() {
        return date;
    }
}
