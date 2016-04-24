package edu.htc;

import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;
/**
 * Created by joe on 4/13/2016.
 */
public class Game {



    private String Name;
    private int ReleaseDate;
    private String Platform;
    private ArrayList<String> Tags = new ArrayList<String>();
    private int AverageRating;
    private ArrayList<String> ReviewList = new ArrayList<String>();

  // Constructor
    public Game(String name, int releaseDate, String platform, ArrayList<String> tags, int averageRating, ArrayList<String> reviewList){
        setName(name);
        setReleaseDate(releaseDate);
        setPlatform(platform);
        setTags(tags);
        setAverageRating(averageRating);
        setReviewList(reviewList);
    }

    // Validator

    public boolean Validate(){
        boolean conditon = true;
      if(this.Name == "" || this.Name == " " || this.Name == null){
        conditon = false;
       }
        if(this.ReleaseDate == 0){
            conditon = false;
        }
        if(this.Platform == "" || this.Platform == " " || this.Platform == null){
            conditon = false;
        }

        return conditon;
    }










// Name Get Sets
    public String getName(){
        return this.Name;
    }

    public void setName(String Name) throws IllegalArgumentException{

        if(Name == "" || Name == null){
            throw new IllegalArgumentException();
        }
        else{
            this.Name = Name;
        }
    }

    // Platform Get Sets
    public String getPlatform(){
        return this.Platform;
    }
    public void setPlatform(String platform) throws IllegalArgumentException {
        if(platform == "" || platform == null){
            throw new IllegalArgumentException();
        }
        else{
            this.Platform = platform;

        }

    }

    // Tag Get Sets
   public ArrayList<String> getTags(){
       return this.Tags;

   }
    public void setTags(ArrayList<String> Tags) throws IllegalArgumentException{
       if(Tags != null) {
           this.Tags = Tags;
       }
        else{
           throw new IllegalArgumentException();
       }
    }
   public void addToTags(String Tag)throws IllegalArgumentException{
       if(Tag != "" && Tag != " ") {
           this.Tags.add(Tag);
       }
       else{
           throw new IllegalArgumentException();
       }

   }
    // Rating Get Sets
  public int getAverageRating(){
      return this.AverageRating;
  }
    public void setAverageRating(int Rating)throws IllegalArgumentException {
        if(Rating >= 0 && Rating <= 5 ){
        this.AverageRating = Rating;
        }
        else{
          throw new IllegalArgumentException();
        }

    }
    // Review Get Sets
    public ArrayList<String> getReviewList(){
        return this.ReviewList;
    }
    public void setReviewList(ArrayList<String> reviewList){
        this.ReviewList = reviewList;
    }
    public void addToReviewList(String review){
        this.ReviewList.add(review);
    }
    // Release Date Get Sets
    public int getReleaseDate(){
        return this.ReleaseDate;
    }
        public void setReleaseDate(int releaseYear)throws IllegalArgumentException {
           int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            if(releaseYear <= currentYear && releaseYear > 1955) {
                this.ReleaseDate = releaseYear;
            }
              else{
                throw new IllegalArgumentException();
            }

        }

}
