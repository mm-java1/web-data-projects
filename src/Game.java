import java.util.ArrayList;

/**
 * Created by Sam on 4/10/2016.
 */
public class Game {
    String name;
    int releaseDate;
    int averageRating;
    String platform;
    ArrayList<String> tags = new ArrayList<String>();
    int rating;
    ArrayList<String> reviews = new ArrayList<String>();

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    public Game(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void addTag(String tag){
        tags.add(tag);
    }
    public void addReview (String review){
        reviews.add(review);
    }

    public void seeReviews(){
        for(int i = 0; i < reviews.size(); i++){
            System.out.println(reviews.get(i));
        }
    }
    public void seeTags(){
        for(int i = 0; i < tags.size(); i++){
            System.out.println(tags.get(i));
        }
    }
}
