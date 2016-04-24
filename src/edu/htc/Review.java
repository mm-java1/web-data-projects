package edu.htc;


import java.util.Date;
import java.util.ArrayList;

/**
 * Created by joe on 4/13/2016.
 */
public class Review {


    private int StarRating;
    private String Reviewer;
    private String Game;
    private ArrayList<String> Comments = new ArrayList<String>();
    private Date Date;



    // Constructor
   public Review(int starRating, String reviewer, String game, ArrayList<String> comments, Date date){
       setStarRating(starRating);
       setReviewer(reviewer);
       setGame(game);
       setComments(comments);
       setDate(date);
   }

    // Validator

    public boolean Validate(){
        boolean conditon = true;
        if(this.Reviewer == "" || this.Reviewer == " " || this.Reviewer == null){
            conditon = false;
        }
        if(this.StarRating < 0 || this.StarRating > 5){
            conditon = false;
        }
        if(this.Game == "" || this.Game == " " || this.Game == null){
            conditon = false;
        }

        return conditon;
    }






    // Star Rating Get Sets
   public int getStarRating(){
       return this.StarRating;
   }
    public void setStarRating(int stars) throws IllegalArgumentException{
        if(stars >= 0 && stars <= 5){
            this.StarRating = stars;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    // Reviewer Get Sets
    public String getReviewer(){
        return this.Reviewer;
    }

    public void setReviewer(String reviewer)throws IllegalArgumentException{
        if(reviewer != "" && reviewer != " " && reviewer != null) {
            this.Reviewer = reviewer;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    // Game Get Sets
  public String getGame(){
      return this.Game;
  }

    public void setGame(String game) throws IllegalArgumentException{
        if(game != "" && game != " " && game != null) {
            this.Game = game;
        }
        else{
            throw new IllegalArgumentException();
        }


    }


    // Comments Get Sets
   public ArrayList<String> getComments(){
       return this.Comments;
   }

    public void setComments(ArrayList<String> comments) {
        this.Comments = comments;
    }

    public void addToComments(String comment){
        this.Comments.add(comment);
    }

    // Date Rating Get Sets
    public Date getDate(){
        return this.Date;
    }

    public void setDate(Date date){
        this.Date = date;
    }



}
