package edu.htc;

/**
 * Created by Student on 4/25/2016.
 */
public class Player {

    private String playerName;
    private int age;
    private String gender;

    public Player(){

    };

    public Player(String playerName, int age, String gender){
        this.playerName= playerName;
        this.age= age;
        this.gender = gender;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}

