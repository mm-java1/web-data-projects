package edu.htc.gamereview;

import java.util.ArrayList;

/**
 * Created by karennilson on 4/17/16.
 */
public class Game {
    private String gameName;
    private String releaseDate;
    private String platform;
    private ArrayList<String> tags;
    private float averageRating;
    private ArrayList<Review> reviews;


    public String getName() {
        return gameName;
    }

    public void setName(String gameName) throws InvalidDataTypeException {
        if(gameName == null || gameName.trim().isEmpty()){
            throw new InvalidDataTypeException("The game name cannot be null or ");
        }
        else {
            this.gameName = gameName;
        }
    }

    public String getYearReleased() {
        return releaseDate;
    }

    public void setYearReleased(String releaseDate) throws InvalidDataTypeException {
        if (releaseDate == null || releaseDate.trim().isEmpty()) {
            throw new InvalidDataTypeException("The year released cannot be null or empty");
        } else if (releaseDate.trim().length() != 4) {
            throw new InvalidDataTypeException("The year released must be four digits");
        } else {
            try {
                Integer.parseInt(releaseDate);
            } catch (NumberFormatException e){
                throw new InvalidDataTypeException("The year released must be four digits.");
            }
            this.releaseDate = releaseDate;
        }
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) throws InvalidDataTypeException {
        if (platform == null || platform.trim().isEmpty()) {
            throw new InvalidDataTypeException("The platform cannot be null or empty");
        } else {
            this.platform = platform;
        }
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public void addTags(String tag) throws InvalidDataTypeException {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        if (tag == null || tag.trim().isEmpty()) {
            throw new InvalidDataTypeException("The tag cannot be null or empty.");
        } else {

            this.tags.add(tag);
        }
    }

    public float getAverageRating() {
        return averageRating;
    }

    protected void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review review) throws InvalidDataTypeException{
        if (this.reviews == null) {
            this.reviews = new ArrayList<Review>();
        }
        if (review == null) {
            throw new InvalidDataTypeException("Review cannot be null.");
        } else {
            this.reviews.add(review);
        }
    }
    public boolean validate() {
        if (this.gameName == null) {
            return false;
        }
        if (this.releaseDate == null) {
            return false;
        }
        if (this.platform == null) {
            return false;
        }
        return true;
    }
}
