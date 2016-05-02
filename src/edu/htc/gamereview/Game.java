package edu.htc.gamereview;

import java.util.ArrayList;


/**
 * Created by cheey on 4/17/2016.
 */
public class Game {

    private String gameTitle;
    private String releaseDate;
    private String platform;
    ArrayList<String> gamerTag = new ArrayList<>();
    private float averageRating;
    ArrayList<Review> reviews = new ArrayList<>();


    public String getName() {
        return gameTitle;
    }

    public void setName(String gameTitle) throws InvalidDataTypeException {
//        //INCLASS WORK
        if (gameTitle == null || gameTitle.trim().isEmpty()){
            throw new InvalidDataTypeException("The game cannot be null/empty");

        }
        else {
            this.gameTitle = gameTitle;
        }
//        //--ORIGINAL CODE
//        try {
//            if (gameTitle.length() > 3){
//                this.gameTitle = gameTitle;
//            validGame = true;}
//
//            else {
//                throw new InvalidDataTypeException("Enter a game title with more than 3 characters");
//            }
//
//        }
//        catch (NullPointerException e){
//            throw new InvalidDataTypeException(e.getMessage());
//        }


    }

    public String getYearReleased() {
        return releaseDate;
    }

    public void setYearReleased(String releaseDate) throws InvalidDataTypeException{
//        //INCLASS
        if (releaseDate == null ||
                releaseDate.trim().isEmpty()||
                releaseDate.trim().length() != 4){
            throw new InvalidDataTypeException("Release date cannot be null/empty and must be 4 digits.");
        }
        else {
            try{
                Integer.parseInt(releaseDate);
            }
            catch (NumberFormatException e){
                throw new InvalidDataTypeException("Release date must be 4 digits.");
            }
            this.releaseDate = releaseDate;
        }
//        //--ORIGINAL CODE
//        try {
//            if (releaseDate.length() == 4){
//                this.releaseDate = releaseDate;
//                validDate = true;}
//
//
//            else {
//                throw new InvalidDataTypeException("Enter a valid release date. (Ex: 1999)");
//            }
//
//        }
//        catch (NullPointerException e){
//            throw new InvalidDataTypeException(e.getMessage());
//        }

    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) throws InvalidDataTypeException {
        if (platform == null || platform.trim().isEmpty()){
            throw new InvalidDataTypeException("Platform cannot be null/empty");
        }
        else {
            this.platform = platform;
        }
    }

    public ArrayList<String> getGamerTag() {
        return gamerTag;
    }

    public void setTags(ArrayList<String> gamerTag) {
        this.gamerTag = gamerTag;
    }

    public void addTag(String gamerTag) throws InvalidDataTypeException {
        if (this.gamerTag == null){
            this.gamerTag = new ArrayList<>();
        }
        if (gamerTag == null || gamerTag.trim().isEmpty()) {
            throw new InvalidDataTypeException("A game tag cannot be empty/null");
        }
        else {
            this.gamerTag.add(gamerTag);
        }
    }

    public float getAverageRating() {
        return averageRating;
    }

    //--THIS SHOULD BE SET BY THE DATABASE, NOT BY THE USER. NO VALIDATION NEEDED
    protected void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }


    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview (Review review) throws InvalidDataTypeException {
        if (this.reviews == null){
            this.reviews = new ArrayList<Review>();
        }

        if ( review == null){
            throw new InvalidDataTypeException("Review cannot be empty/null");
        }
        else {
            this.reviews.add(review);
        }
    }


    public boolean validate(){
        if (this.gameTitle == null){
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
