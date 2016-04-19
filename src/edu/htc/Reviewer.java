package edu.htc;

import java.util.ArrayList;

/**
 * Created by karennilson on 4/18/16.
 */
public class Reviewer {
    private String name;
    private int age;
    private char gender;
    private String comments;
    private ArrayList<Game> favoriteGames;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public ArrayList<Game> getFavoriteGames() {
        return favoriteGames;
    }

    public void setFavoriteGames(ArrayList<Game> favoriteGames) {
        this.favoriteGames = favoriteGames;
    }

    public void addFavoriteGames(Game favGame){
        if (this.favoriteGames == null){
            this.favoriteGames = new ArrayList<>();
        }
        this.favoriteGames.add(favGame);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
