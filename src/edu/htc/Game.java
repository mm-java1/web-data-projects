package edu.htc;

import java.util.ArrayList;

/**
 * Created by Gyan on 4/18/2016.
 */
public class Game {
    private String gameName;
    private int releaseYear;
    private String platform;
    private String tag;
    private int avgRating;
    private ArrayList<String> listReview = new ArrayList<String>();
    private ArrayList<String> listTags = new ArrayList<String>();

    public Game(String gameName, int releaseYear, String platform, String tag, int avgRating ){
        this.gameName = gameName;
        this.releaseYear = releaseYear;
        this.platform = platform;
        this.tag = tag;
        this.avgRating = avgRating;
    }


    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(int avgRating) {
        this.avgRating = avgRating;
    }

    public ArrayList<String> getListReview() {
        return listReview;
    }

    public void setListReview(ArrayList<String> listReview) {
        this.listReview = listReview;
    }

    public ArrayList<String> getListTags() {
        return listTags;
    }

    public void setListTags(ArrayList<String> listTags) {
        this.listTags = listTags;
    }

    public void addTag(String tag){
        listTags.add(tag);
    }

    public void addReview(String review){
        listReview.add(review);
    }

    public static void main(String[] args) {
       Game game= new Game("Call of Duty 4",2007,"PC, PlayStation, Xbox 360","Action, Shooter",5);
        System.out.println(game.getGameName());
        System.out.println(game.getReleaseYear());


    }


}
