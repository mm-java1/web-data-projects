package edu.htc.gamereview;

import java.util.ArrayList;

/**
 * Created by karennilson on 4/18/16.
 */
public class Reviewer {
    private String name;
    private String userName;
    private int age;
    private String gender;
    private String profile;
    private ArrayList<Game> favoriteGames;
    private String password;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) throws InvalidDataTypeException {
        if (userName == null || userName.trim().isEmpty()) {
            throw new InvalidDataTypeException("The username cannot be null or empty.");
        } else {
            this.userName = userName;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidDataTypeException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidDataTypeException("The name cannot be null or empty.");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)throws InvalidDataTypeException {
        if (age < 13){
            throw new InvalidDataTypeException("You must be at least 13 years old to use this service");
        } else {
            this.age = age;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws InvalidDataTypeException {
        if (gender == null || gender.trim().isEmpty()) {
            throw new InvalidDataTypeException("The gender cannot be null or empty.");
        } else if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female") && !gender.equalsIgnoreCase("other")) {
            throw new InvalidDataTypeException("The gender is not male/female/other.");
        } else {
            this.gender = gender;
        }
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile){
        }

    public ArrayList<Game> getFavoriteGames() {
        return favoriteGames;
    }

    public void setFavoriteGames(ArrayList<Game> favoriteGames) {
        this.favoriteGames = favoriteGames;
    }

    public void addFavoriteGames(Game game)throws InvalidDataTypeException {
        if (this.favoriteGames == null) {
            this.favoriteGames = new ArrayList<>();
        }
        if (game == null) {
            throw new InvalidDataTypeException("Game cannot be null");
        } else {
            this.favoriteGames.add(game);
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws InvalidDataTypeException {
        if (this.password == null || this.password.trim().isEmpty()) {
            throw new InvalidDataTypeException("The password cannot be null or empty.");
        } else if (this.password.length() < 8) {
            throw new InvalidDataTypeException("The password must be at least 8 characters.");
        } else {
            this.password = password;
        }
    }
    public boolean validate(){
        if (this.userName == null || this.password == null) {
            return false;
        }
        return true;
    }
}
