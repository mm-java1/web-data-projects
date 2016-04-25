import java.util.ArrayList;


/**
 * Created by cheey on 4/17/2016.
 */
public class Game extends ValidationMethod {

    private String gameTitle;
    private String releaseDate;
    private String platform;
    ArrayList<String> gamerTag = new ArrayList<>();
    private int averageRating;
    ArrayList<Review> reviews = new ArrayList<>();


    public String getGameTitle() {
        return gameTitle;
    }

//    public void setGameTitle(String gameTitle){
//            if (gameTitle.length() > 3)
//                this.gameTitle = gameTitle;
//            validGame = true;
//    }

    public void setGameTitle(String gameTitle) throws InvalidDataTypeException {
        try {
            if (gameTitle.length() > 3){
                this.gameTitle = gameTitle;
            validGame = true;}

            else {
                throw new InvalidDataTypeException("Enter a gametitle with more than 3 characters");
            }

        }
        catch (NullPointerException e){
            throw new InvalidDataTypeException(e.getMessage());
        }


    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) throws InvalidDataTypeException{
        try {
            if (releaseDate.length() == 4){
            this.releaseDate = releaseDate;
            validDate = true;}


            else {
                throw new InvalidDataTypeException("Enter a valid release date. (Ex: 1999)");
            }

        }
        catch (NullPointerException e){
            throw new InvalidDataTypeException(e.getMessage());
        }

    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public ArrayList<String> getGamerTag() {
        return gamerTag;
    }

    public void setGamerTag(ArrayList<String> gamerTag) {
        this.gamerTag = gamerTag;
    }

    public void addGamerTag(String gamerTag) {
        this.gamerTag.add(gamerTag);
    }

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) throws InvalidDataTypeException{
        try {
            if (averageRating > 0 && averageRating < 6){
            this.averageRating = averageRating;
            validRating = true;}


            else {
                throw new InvalidDataTypeException("Ratings should be 1-5.");
            }

        }
        catch (NullPointerException e){
            throw new InvalidDataTypeException(e.getMessage());
        }

    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview (Review review){
        this.reviews.add(review);
    }
}
