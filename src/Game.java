import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 4/5/16.
 */
public class Game {

    private String gameName;
    private String releaseDate;
    private String platform;
    private int averageRating;
    private List tags = new ArrayList<>();
    private List reviews = new ArrayList<String>();


    public Game (String gameName, String releaseDate, String platform,  int averageRating, String newTag, String newReview){
        this.setGameName(gameName);
        this.setReleaseDate(releaseDate);
        this.setPlatform(platform);
        this.setAverageRating(averageRating);
        tags.add(newTag);
        reviews.add(newReview);
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

    public String setGameName(String gameName) {
        this.gameName = gameName;
        return gameName;
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

    public ArrayList getTags() {
        return (ArrayList) tags;
    }

    public void setTags(ArrayList tags) {
        this.tags = tags;
    }

    public void addTag(String newTag){
        tags.add(newTag);
    } // add additional tag

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    public ArrayList getReviews() {
        return (ArrayList)reviews;
    }

    public void setReviews(ArrayList reviews) {
        this.reviews = reviews;
    }
    public void addReview(String newReview){
        reviews.add(newReview);
    }

}


