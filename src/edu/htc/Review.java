package edu.htc;

import java.lang.reflect.Array;
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

    public void setReviewer(String reviewer){
        this.Reviewer = reviewer;
    }

    // Game Get Sets
  public String getGame(){
      return this.Game;
  }

    public void setGame(String game){
        this.Game = game;
    }


    // Comments Get Sets
   public ArrayList<String> getComments(){
       return this.Comments;
   }

    public void setComments(ArrayList<String> comments){
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
