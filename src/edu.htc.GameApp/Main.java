package edu.htc.GameApp;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("The main class has started.");
        Game myGame = new Game();
        Review myReview = new Review();
        Reviewer myReviewer = new Reviewer();

        myGame.setName("TicTacToe");
        System.out.println(myGame.getName()+ " is the name of the game.");

        myGame.setReleaseDate(2014);
        System.out.println(myGame.getReleaseDate()+ " is the year the game was first released.");

        myGame.setPlatform("Windows10");
        System.out.println("The game is supported on " + myGame.getPlatform());

        myGame.GameTags <String> list= new ArrayList<String>();

    }
}
