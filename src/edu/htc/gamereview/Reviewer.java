package edu.htc.gamereview;

import java.util.ArrayList;

/**
 * Created by cheey on 4/17/2016.
 */
public class Reviewer {
    private String userName;
    private String passWord;
    private String name;
    private int age;
    private String gender;
    private String userProfile;
    private ArrayList<Game> favoriteGames = new ArrayList<>();


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) throws InvalidDataTypeException {

        if (userName == null || !userName.toUpperCase().isEmpty()){
            throw new InvalidDataTypeException("UserName cannot be empty/nnll.");
        }

        else {
            this.userName = userName;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidDataTypeException {
        if (name == null){
            throw new InvalidDataTypeException("Name cannot be empty/null.");
        }

        else {
            this.name = name;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidDataTypeException{

            if (age < 13){
                throw new InvalidDataTypeException("Users should be 13 years of age or older. Please get a parent's consent.");
            }

            else {
            this.age = age;
            }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws InvalidDataTypeException {
            if (gender == null || gender.trim().isEmpty()) {
                throw new InvalidDataTypeException("Gender cannot be be empty/null");
            }
            else if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female"))
                throw new InvalidDataTypeException("Please select \"Male\" or \"Female\".");
            else {
                this.gender = gender;
            }

    }

    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) throws InvalidDataTypeException {
            this.userProfile = userProfile;

    }

    public ArrayList<Game> getFavoriteGames() {
        return favoriteGames;
    }

    public void setFavoriteGames(ArrayList<Game> favoriteGames) {
        this.favoriteGames = favoriteGames;
    }

    public void addFavoriteGame(Game game) throws InvalidDataTypeException {
        if (favoriteGames == null){
            favoriteGames = new ArrayList<Game>();
        }

        if (game == null) {
            throw new InvalidDataTypeException("Favorite game cannot be null");
        }
        else {
            this.favoriteGames.add(game);
        }
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) throws InvalidDataTypeException {

            if (passWord == null || passWord.trim().isEmpty()){
                throw new InvalidDataTypeException("Password cannot be empty/null.");
                }
            else if (passWord.length() < 8){
                throw new InvalidDataTypeException("Password should be 8 characters or longer.");
            }

            else {
                this.passWord = passWord;
            }
        }

    public boolean validate(){
        if (this.userName == null) {
            return false;
        }
        if (this.passWord == null) {
            return false;
        }

        return true;
    }

}
