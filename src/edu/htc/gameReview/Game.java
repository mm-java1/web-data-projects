package edu.htc.gameReview;

import java.util.ArrayList;

/**
 * Created by Gyan on 4/18/2016.
 */
public class Game {
    private String name;
    private String releaseYear;
    private String platform;
    //private String tags;
    private float avgRating;
    private ArrayList<Review> reviews;
    private ArrayList<String> tags;

    public Game(){
        reviews = new ArrayList<Review>();

    }
    public Game(String gameName){
        this.name = gameName;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) throws DataTypeInvalidException {
        if(name == null || name.trim().isEmpty()){
            throw new DataTypeInvalidException("The game name cannot be null or ");
        }else {
            this.name = name;
        }
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear)throws DataTypeInvalidException {
        if(releaseYear == null || releaseYear.trim().isEmpty()){
            throw new DataTypeInvalidException("The year released cannot be null or empty");
        }else if(releaseYear.trim().length() !=4){
            throw new DataTypeInvalidException("The year released must be 4 digits");
        }else {
            try {
                Integer.parseInt(releaseYear);
            } catch (NumberFormatException e) {
                throw new DataTypeInvalidException("The year release must be four digits.");
            }

            this.releaseYear = releaseYear;
        }
    }

    public String getPlatform() {

        return platform;
    }

    public void setPlatform(String platform) throws DataTypeInvalidException {
        if(platform == null|| platform.trim().isEmpty()){
            throw new DataTypeInvalidException("The platform cannot be null or empty");
        }else{
            this.platform = platform;
        }

    }


    public float getAvgRating() {
        return avgRating;
    }

    /*
        This should be set by the database, not by the user interface
        so no validation (or any validation should log print statements
        not throw exceptions.
    */
    protected void setAvgRating(float avgRating) {
        this.avgRating = avgRating;
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

    public void addTag(String tag) throws DataTypeInvalidException{
        if (this.tags ==null){
            this.tags =new ArrayList<String>();
        }
        if(tag ==null ||tag.trim().isEmpty()){
            throw new DataTypeInvalidException("Tag cannot be null.");
        }
        this.tags.add(tag);
    }

    public void addReview(Review review)throws DataTypeInvalidException{
        if(this.reviews == null){
            this.reviews = new ArrayList<Review>();
        }
        if(review == null){
            throw new DataTypeInvalidException("Review cannot be null");
        }else {
            this.reviews.add(review);
        }
    }


    public boolean validate(){
        if(this.name ==null){
            return false;
        }
        else if(this.releaseYear ==null){
            return false;
        }
        else if(this.platform ==null){
            return false;
        }
        return true;
    }
}
