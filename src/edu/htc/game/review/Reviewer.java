package edu.htc.game.review;

import java.util.ArrayList;

/**
 * Created by Joel on 4/15/2016.
 */
public class Reviewer {
    private String uName;
    private String Name;
    private int age;
    private String gender;
    private String profile;
    private ArrayList<Game> favGames = new ArrayList<Game>();
    private String password;

    //construct
  /*  public void Reviewer(String username, int age, char gender, String comment, String password){
        this.uName = username;
        this.age = age;
        this.gender = gender;
        this.passWord = password;
    }*/


    public String getName(){

            return Name;
    }

    public void setName(String name) throws InvalidDataTypeException {
        if (Name == null || Name.trim().isEmpty()) {
            throw new InvalidDataTypeException("the name cannot be null or empty");
        } else {
            this.Name = name;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password)throws InvalidDataTypeException {
        if (this.password == null || this.password.trim().isEmpty()) {
            throw new InvalidDataTypeException("the password cannot be null or empty");
        } else if (password.length() < 8) {
            throw new InvalidDataTypeException("The password must be at least 8 characters");
        }else {
            this.password = password;
        }

    }

    //loginInfo (username and password)
    public String getUserName() {
        return uName;
    }
    public void setUserName(String uName)throws InvalidDataTypeException {
        if (this.uName == null || this.uName.trim().isEmpty()) {
            throw new InvalidDataTypeException("the name cannot be null or empty");
        } else {
            this.uName = uName;
        }

    }

    //age
    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidDataTypeException {
        if (age < 13 ){
            throw new InvalidDataTypeException("No kids allowed, must be older than 13");
        } else {
            this.age = age;
        }

    }
    //gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws InvalidDataTypeException {
        if ( gender == null || gender.trim().isEmpty()) {
            throw new InvalidDataTypeException("must have a gender");
        } else if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female") && !gender.equalsIgnoreCase("other")){
            throw new InvalidDataTypeException("the gender is not male/female/other.");
        }else {
            this.gender = gender;
        }
    }
    //comments

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    //favgames
    public ArrayList<Game> getFavGames() {
        return favGames;
    }

    public void setFavGames(ArrayList<Game> favGames) {
        this.favGames = favGames;
    }
    public void addFavGame(Game game) throws InvalidDataTypeException {
        if (this.favGames == null){
            this.favGames = new ArrayList<Game>();
        }
        if (game == null) {
            throw new InvalidDataTypeException("game cannot be null");
        } else {
            this.favGames.add(game);
        }

    }
    //public void removeFavGame(Game remfGame) {
     //   this.favGames.remove(remfGame);
   // }
    public boolean validate() {
        if (this.uName == null || this.password == null) {
            return false;
        }
        return true;
    }

}
