import com.sun.media.sound.InvalidDataException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 4/5/16.
 */
public class Game {

    private String gameName = " ";
    private String releaseDate;
    private String platform;
    private int averageRating;
    private ArrayList tags = new ArrayList<>();
    private ArrayList<Review> reviews = new ArrayList<Review>();

    public Game(String gameName, String releaseDate, String platform, int averageRating, ArrayList tags, ArrayList<Review> reviews) throws InvalidDataTypeException {

        try {
            this.setGameName(gameName);
        } catch (InvalidDataTypeException e){
            e.printStackTrace();
        }
        this.releaseDate = releaseDate;
        this.platform = platform;

        try {
            this.setAverageRating(averageRating);
        } catch (InvalidDataTypeException e){
            e.printStackTrace();
        }

        this.tags = tags;
        this.reviews = reviews;
    }

    public Game(String gameName, int averageRating) {
        try {
            this.setGameName(gameName);
        } catch (InvalidDataTypeException e){
            e.printStackTrace();
        }

        try {
            this.setAverageRating(averageRating);
        } catch (InvalidDataTypeException e){
            e.printStackTrace();
        }
    }

    public Game() {

    }

    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", platform='" + platform + '\'' +
                ", averageRating=" + averageRating +
                ", tags=" + tags +
                ", reviews=" + reviews +
                '}';
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) throws InvalidDataTypeException {
        if (gameName.equals(" ") || gameName.isEmpty())
            throw new InvalidDataTypeException("gameName is blank or null");
        else
            this.gameName = gameName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) throws InvalidDataTypeException {
        if (averageRating <= 0 || averageRating > 5)
            throw new InvalidDataTypeException("Average rating must be 0 - 5");
        else
            this.averageRating = averageRating;
    }

    public List getTags() {
        return tags;
    }

    public void setTags(ArrayList tags) {
        this.tags = tags;
    }

    public void addTag(String tag){
        tags.add(tag);
    }


    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public boolean validateRecord(){
        boolean answer =  true;
        if (this.getGameName().equals(" ") || this.getAverageRating() == 0) {
            answer = false;
        }

        return answer;
    }

}


