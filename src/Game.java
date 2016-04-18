import java.util.ArrayList;

/**
 * Created by cheey on 4/17/2016.
 */
public class Game {

    private String gameTitle;
    private int releaseDate;
    private String platform;
    ArrayList<String> gamerTag = new ArrayList<>();
    private int averageRating;
    ArrayList<String> reviews = new ArrayList<>();

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public ArrayList<String> getGamerTag() {
        return gamerTag;
    }

    public void setGamerTag(ArrayList<String> gamerTag) {
        this.gamerTag = gamerTag;
    }

    public void addGamerTag(String gamerTag) {
        this.gamerTag.add(gamerTag);
    }

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<String> reviews) {
        this.reviews = reviews;
    }

    public void addReview (String review){
        this.reviews.add(review);
    }
}
