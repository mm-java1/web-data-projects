/*
 * Created by Administrator on 4/5/16.
 */

import com.sun.media.sound.InvalidDataException;
import org.junit.Test;

import java.util.ArrayList;

public class GameClassTest {


    public static void main(String args[])  {
        int x;
        Review review = new Review();


        ArrayList<Game> games = new ArrayList<Game>();

        Game game = new Game("name",5);
        game.setPlatform("PS3");
        game.addTag("tag1");
        game.addTag("tag2");

        game.setReleaseDate("1999");

        Game game1 = new Game("Doom",5);

        games.add(game);
        games.add(game1);

        for (x = 0; x < games.size(); x++){
            System.out.println(games.get(x).toString());
        }

    }

    @Test
    public void setGameName_isBlankOrNull(){
        Game game3 = new Game(" ",5);
        try {
            game3.setGameName("");
        } catch (InvalidDataTypeException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void setAverageRating_invalidValue(){
        Game game4 = new Game("Doom",-1);
        try {
            game4.setAverageRating(6);
        } catch (InvalidDataTypeException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void validateRecord_gameNameIsBlank(){
        Game game5 = new Game(" ", 3);
        System.out.println(game5.toString().toUpperCase());
        System.out.println(game5.validateRecord() + " Returns 'false' as it fails gameName");
    }
    @Test
    public void validateRecord_averageRatingInvalid(){
        Game game5 = new Game("Doom", 6);
        System.out.println(game5.toString().toUpperCase());
        System.out.println(game5.validateRecord() + " Returns 'false' as it fails gameName");
    }

}

