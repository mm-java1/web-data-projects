package edu.htc.game.review;

import java.util.ArrayList;

/**
 * Created by Joel on 4/15/2016.
 */
public class Game {
    private String gName;
    private String relDate;
    private String platForm;
    private float avgRate;

    private ArrayList<String> tags = new ArrayList<String>();
    private ArrayList<Review> liReviews = new ArrayList<Review>();
    // private String review;
    // private ArrayList<Review> reviews;


    //construc //
    public Game(String gName, String relDate, String platForm, float avgRate) {
        this.gName = gName;
        this.relDate = relDate;
        this.platForm = platForm;
        this.avgRate = avgRate;


    }

    public Game() {

    }

    //game name
    public String getName() {
        return gName;
    }

    public void setName(String gName) throws InvalidDataTypeException {
        if (gName == null || gName.trim().isEmpty()) {
            throw new InvalidDataTypeException("The game name cannot be null");

        } else {
            this.gName = gName;
        }
    }

    //release date
    public String getYearReleased() {
        return relDate;
    }

    public void setYearReleased(String relDate) throws InvalidDataTypeException {
        if (relDate == null || relDate.trim().isEmpty()) {
            throw new InvalidDataTypeException("The year released cannot be null or empty");
        } else if (relDate.trim().length() != 4) {
            throw new InvalidDataTypeException("the year released must be four digits");
        } else {
            try {
                Integer.parseInt(relDate);
            } catch (NumberFormatException e) {
                throw new InvalidDataTypeException("The year released must be four digits");
            }
            this.relDate = relDate;
        }

    }

    //platform
    public String getPlatform() {
        return platForm;
    }

    public void setPlatform(String platForm) throws InvalidDataTypeException {
        if (platForm == null || platForm.trim().isEmpty()) {
            throw new InvalidDataTypeException("the platform cannot be null or empty");
        } else {
            this.platForm = platForm;
        }
    }

    //tags
    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> Tags) {
        this.tags = Tags;
    }

    public void addTag(String aTag) throws InvalidDataTypeException {
        if (this.tags == null) {
            this.tags = new ArrayList<String>();
        }
        if (aTag == null || aTag.trim().isEmpty()) {
            throw new InvalidDataTypeException("the tag connot be null or empty");
        } else {
            this.tags.add(aTag);
        }
    }

    //rating
    public float getAvgRate() {
        if (avgRate < 0) {
            System.out.println("number not in range");
        } else if (avgRate > 5) {
            System.out.println("number not in range");
        } else {
            System.out.println("success!");
        }
        return avgRate;
    }

    public void setAvgRate(int avgRate) {
        this.avgRate = avgRate;
    }

    protected ArrayList<Review> getLiReviews() {
        return liReviews;
    }

    protected void setLiReviews(ArrayList<Review> liReviews) {
        this.liReviews = liReviews;
    }

    public void addReview(Review aReview) throws InvalidDataTypeException {
        if (liReviews == null) {
            liReviews = new ArrayList<Review>();
        }

        if (aReview == null) {
            throw new InvalidDataTypeException("Review cannot be null");
        } else {
            this.liReviews.add(aReview);
        }
    }

    public boolean validate() {
        if (this.gName == null) {
            return false;
        }
        if (this.relDate == null) {
            return false;
        }
        if (this.platForm == null){
            return false;
        }

        return true;
    }
}