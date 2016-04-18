package edu.htc;

import java.util.ArrayList;

/**
 * Created by Owner on 4/18/2016.
 */
public class Reviewer {

    //Properties
    private String userName;
    private String password;
    private int age;
    private String gender;
    private String profile;
    private ArrayList<String> favGames = new ArrayList<String>() ;


    //Constructors


    public Reviewer(String userName, String password, int age, String gender, String profile, ArrayList<String> favGames) {
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.profile = profile;
        this.favGames = favGames;
    }

    //Getter and Setter

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public ArrayList<String> getFavGames() {
        return favGames;
    }

    public void setFavGames(ArrayList<String> favGames) {
        this.favGames = favGames;
    }
}
