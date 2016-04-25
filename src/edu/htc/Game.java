package edu.htc;

import java.util.ArrayList;

/**
 * Created by volkg_000 on 4/5/2016.
 */
public class Game {
    private String name;
    private int releaseDate;
    private String platform;
    private String tag;
    private double avgRating;
    private ArrayList<Review> reviews;
    private ArrayList<String> tags;

    boolean validName = false;
    boolean validReleaseDate = false;
    boolean validPlatform = false;
    boolean validTag = false;
    boolean validAvgRating = false;

    public boolean validateGameFields() {
        if(validName == true && validReleaseDate == true && validPlatform == true && validTag == true && validAvgRating == true) {
            System.out.println("Valid Game class fields");
            return true;
        }
        else {
            System.out.println("Invalid Game class fields");
            return false;
        }

    }

    public Game() {

    }


    public Game(String name, int releaseDate, String platform, String tag, double avgRating) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.platform = platform;
        this.tag = tag;
        this.avgRating = avgRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidDataException {
        if(name.length() >= 3) {
            this.name = name;
            validName = true;
        }
        else {
            throw new InvalidDataException("Game title must be at least 3 characters");
        }
    }

   public int getReleaseDate() {
       return releaseDate;
   }


    public void setReleaseDate(int releaseDate) throws InvalidDataException {

        if (releaseDate >= 1940 &&  releaseDate < 2017) {
            this.releaseDate = releaseDate;
            validReleaseDate = true;
        }

        else {
            throw new InvalidDataException("Year must be an integer between 1940 and 2016");
        }



    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) throws InvalidDataException {
        if(platform.length() >= 1 && platform.length() <= 10) {
            this.platform = platform;
            validPlatform = true;
        }

        if(platform.equalsIgnoreCase("")) {
            throw new InvalidDataException("Platform cannot be blank");
        }
        else if(platform.length() < 1 || platform.length() > 10) {
            throw new InvalidDataException("Platform length must be atleast 2 characters long and less than/equal to 10");
        }
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        if(tag != null) {
            this.tag = tag;
            validTag = true;
        }
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) throws InvalidDataException {
        if(avgRating > 0.0 && avgRating <= 5.0) {
            this.avgRating = avgRating;
            validAvgRating = true;
        }

        else {
            throw new InvalidDataException("Rating must be greater than 0 and less than or equal to 5");
        }

    }


    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) throws InvalidDataException {
        if(reviews != null) {
            this.reviews = reviews;
        }
        else {
            throw new InvalidDataException("Reviews Array is empty!");
        }
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) throws InvalidDataException {
        if(tags != null) {
            this.tags = tags;
        }
        else {
            throw new InvalidDataException("Tags Array is empty!");
        }
    }

    public void addTag(String tag) {
        if(tags == null) {
            tags = new ArrayList<String>();
        }
        tags.add(tag);
    }

    public void addReview(Review review) {

        if(reviews == null) {
            reviews = new ArrayList<Review>();
        }
        reviews.add(review);
    }

}
