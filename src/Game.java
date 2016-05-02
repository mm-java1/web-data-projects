import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 4/5/16.
 */
public class Game {

    private String gameName;
    private String releaseDate;
    private String platform;
    private float averageRating;
    private ArrayList<String> tags;//= new ArrayList<String>();
    private ArrayList<Review> reviews; // = new ArrayList<Review>();

    public Game(String gameName, String releaseDate, String platform, float averageRating, ArrayList tags, ArrayList<Review> reviews) throws InvalidDataTypeException {

        try {
            this.setName(gameName);
        } catch (InvalidDataTypeException e){
            e.printStackTrace();
        }
        this.releaseDate = releaseDate;
        this.platform = platform;

        try {
            this.setAverageRating(averageRating);
        } catch (InvalidDataTypeException e){
            e.printStackTrace();
        }

        this.tags = tags;
        this.reviews = reviews;
    }

    public Game(String gameName, float averageRating) {
        try {
            this.setName(gameName);
        } catch (InvalidDataTypeException e){
            e.printStackTrace();
        }

        try {
            this.setAverageRating(averageRating);
        } catch (InvalidDataTypeException e){
            e.printStackTrace();
        }
    }

    public Game() {

    }

    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", platform='" + platform + '\'' +
                ", averageRating=" + averageRating +
                ", tags=" + tags +
                ", reviews=" + reviews +
                '}';
    }

    public String getName() {
        return gameName;
    }

    public void setName(String gameName) throws InvalidDataTypeException {
        if (gameName == null || gameName.trim().isEmpty()){
            throw new InvalidDataTypeException("gameName is blank or null");
        } else {
            this.gameName = gameName;
        }
    }

    public String getYearReleased() {
        return releaseDate;
    }

    public void setYearReleased(String releaseDate) throws InvalidDataTypeException {
        //1940??
        //4 digit year
        if (releaseDate == null || releaseDate.trim().isEmpty()){
            throw new InvalidDataTypeException("The year released cannot be null empty");
        } else if (releaseDate.trim().length() != 4){
            throw new InvalidDataTypeException("The year released must be 4 digits");
        } else{
            try{
                Integer.parseInt(releaseDate);
            } catch (NumberFormatException e){
                throw new InvalidDataTypeException("The year released must be 4 digits");
            }
            this.releaseDate = releaseDate;
        }
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) throws InvalidDataTypeException {
        if (platform == null || platform.trim().isEmpty()){
            throw new InvalidDataTypeException("Platform cannot be null or empty");
        }
            this.platform = platform;
    }

    public float getAverageRating() {
        return averageRating;
    }


    /*
        Value set from the database not the user interface so no validation is needed including exceptions

     */
    protected void setAverageRating(float averageRating) throws InvalidDataTypeException {
        this.averageRating = averageRating;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    protected void setTags(ArrayList tags) {
        this.tags = tags;
    }

    public void addTag(String tag) throws InvalidDataTypeException {
        if (this.tags == null){
            this.tags = new ArrayList<String>();
        }
        if (tag == null || tag.trim().isEmpty()){
            throw new InvalidDataTypeException("Tag cannot be null or empty");
        }
        this.tags.add(tag);
    }


    public ArrayList<Review> getReviews() {
        return reviews;
    }

    protected void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review review) throws InvalidDataTypeException {
        if (this.reviews == null){
            this.reviews = new ArrayList<Review>();
        }
        if (review == null){
            throw new InvalidDataTypeException("Review cannot be null");
        }
        this.reviews.add(review);
    }

    public boolean validate(){
        if (this.gameName == null){
            return false;
        }
        if (this.releaseDate == null){
            return false;
        }
        if (this.platform == null){
            return false;
        }

        return true;
    }

}


