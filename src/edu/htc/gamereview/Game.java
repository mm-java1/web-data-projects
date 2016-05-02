package edu.htc.gamereview;

import java.util.ArrayList;

/**
 * Created by Student on 4/25/2016.
 */
public class Game {

    private String name;
    private String yearReleased;
    private String platform;
    private ArrayList<String> tags;
    private float averageRating;
    private ArrayList<Review> reviews;

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    protected void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review review) throws InvalidDataTypeException
    {
        if (this.reviews == null)
        {
            this.reviews = new ArrayList<Review>();
        }
        if (review == null)
            throw new InvalidDataTypeException("Review cannot be null");
        else
            this.reviews.add(review);
    }
    public Game(){
        reviews = new ArrayList<Review>();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) throws InvalidDataTypeException {
        if (platform == null || platform.trim().isEmpty())
        {
            throw new InvalidDataTypeException("The platform has to exist dude, type something");
        }
        else
        {
            this.platform = platform;
        }
    }

    public String getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(String yearReleased) throws InvalidDataTypeException {
        if (yearReleased == null || yearReleased.trim().isEmpty())
        {
            throw new InvalidDataTypeException("The year released cannot be null or empty.");
        }
        else if (yearReleased.trim().length() != 4)
        {
            throw new InvalidDataTypeException("This ain't the future, nor the past, try again.");
        }
        else {
            try {
                Integer.parseInt(yearReleased);
            } catch (NumberFormatException e) {
                throw new InvalidDataTypeException("The year released must be four digits.");
            }
            this.yearReleased = yearReleased;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidDataTypeException {
        if (name == null || name.trim().isEmpty())
        {
            throw new InvalidDataTypeException("The game name cannot be null or empty");
        }
        else
        {
            this.name = name;
        }
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public void addTag(String tag) throws InvalidDataTypeException
    {
        if (this.tags == null)
        {
            this.tags = new ArrayList<String>();
        }
        if (tag == null || tag.trim().isEmpty())
            throw new InvalidDataTypeException("tag cannot be null or empty");
        else
            this.tags.add(tag);
    }

    public float getAverageRating() {
        return averageRating;
    }
    // this should be set by the database, not by the user interface
    protected void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }
}
