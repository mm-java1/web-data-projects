/*
 * Created by Administrator on 4/5/16.
 */

import java.util.ArrayList;

public class GameClassTest {


    public static void main(String args[]) {
        int x;
        ArrayList<Game> games = new ArrayList<Game>();

        Game game1 = new Game("Game1","1997","Xbox",4,"new tag","review");
        game1.addTag("tag1");
        game1.addTag("tag2");
        game1.addTag("tag3");
        game1.addReview("bad");

        Game game2 = new Game("Game2","2000","Xbox2",5,"tagz","5 stars");
        game2.addTag("tag4");

        games.add(game1);
        games.add(game2);

        for (x = 0; x < games.size(); x++){
            System.out.println(games.get(x).toString());
        }

        System.out.println("\nTags for game1 are: " + game1.getTags());
        System.out.println("Reviews for game1 are " + game1.getReviews());
        System.out.println("Reviews for game2 are: " + game2.getReviews());

        //access via arraylist
        System.out.println("\nTags for game1 via arraylist game2: " + games.get(1).getTags());
    }
}
