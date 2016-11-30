package edu.htc.gamereview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertFalse;

/**
 * Created by clifford.mauer on 4/11/2016.
 */
public class Reviewer {


    private String userName; //** (screen name or user name)
    private String name;
    private Integer Age;
    private String Gender;
    //** private String profile
    private String profile; //** - whatever text they want to share
    private ArrayList<Game> FavoriteGames = new ArrayList();
    private String Password;

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidDataTypeException {
        //**Check if name is null or empty
        if (name == "" || name == null){
            throw new InvalidDataTypeException("Name cannot be blank");
        } else {
            this.name = name;
        }


    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) throws InvalidDataTypeException {
        if (age == null)
        {
            throw new InvalidDataTypeException(" You nust enter an age to use this service.");
        } else if  (age < 13  ) {
            throw new InvalidDataTypeException(" You must be 13 or older to use this service.");
        } else {
            this.Age = age;
        }
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) throws InvalidDataTypeException {
        if (gender == null || gender.trim().isEmpty())
        {
            throw new InvalidDataTypeException(" The gender cannot be null or empty.");
        } else if ( !gender.equalsIgnoreCase("male") || !gender.equalsIgnoreCase("female") || !gender.equalsIgnoreCase("other") ){
            throw new InvalidDataTypeException("The gender is not mail/female/other.");
        } else {
            this.Gender = gender;
        }
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
            this.profile = profile;
    }

    public ArrayList getFavoriteGames() {
        return FavoriteGames;
    }

    public void setFavoriteGames(ArrayList favoriteGames) {
        FavoriteGames = favoriteGames;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) throws InvalidDataTypeException {
        if (password == "" || password == null){
            throw new InvalidDataTypeException("The password cannot be null or empty");
        } else if (password.length() < 8) {
            throw new InvalidDataTypeException("The password must be at least 8 characters.");
        } else {
            this.Password = password;
        }
    }

    public String getUserName() throws InvalidDataTypeException {
            this.userName = userName;
       return userName;
    }

    public void setUserName(String userName) throws InvalidDataTypeException{
        //**Check if name is null or empty
        if (userName == "" || userName == null){
            throw new InvalidDataTypeException("The password cannot be null or empty");
        } else {

        this.userName = userName;
        }
    }
    public ArrayList addFavoriteGame(Game favoriteGame) throws InvalidDataTypeException {

        if (FavoriteGames == null){
            FavoriteGames = new ArrayList<Game>();
            FavoriteGames.add(favoriteGame);
        }
        else {
            FavoriteGames.add(favoriteGame);
        }

        return  FavoriteGames;

    }

    public boolean validate(){
        if (this.userName == null || this.Password == null){
            return false;
        }
        return true;
    }

    //** also test validate()


}
