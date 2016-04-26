package edu.htc.gameReview;

import java.util.ArrayList;

/**
 * Created by Gyan on 4/18/2016.
 */
public class Reviewer{


    private String userName;
    private String password;

    private String name;
    private int age;
    private String gender;
    private String profile;
    private ArrayList<Game> favoriteGames;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) throws DataTypeInvalidException {
        if(userName != null || name.trim().isEmpty()){
            throw new DataTypeInvalidException("The username cannot be null or empty");
        }else {
            this.userName = name;
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws DataTypeInvalidException {
        if(password != null || password.trim().isEmpty()){
            throw new DataTypeInvalidException("The game name cannot be null or ");
        }else if(this.password.length()<8){
            throw new DataTypeInvalidException("The password must be at least 8 characters.");
        } else {
            this.password = password;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws DataTypeInvalidException {
        if (name != null || name.trim().isEmpty()) {
            throw new DataTypeInvalidException("The name cannot be null or empty");
        } else {
            this.name = name;
        }
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws DataTypeInvalidException{
        if(gender == null || gender.trim().isEmpty()) {
            throw new DataTypeInvalidException("The gender cannot be null or empty");
        }else if(!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female")&& !gender.equalsIgnoreCase("other")){
            throw new DataTypeInvalidException("The gender is not male or female or other.");
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge (int age)throws DataTypeInvalidException {
        if(age <13) {
            throw new DataTypeInvalidException("You must be 13 or older to use this service.");
        }
        this.age = age;

    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) throws DataTypeInvalidException{

        this.profile = profile;
    }

    public ArrayList<Game> getFavoriteGames() {
        return favoriteGames;
    }

    public void setFavoriteGames(ArrayList<Game> favoriteGames) {
        this.favoriteGames = favoriteGames;
    }

    public void addFavouriteGame(Game game) throws DataTypeInvalidException{
        if(this.favoriteGames == null){
            this.favoriteGames = new ArrayList<Game>();
        }
        if(game == null ){
            throw new DataTypeInvalidException("The game cannot be null");
        }else {
            this.favoriteGames.add(game);
        }
    }

    public boolean validate(){
        if(this.userName == null || this.password ==null){
            return false;
        }
        return true;
    }

}

