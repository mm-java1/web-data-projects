package edu.htc.gamereview;

import java.util.ArrayList;

/**
 * Created by volkg_000 on 4/6/2016.
 */
public class Reviewer {
    private String name;
    private String userName;
    private int age;
    private String gender;
    private String profileinfo;
    private String password;

    ArrayList<Game> favoritegames;




    public Reviewer() {

    }

    public Reviewer(String name, int age, String gender, String profileinfo, String password, ArrayList<Game> favoritegames) {
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

    public void setName(String name) throws InvalidDataException {

        if(name == null || name.trim().isEmpty()) {
            throw new InvalidDataException("Name cannot be null or empty");
        }

        else {
            this.name = name;
        }

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) throws InvalidDataException {
        if(this.userName != null && !this.userName.trim().isEmpty()) {
            this.userName = userName;
        }
        else {
            throw new InvalidDataException("Reviewer UserName cannot be null or empty");
        }
    }

    //Age property
    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidDataException {
        if (age < 13) {
            throw new InvalidDataException("Reviewer must be 13 years or older to use this service");
        }

        else {
            this.age = age;
        }

    }

   //Gender Property
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws InvalidDataException {
        if(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) {
            this.gender = gender;
        }

        if(this.gender == null || this.gender.trim().isEmpty()) {
            throw new InvalidDataException("Gender cannot be null or empty");
        }


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

    public void setPassword(String password) throws InvalidDataException {

        if(password == null || password.trim().isEmpty()) {
            throw new InvalidDataException("Password cannot be null or empty");
        }

        else if(password.length() < 8) {
            throw new InvalidDataException("Password must be atleast 8 characters long");
        }

        else {
            this.password = password;
        }

    }


    //FavoriteGames Property
    public ArrayList<Game> getFavoriteGames() {
        return favoritegames;
    }

    public void setFavoriteGames(ArrayList<Game> favoritegames) throws InvalidDataException {
       this.favoritegames = favoritegames;
    }

    public void addGame(Game game) throws InvalidDataException {
        if(favoritegames == null) {
            this.favoritegames = new ArrayList<Game>();
        }

        if(game == null) {
            throw new InvalidDataException("Game cannot be null");
        }

        else {
            this.favoritegames.add(game);
        }
    }

    public boolean validate() {
        if(this.userName == null || this.password == null) {
            return false;
        }

        return true;

    }


}
