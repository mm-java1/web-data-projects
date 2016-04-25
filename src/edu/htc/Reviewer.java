package edu.htc;

import java.util.ArrayList;

/**
 * Created by volkg_000 on 4/6/2016.
 */
public class Reviewer {
    String name;
    int age;
    String gender;
    String profileinfo;
    String password;

    boolean validName = false;
    boolean validAge = false;
    boolean validGender = false;
    boolean validPassword = false;



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


    public boolean validateReviewer() {
        if (validName == true && validPassword == true && validGender == true && validAge == true) {
            System.out.println("Fields in the Reviewer class are valid");
            return true;
        } else {
            System.out.println("Fields in the Reviewer class are not valid");
            return false;
        }

    }

    //ReviewerName property
    public String getName() {

        return name;
    }

    public void setName(String name) throws InvalidDataException {

        if(name.length() >= 3) {
            this.name = name;
            validName = true;

        }
        else {
            throw new InvalidDataException("Name of Reviewer must be at least 3 characters");
        }

    }
    //Age property
    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidDataException {
        if (age > 0 && age < 99) {
            this.age = age;
            validAge = true;

        }

        else {
            throw new InvalidDataException("Reviewers age is required and cannot be less than 0 and cannot be greater than 98");
        }
    }

   //Gender Property
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws InvalidDataException {
        if(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) {
            this.gender = gender;
            validGender = true;

        }

        else if(gender.equalsIgnoreCase("")) {
                throw new InvalidDataException("Reviewer's gender cannot be null");
            }

        else {
            throw new InvalidDataException("Reviewer's gender must be either male or female");
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
        if(password.length() >= 5) {
            this.password = password;
            validPassword = true;

        }
        else {
            throw new InvalidDataException("Password must be atleast 5 characters long");
        }
    }


    //FavoriteGames Property
    public ArrayList<Game> getFavoriteGames() {
        return favoritegames;
    }

    public void setFavoriteGames(ArrayList<Game> favoritegames) throws InvalidDataException {
        if(favoritegames != null) {
            this.favoritegames = favoritegames;


        }

        else {
            throw new InvalidDataException("Array of favoritegames is empty");
        }
    }

    public void addGame(Game game) {
        if(favoritegames == null) {
            favoritegames = new ArrayList<Game>();
        }

        favoritegames.add(game);

    }

}
