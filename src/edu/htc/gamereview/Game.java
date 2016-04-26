package edu.htc.gamereview;
import java.util.ArrayList;

/**
 * Created by Sam on 4/10/2016.
 */
public class Game {
    String name;
    String yearReleased;
    float averageRating;
    String platform;
    ArrayList<String> tags = new ArrayList<String>();
    int rating;
    ArrayList<Review> reviews = new ArrayList<Review>();

    public Game() {
    }

    public float getAverageRating() {
        return averageRating;
    }

    //This will be calculated on the database and not in the code
    protected void setAverageRating(float averageRating) { this.averageRating = averageRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidDataTypeException {
        if (name == null || name.trim().isEmpty()){
            throw new InvalidDataTypeException("The game name cannot be null or empty");
        }else{
            this.name = name;
        }
    }

    public String getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(String yearReleased) throws InvalidDataTypeException{
        if (yearReleased == null || yearReleased.trim().isEmpty()){
            throw new InvalidDataTypeException("The year released cannot be null or empty.");
        }else if(yearReleased.trim().length() != 4 ){
            throw new InvalidDataTypeException("The year released must a four digit number.");
        }else{
            try{
                Integer.parseInt(yearReleased);
            }catch (NumberFormatException e){
                throw new InvalidDataTypeException("The year released must a four digit number.");
            }
            this.yearReleased = yearReleased;
        }
    }


    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) throws InvalidDataTypeException {
        if (platform == null || platform.trim().isEmpty()){
            throw new InvalidDataTypeException("The platform cannot be null or empty.");
        }else {
            this.platform = platform;
        }
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    protected void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void addTag(String tag) throws InvalidDataTypeException{
        if(this.tags == null){
            this.tags = new ArrayList<String>();
        }
        if(tag == null || tag.trim().isEmpty()){
            throw new InvalidDataTypeException("Tag cannot be null or empty.");
        } else {
            tags.add(tag);
        }

    }

    public void addReview (Review review) throws InvalidDataTypeException{
        if (this.reviews == null) {
            this.reviews = new ArrayList<Review>();
        }
        if(review == null){
            throw new InvalidDataTypeException("edu.htc.gamereview.Review cannot be null.");
        }else{
            reviews.add(review);
        }

    }

    public boolean validata(){
        if (this.name == null){
            return false;
        } else if(this.platform == null){
            return false;
        }else if (this.yearReleased == null){
            return false;
        }
        else{
            return true;
        }
    }

}
