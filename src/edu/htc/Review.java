package edu.htc;

import java.util.Date;

/**
 * Created by volkg_000 on 4/5/2016.
 */
public class Review {
    private int starRating;
    private Reviewer reviewer;
    private Game game;
    private String comments;
    private Date date; //this will use java.util.Date class

    boolean validstarRating = false;
    boolean validreviewer = false;
    boolean validGame = false;
    boolean validComments = false;
    boolean validDate = false;


    public boolean validateReview() {
        if(validstarRating == true && validreviewer == true && validGame == true && validComments == true && validDate == true) {
            System.out.println("Valid Review class Data");
            return true;
        }

        else {
            System.out.println("Invalid review class Data");
            return false;
        }
    }



    public Review() {

    }

    public Review(int starRating, Reviewer reviewer, Game game, String comments, Date date) {
        this.starRating = starRating;
        this.reviewer = reviewer;
        this.game = game;
        this.comments = comments;
        this.date = date;

    }
    //star rating property
    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) throws InvalidDataException {
        if(starRating <= 5) {
            this.starRating = starRating;
            validstarRating = true;

        }
        else {
            throw new InvalidDataException("Star Rating must be an integer between 1 and 5");
        }

    }

    //reviewer property
    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) throws InvalidDataException {
        if (reviewer != null) {
            this.reviewer = reviewer;
            validreviewer = true;

        }
        else {
            throw new InvalidDataException("Reviewer cannot be null");
        }

    }
    //game property
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) throws InvalidDataException {
        if (game != null) {
            this.game = game;
            validGame = true;

        }

        else {
            throw new InvalidDataException("Game cannot be null");
        }
    }

    //comments property
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) throws InvalidDataException {
        if (comments != null) {
            this.comments = comments;
            validComments = true;

        }
        else {
            throw new InvalidDataException("A review must have comments!");
        }
    }

    //date property
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) throws InvalidDataException {
        if (date != null) {
            this.date = date;
            validDate = true;

        } else {
            throw new InvalidDataException("A review must contain a date");
        }
    }


}
