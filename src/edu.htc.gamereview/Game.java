package edu.htc.gamereview;

import java.util.Calendar;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by clifford.mauer on 4/11/2016.
 * future dates are ok
 *
 */
public class Game {

    private String Name; //**not null and not empty**
    private String YearReleased;  //**not null and not empty
    private String Platform; //**not null and not empty**
    private float AverageRating;
    //** private float averageRate;
    private ArrayList<Review> Reviews;
    private ArrayList<String> Tags; //** (words like genres/types, single/multiplay, awards, subscriptions)

    private String tag;

    public String getName() {
        return Name;
    }

    public void setYearRleased(String yearReleased) throws InvalidDataTypeException{
        if (yearReleased == null || yearReleased.trim().isEmpty() ) {
            throw new InvalidDataTypeException(("The year released cannot be null or empty and must be 4 digits"));
        }
        else if (yearReleased.trim().length() != 4){
            //** could use try catch with parse int
            throw new InvalidDataTypeException("The year released must be four digits");
        }
        this.YearReleased = yearReleased;


    }

    public void setName(String name) throws InvalidDataTypeException {

        //**Check if name is null or empty
        if (name == null || name.trim().isEmpty()){
            throw new InvalidDataTypeException("The game name cannot be null or empty");
    }

        //**Check if name is a number
        try {
            Integer.parseInt(name);
            // str[i] is numeric
            throw new InvalidDataTypeException("Name cannot be a number");

        } catch (NumberFormatException ignored) {
            // str[i] is not numeric
        }

        //**Check if name is a string


        Name = name;


    }

    public String getReleaseDate() {
        return YearReleased ;
    }

    public void setReleaseDate(String yearReleased)  throws InvalidDataTypeException {

        Calendar now = Calendar.getInstance();
        int intnow = now.get(Calendar.YEAR);
        int intYearReleased = Integer.parseInt(yearReleased);

        if (intYearReleased < 1947){
            throw new InvalidDataTypeException("There were no video games before 1947");
        }
        if (intYearReleased > intnow){
            throw new InvalidDataTypeException("There were no video games before 1947");
        }
        YearReleased = yearReleased;
    }

    public String getPlatform() {
        return Platform;
    }

    public void setPlatform(String platform) throws InvalidDataTypeException{

        //**Check if name is null or empty
        if (platform == "" || platform == null){
            throw new InvalidDataTypeException("Platform cannot be blank");
        }

        //**Check if name is a number
        try {
            Integer.parseInt(Platform);
            // str[i] is numeric
            throw new InvalidDataTypeException("Name cannot be a number");

        } catch (NumberFormatException ignored) {
            // str[i] is not numeric
        }

        //**Set the platform
        Platform = platform;
    }

    public double getAverageRating() {
        return AverageRating;
    }

    protected void setAverageRating(float averageRating) {
        /* This should be set by the database, not by the user interface,
        so not validation (or any validation should log print statements
        not throw exceptions
         *
         */
        AverageRating = averageRating;
    }

    public ArrayList getReviews() {
        return Reviews;
    }

    protected void setReviews(ArrayList reviews) {
        Reviews = reviews;
    }

    public ArrayList addReview(Review review) throws InvalidDataTypeException {
        //** I have to check if the review is null and if it is
        //** throw an exception
        if (review == null){
            throw new InvalidDataTypeException("review cannot be null.");
        }
        //** This should take a review object and add it to the list

         if (Reviews == null){
            Reviews = new ArrayList<Review>();
            Reviews.add(review);
        }
        else {
            Reviews.add(review);
        }

        return  Reviews;

    }

    public ArrayList getTags() {
        return Tags;
    }

    public void setTags(ArrayList tags) {
        Tags = tags;
    }

    public ArrayList addTag(String tag) throws InvalidDataTypeException {
        if (this.Tags == null){
            this.Tags = new ArrayList<String>();
        }
        if (tag == null || tag.trim().isEmpty()){
            throw new InvalidDataTypeException("The tags cannot be null or empty.");

        }

        //**Check if tag is a number
        try {
            Integer.parseInt(tag);
            // str[i] is numeric
            throw new InvalidDataTypeException("Tag cannot be a number");

        } catch (NumberFormatException ignored) {
            // str[i] is not numeric
        }

        Tags.add(tag);

       return  Tags;

    }

    public boolean validate(){
        if (this.Name == null){
            return false;
        }
        if (this.YearReleased == null) {
            return false;
        }
        if (this.Platform == null){
            return false;

        }
        return false;
    }


}
