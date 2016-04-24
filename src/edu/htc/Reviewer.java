package edu.htc;

import java.util.ArrayList;
/**
 * Created by joe on 4/13/2016.
 */
public class Reviewer {

    private String Username;
    private int Age;
    private char Gender;
    private ArrayList<String> Comments = new ArrayList<String>();
    private ArrayList<String> FavoriteGames = new ArrayList<String>();
    private String Password;

    // Constructor
public Reviewer(String username, int age, char gender, ArrayList<String> comments, ArrayList<String> favoriteGames, String password){
    setUsername(username);
    setAge(age);
    setGender(gender);
    setComments(comments);
    setFavoriteGames(favoriteGames);
    setPassword(password);
}


    // Validator

    public boolean Validate(){
        boolean conditon = true;
        if(this.Username == "" || this.Username == " " || this.Username == null){
            conditon = false;
        }
        if(this.Password == "" || this.Password == " " || this.Password == null){
            conditon = false;
        }

        return conditon;
    }






    // UserName get Sets
public String getUsername() {

    return this.Username;
}

    public void setUsername(String username)throws IllegalArgumentException{
        if(username != "" && username != " " && username != null) {
            this.Username = username;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    // Age Get Sets
   public int getAge(){
       return this.Age;
   }
    public void setAge(int age)throws IllegalArgumentException{
        if(age > 0 && age < 130){
            this.Age = age;
        }
        else{
            throw new IllegalArgumentException();
        }

    }


    // Gender Get Sets
    public char getGender(){
        return this.Gender;
    }


    public void setGender(char gender) throws IllegalArgumentException{
        if(gender == 'm'){gender = 'M';}
        if(gender == 'f'){gender = 'F';}
        if(gender == 'M' || gender == 'F'){
            this.Gender = gender;
        }
        else{
            throw new IllegalArgumentException();
        }
    }


    // Comments Get Sets
   public ArrayList<String> getComments(){
       return this.Comments;
   }

    public void setComments(ArrayList<String> comments)throws IllegalArgumentException{
        if(comments != null) {
            this.Comments = comments;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public void addToComments(String comment){
        this.Comments.add(comment);
    }

    // FavoriteGame Get Sets
  public ArrayList<String> getFavoriteGames(){
      return this.FavoriteGames;
  }
    public void setFavoriteGames(ArrayList<String> favoriteGames){
        this.FavoriteGames = favoriteGames;
    }
    public void addToFavoriteGames(String game){
        this.FavoriteGames.add(game);
    }


    // Password Get Sets
  public String getPassword(){
      return this.Password;
  }
    public void setPassword(String password)throws IllegalArgumentException{
        if(password != "" && password != " " && password != null) {
            this.Password = password;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

}
