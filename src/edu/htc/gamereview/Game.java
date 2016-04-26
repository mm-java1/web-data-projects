package edu.htc.gamereview;

import java.util.ArrayList;

/**
 * Created by volkg_000 on 4/5/2016.
 */
public class Game {
    private String name;
    private String releaseDate;
    private String platform;
    private String tag;
    private double avgRating;
    private ArrayList<Review> reviews;
    private ArrayList<String> tags;






    public Game() {

    }


    public Game(String name, String releaseDate, String platform, String tag, double avgRating) {
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
         if(name == null || name.trim().isEmpty()) {
             throw new InvalidDataException("Game title cannot be null or empty");
         }

        else {
             this.name = name;
         }
    }

   public String getReleaseDate() {
       return releaseDate;
   }


    public void setReleaseDate(String releaseDate) throws InvalidDataException {

        if(releaseDate == null || releaseDate.trim().isEmpty() || releaseDate.trim().length() != 4) {
            throw new InvalidDataException("Invalid data");
        }
        else if(releaseDate.trim().length() != 4) {
            throw new InvalidDataException("Year must be 4 digits long");
        }
        else {
            try {
                Integer.parseInt(releaseDate);
            }catch (NumberFormatException e) {
                throw new InvalidDataException("The year released must be 4 digits");
            }
            this.releaseDate = releaseDate;

        }
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) throws InvalidDataException {
        if(platform == null || platform.trim().isEmpty()) {
            throw new InvalidDataException("Platform cannot be blank");
        }
        else {
            this.platform = platform;
        }


    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        if(tag != null) {
            this.tag = tag;

        }
    }

    public double getAvgRating() {
        return avgRating;
    }

    protected void setAvgRating(double avgRating) throws InvalidDataException {
       this.avgRating = avgRating;


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

    public void addTag(String tag) throws InvalidDataException {
        if(this.tags == null) {
            this.tags = new ArrayList<String>();
        }
        if(tag == null || tag.trim().isEmpty()) {
            throw new InvalidDataException("The tag cannot be null or empty");
        }
        else {
            this.tags.add(tag);
        }
    }

    public void addReview(Review review) throws InvalidDataException {

        if(this.reviews == null) {
            this.reviews = new ArrayList<Review>();
        }
        if(review == null) {
            throw new InvalidDataException("The Review cannot be null");
        }
        else {
            this.reviews.add(review);
        }
    }

    public boolean validate() {
        if(this.name == null) {
            return false;
        }

        if(releaseDate == null) {
            return false;
        }

        if(platform == null) {
            return false;
        }



        return true;
    }




}
