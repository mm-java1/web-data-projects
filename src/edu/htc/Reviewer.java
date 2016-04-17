package edu.htc;

import java.util.ArrayList;

/**
 * Created by Joel on 4/15/2016.
 */
public class Reviewer {
    private String uName;
    private int age;
    private char gender;
    private String comment;
    private ArrayList<String> liComments = new ArrayList<String>();
    private ArrayList<String> favGames = new ArrayList<String>();
    private String passWord;

    //construct
    public void Reviewer(String username, int age, char gender, String comment, String password){
        this.uName = username;
        this.age = age;
        this.gender = gender;
        this.passWord = password;
    }
    //loginInfo (username and password)
    public String getuName() {
        return uName;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public void setuName(String uName) {
        this.uName = uName;
    }
    //age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //gender
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    //comments

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ArrayList<String> getLiComments() {
        return liComments;
    }

    public void setLiComments(ArrayList<String> liComments) {
        this.liComments = liComments;
    }
    public void addComment(String aComment) {
        this.liComments.add(aComment);
    }
    //favgames
    public ArrayList<String> getFavGames() {
        return favGames;
    }

    public void setFavGames(ArrayList<String> favGames) {
        this.favGames = favGames;
    }
    public void addFavGame(String newfGame) {
        this.favGames.add(newfGame);
    }

}
