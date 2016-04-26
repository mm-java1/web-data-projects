package edu.htc.gamereview;

import java.util.ArrayList;

/**
 * Created by Sam on 4/10/2016.
 */
public class Reviewer {
    private String name;
    private String userName;
    private int age;
    private String gender;
    private String profile;
    private String password;
    private ArrayList<Game> favoriteGames = new ArrayList<Game>();

    public Reviewer(String username, String password) {
        this.userName = username;
        this.password = password;
    }

    public Reviewer(){

    };

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws InvalidDataTypeException{

        if (password == null || password.trim().isEmpty()){
            throw new InvalidDataTypeException("The password cannot be null or empty.");
        }else if(password.length() < 8){
            throw new InvalidDataTypeException("The password has to be 8 characters.");
        }
        else {
            this.password = password;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidDataTypeException {

        if (name == null || name.trim().isEmpty()){
            throw new InvalidDataTypeException("The password cannot be null or empty.");
        }else {
            this.name = name;
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) throws InvalidDataTypeException {

        if (userName == null || userName.trim().isEmpty()){
            throw new InvalidDataTypeException("The password cannot be null or empty.");
        }else {
            this.userName = userName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidDataTypeException{
        if (age < 13){
            throw new InvalidDataTypeException("You must be at least 13 to use this service.");
        } else {
            this.age = age;
        }

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws InvalidDataTypeException{
        if (userName == null || userName.trim().isEmpty()){
            throw new InvalidDataTypeException("The password cannot be null or empty.");
        }else if(!gender.equalsIgnoreCase("female") && !gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("other")){
            throw new InvalidDataTypeException("You must enter male, female, or other.");
        }else {
            this.gender = gender;
        }
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setFavoriteGames(ArrayList<Game> favoriteGames) {
        this.favoriteGames = favoriteGames;
    }

    public ArrayList<Game> getFavoriteGames() {
        return favoriteGames;
    }


    public void addFavoriteGsme (Game favGame) throws InvalidDataTypeException{
        if (this.favoriteGames == null){
            this.favoriteGames = new ArrayList<Game>();
        }
        if(favGame == null) {
            throw new InvalidDataTypeException("Favorite Game cannot be null.");
        }else{
            this.favoriteGames.add(favGame);
        }

    }

    public boolean validate(){
        if (this.userName == null || this.password == null){
            return false;
        } else {
            return true;
        }

    }
}
