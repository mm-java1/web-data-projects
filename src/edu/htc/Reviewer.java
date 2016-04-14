package edu.htc;

import java.util.ArrayList;

/**
 * Created by volkg_000 on 4/6/2016.
 */
public class Reviewer {
    String name;
    int age;
    String gender;
    String profileinfo;
    String password;
    //should i use inheritance for the game class to pick up a list of games??
    ArrayList<String> favoritegames = new ArrayList<>();


    public Reviewer(String name, int age, String gender, String profileinfo, String password, ArrayList<String> favoritegames) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.profileinfo = profileinfo;
        this.password = password;
        this.favoritegames = favoritegames;
    }

    //ReviewerName property
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Age property
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   //Gender Property
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    //BioProperty
    public String getProfileinfo() {
        return profileinfo;
    }

    public void setProfileinfo(String profileinfo) {
        this.profileinfo = profileinfo;
    }


    //Password Property
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    //FavoriteGames Property
    public ArrayList<String> getFavoriteGames() {
        return favoritegames;
    }

    public void setFavoriteGames(ArrayList<String> favoriteGames) {
        this.favoritegames = favoritegames;
    }
}
