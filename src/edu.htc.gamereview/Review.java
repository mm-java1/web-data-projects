package edu.htc.gamereview;

import junit.framework.Test;

import java.text.SimpleDateFormat;
import java.util.Date;;
import java.text.ParseException;
import java.text.DateFormat;


/**
 * Created by clifford.mauer on 4/11/2016.
 */
public class Review {


    private Integer StarRating; //** 1 to 5, no half stars
    //**private String Reviewer;
    private Reviewer reviewer;

    private Game game;

    private String Comments;  //** The text of the review
    private Date date;  //** use java.util.Date class

    public Review(){
        this.StarRating = -1;
    }

    public Integer getStarRating() {
        return StarRating;
    }

    public void setStarRating(int intstarRating) throws InvalidDataTypeException {

        //** check if the starrating is null or empty
        if (intstarRating == 0 || intstarRating > 5)
        {
            throw new InvalidDataTypeException("Star Rating must be between 0 and 5.");
        }
        else {
            StarRating = intstarRating;
        }
    }

    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) throws InvalidDataTypeException {

        //**Check if name is null or empty
        if (reviewer == null){
            throw new InvalidDataTypeException("Reviewer cannot be null");
        }
        else {
            this.reviewer = reviewer;
        }
    }

    public Game getGame() {
        return this.game;
    }

    public void setGame(Game game) throws InvalidDataTypeException {

        if (game == null){
            throw new InvalidDataTypeException("Game cannot be null");
        }
        else {
            this.game = game;
        }
   }

    public String getComments() throws InvalidDataTypeException {
        return Comments;
    }

    public void setComments(String comments) throws InvalidDataTypeException {
        if (comments == null || comments.trim().isEmpty()){
            throw new InvalidDataTypeException("Comments cannot be null or blank.");
        }

        Comments = comments;

    }

    public String get_Date() {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        String datestr = df.format(date);


        return datestr;
    }

    public void set_Date(String datestr) throws InvalidDataTypeException {
        Date date = new Date();

        if (datestr == null) {
            throw new InvalidDataTypeException("Date cannot be null.");
        }
        else {
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            //**DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);

            try {
                date = df.parse(datestr) ;
                //**System.out.println(date);
                //**System.out.println(df.format(date));
                this.date = date;

            } catch (ParseException e) {
                e.printStackTrace();
            }


        }

    }

    public boolean validate() {
        if (StarRating == -1){
            return false;
        }
        if (reviewer == null || game == null || Comments == null || date == null){
            return false;
        }

        return true;
    }


}
