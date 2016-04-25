package edu.htc;

import java.util.ArrayList;

/**
 * Created by Joel on 4/15/2016.
 */
public class Game {
    private String gName;
    private int relDate;
    private String platForm;
    private String tag;
    private int avgRate;
    private String review;
    private ArrayList<String> Tags = new ArrayList<String>();
    private ArrayList<Review> liReviews = new ArrayList<Review>();
   // private ArrayList<Review> reviews;


    //construc //
    public Game(String gName, int relDate, String platForm, String review, String tag, int avgRate) {
        this.gName = gName;
        this.relDate = relDate;
        this.platForm = platForm;
        this.review = review;
        this.tag = tag;
        this.avgRate = avgRate;


    }

    public Game() {

    }

    //game name
    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }
    //release date
    public int getRelDate() {
        return relDate;
    }

    public void setRelDate(int relDate) {
        this.relDate = relDate;
    }
    //platform
    public String getPlatForm() {
        return platForm;
    }

    public void setPlatForm(String platForm) {
        this.platForm = platForm;
    }
    //tags
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ArrayList<String> getTags() {
        return Tags;
    }

    public void setTags(ArrayList<String> tags) {
        Tags = tags;
    }

    public void addTag(String aTag) {
        if (Tags == null) {
            Tags = new ArrayList<String>();
        }
        this.Tags.add(aTag);
    }
    //rating
    public int getAvgRate() {
        try {
            if (avgRate < 0)
            {
                throw new InvalidDataException();
            }
            else if (avgRate > 5) {
                throw new InvalidDataException();
            }
        }catch (InvalidDataException ex){
            System.out.println("Error,rating not in range");
        }
        return avgRate;
    }

    public void setAvgRate(int avgRate) {
        this.avgRate = avgRate;
    }
    //review
    public String getReview() {
        return review;
    }

  //  public void setReview(Review review) {
  //      this.review = review;
  //  }



    protected ArrayList<Review> getLiReviews() {
        return liReviews;
    }

    protected void setLiReviews(ArrayList<Review> liReviews) {
        this.liReviews = liReviews;
    }

    public void addReview(Review aReview) {
        if (liReviews == null) {
            liReviews = new ArrayList<Review>();
        }
        this.liReviews.add(aReview);
    }
}
