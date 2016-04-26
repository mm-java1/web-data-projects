package edu.htc;

import java.util.ArrayList;

/**
 * Created by Gyan on 4/18/2016.
 */
public class Reviewer extends  Player {

    private String comments;
    private ArrayList<Game> favGamelists;
    private String password;

    public Reviewer() {

    }

    public Reviewer(String playerName, int age, String gender) {
        super(playerName, age, gender);
    }


    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public ArrayList<Game> getFavGamelists() {
        return favGamelists;
    }

    public void setFavGamelists(ArrayList<Game> favGamelists) {
        this.favGamelists = favGamelists;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addFavGameList(Game game) {
        if (favGamelists == null) {
            favGamelists = new ArrayList<Game>();
        }
        favGamelists.add(game);

    }
}

