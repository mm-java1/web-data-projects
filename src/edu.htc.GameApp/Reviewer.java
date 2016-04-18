package edu.htc.GameApp;

import java.util.List;

/**
 * Created by clifford.mauer on 4/11/2016.
 */
public class Reviewer {

    private String Name; //** (screen name or user name)
    private Integer Age;
    private String Gender;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getProfileComments() {
        return ProfileComments;
    }

    public void setProfileComments(String profileComments) {
        ProfileComments = profileComments;
    }

    public List getFavoriteGames() {
        return FavoriteGames;
    }

    public void setFavoriteGames(List favoriteGames) {
        FavoriteGames = favoriteGames;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    private String ProfileComments; //** - whatever text they want to share
    private List FavoriteGames;
    private String Password;

}
