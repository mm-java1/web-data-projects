package edu.htc.MoonflowerGameReview;

import java.util.Calendar;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by clifford.mauer on 4/11/2016.
 */
public class Game {

    private String Name;
    private Integer ReleaseDate;
    private String Platform;
    private double AverageRating;
    private ArrayList<String> Reviews;
    private ArrayList<String> Tags; //** (words like genres/types, single/multiplay, awards, subscriptions)
    private String tag;

    public String getName() {
        return Name;
    }

    public void setName(String name) throws InvalidDataTypeException {

        //**Check if name is null or empty
        if (name == "" || name == null){
            throw new InvalidDataTypeException("Name cannot be blank");
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

    public Integer getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(Integer releaseDate)  throws InvalidDataTypeException {

        Calendar now = Calendar.getInstance();
        int intnow = now.get(Calendar.YEAR);

         if (releaseDate < 1947){
            throw new InvalidDataTypeException("There were no video games before 1947");
        }

        if (releaseDate > intnow){
            throw new InvalidDataTypeException("There were no video games before 1947");
        }
        ReleaseDate = releaseDate;
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

    public void setAverageRating(double averageRating) {
        AverageRating = averageRating;
    }

    public ArrayList getReviews() {
        return Reviews;
    }

    public void setReviews(ArrayList reviews) {
        Reviews = reviews;
    }

    public ArrayList addReview(String review) throws InvalidDataTypeException {
        //**Check if tag is a number
        try {
            Integer.parseInt(review);
            // str[i] is numeric
            throw new InvalidDataTypeException("Review cannot be a number");

        } catch (NumberFormatException ignored) {
            // str[i] is not numeric
        }

        int intReviews ;
        if (Reviews == null){
            intReviews = 0;
        }
        else {
            intReviews = Reviews.size();
        }

        if (intReviews == 0){
            Reviews = new ArrayList<String>();
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

        //**Check if tag is a number
        try {
            Integer.parseInt(tag);
            // str[i] is numeric
            throw new InvalidDataTypeException("Tag cannot be a number");

        } catch (NumberFormatException ignored) {
            // str[i] is not numeric
        }

        int intTags ;
        if (Tags == null){
            intTags = 0;
        }
        else {
            intTags = Tags.size();
        }

        if (intTags == 0){
            Tags = new ArrayList<String>();
            Tags.add(tag);
        }
        else {
            Tags.add(tag);
        }

       return  Tags;

    }
}
