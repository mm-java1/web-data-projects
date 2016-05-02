package edu.htc.gamereview;

import org.omg.CORBA.DynAnyPackage.Invalid;

import java.util.Date;

/**
 * Created by Student on 4/25/2016.
 */
public class Review {

    private int starRating;

    private Reviewer reviewer;
    private Game game;

    private String comments;
    private Date date;

    public Review()
    {
        this.starRating = -1;
    }

    public int getStarRating() throws InvalidDataTypeException {
        if (starRating < 0 || starRating > 5)
        {
            throw new InvalidDataTypeException("Star Rating must be between 0 and 5");
        }
        else
        {
            return starRating;
        }
        }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer (Reviewer reviewer) throws InvalidDataTypeException {
        if (this.reviewer == null)
        {
            throw new InvalidDataTypeException("Must enter a name");
        }
        else
        {
            this.reviewer = reviewer;
        }
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) throws InvalidDataTypeException{
        if (this.game == null)
        {
            throw new InvalidDataTypeException("Game can't be null");
        }
        else
        {
            this.game = game;
        }
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) throws InvalidDataTypeException{
        if (comments == null || comments.trim().isEmpty())
        {
            throw new InvalidDataTypeException("You have to have a reason for your rating");
        }
        else
        {
            this.comments = comments;
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) throws InvalidDataTypeException{
        if (this.date == null)
        {
            throw new InvalidDataTypeException("Date cannot be null....hopefully");
        }
        this.date = date;
    }

    public boolean validate()
    {
        if (starRating == -1)
            return false;
        if (reviewer == null)
            return false;
        if (game == null)
            return false;
        if (comments == null)
            return false;
        if (date == null)
            return false;
        return true;
    }
}
