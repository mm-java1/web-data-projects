package edu.htc;

import java.util.ArrayList;

/**
 * Created by Gyan on 4/18/2016.
 */
public class Reviewer {
    private String playerName;
    private int age;
    private String gender;
    private String comments;
    private ArrayList<String> favGamelists = new ArrayList<String>();
    private String password;


    public Reviewer(String playerName, int age, String gender, String comments,String password){
        this.playerName = playerName;
        this.age =age;
        this.gender = gender;
        this.comments = comments;
        this.password = password;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public ArrayList<String> getFavGamelists() {
        return favGamelists;
    }

    public void setFavGamelists(ArrayList<String> favGamelists) {
        this.favGamelists = favGamelists;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addFavGameList(String gameList){
        favGamelists.add(gameList);

    }
}
