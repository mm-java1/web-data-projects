package edu.htc.gamereview;

import sun.rmi.server.InactiveGroupException;

import java.util.ArrayList;

/**
 * Created by Student on 4/25/2016.
 */
public class Reviewer {

    private String userName;
    private String password;

    private String name;
    private int age;
    private String gender;
    private String profile;
    private ArrayList<Game> favoriteGames;


    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidDataTypeException{
        if (name == null || name.trim().isEmpty())
        {
            throw new InvalidDataTypeException("The name cannot be null or empty");
        }
        else
            this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) throws InvalidDataTypeException{
        if (userName == null || userName.trim().isEmpty())
        {
            throw new InvalidDataTypeException("The username cannot be null or empty");
        }
        else
            this.userName = userName;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) throws InvalidDataTypeException {
        if (password == null || password.trim().isEmpty())
        {
            throw new InvalidDataTypeException("The password cannot be null or empty");
        }
        else if (this.password.length() < 8)
        {
            throw new InvalidDataTypeException("The password must be at least 8 characters long");
        }
        else
            this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidDataTypeException{
        if (age < 13)
        {
            throw new InvalidDataTypeException("You must be at least 13 to leave a review");
        }
        else
            this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws InvalidDataTypeException {
        if (gender == null || gender.trim().isEmpty())
            throw new InvalidDataTypeException("The gender cannot be null or empty");
        else if (!gender.equals("M") || !gender.equals("F") || !gender.equals("Other"))
            throw new InvalidDataTypeException("The gender must be M, F, or Other");
        else
            this.gender = gender;
    }

    public String getProfile() throws InvalidDataTypeException {
        if (profile == null || profile.trim().isEmpty())
            throw new InvalidDataTypeException("The gender cannot be null or empty");
        else
            return profile;
    }

    public void setProfile(String profile) throws  InvalidDataTypeException{
        if (profile == null || profile.trim().isEmpty())
            throw new InvalidDataTypeException("The profile cannot be null or empty");
        else
            this.profile = profile;
    }

    public ArrayList<Game> getFavoriteGames() {
        return favoriteGames;
    }

    public void setFavoriteGames(ArrayList<Game> favoriteGames) {
        this.favoriteGames = favoriteGames;
    }
    public void addFavoriteGame (Game game) throws InvalidDataTypeException
    {
        if (this.favoriteGames == null)
        {
            this.favoriteGames = new ArrayList<Game>();
        }
        if (game == null)
            throw new InvalidDataTypeException("Game cannot be null");
        else
            this.favoriteGames.add(game);
    }

    public boolean validate ()
    {
        if (this.userName == null || this.password == null)
        {
            return false;
        }
        return true;
    }

}
