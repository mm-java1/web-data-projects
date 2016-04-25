package edu.htc.MoonflowerGameReview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by clifford.mauer on 4/11/2016.
 */
public class Reviewer {

    private String Name; //** (screen name or user name)
    private Integer Age;
    private String Gender;
    private String Comments; //** - whatever text they want to share
    private ArrayList<String> FavoriteGames = new ArrayList();
    private String Password;

    public String getName() {
        return Name;
    }

    public void setName(String name) throws InvalidDataTypeException {
        //**Check if name is null or empty
        if (name == "" || name == null){
            throw new InvalidDataTypeException("Name cannot be blank");
        }

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

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
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

    public void setPassword(String password) {
        Password = password;
    }

    public ArrayList addFavoriteGame(String favoriteGame) throws InvalidDataTypeException {

        //**Check if favorite game is a number
        try {
            Integer.parseInt(favoriteGame);
            // str[i] is numeric
            throw new InvalidDataTypeException("Favorite Game cannot be a number");

        } catch (NumberFormatException ignored) {
            // str[i] is not numeric
        }

        int intFavoriteGames ;
        if (favoriteGame == null){
            intFavoriteGames = 0;
        }
        else {
            intFavoriteGames = FavoriteGames.size();
        }

        if (intFavoriteGames == 0){
            FavoriteGames = new ArrayList<String>();
            FavoriteGames.add(favoriteGame);
        }
        else {
            FavoriteGames.add(favoriteGame);
        }

        return  FavoriteGames;

    }

}
