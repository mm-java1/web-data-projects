/*
 * Created by Administrator on 4/5/16.
 */

import com.sun.media.sound.InvalidDataException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameClassTest {
    Game game;



    @Before
    public void setup(){
        game = new Game();

    }

    /*
    SET GAME NAME
     */
    @Test (expected = InvalidDataTypeException.class)
    public void setName_isNull() throws InvalidDataTypeException {
        game.setName(null);
    }

    @Test (expected = InvalidDataTypeException.class)
    public void setName_isEmpty() throws InvalidDataTypeException {
        game.setName("");
    }

    @Test
    public void setName() throws InvalidDataTypeException {
        String name = "Game Name";
        game.setName(name);
        assertEquals(name, game.getName());
    }

    /*
    SET YEAR RELEASED
     */
    @Test(expected = InvalidDataTypeException.class)
    public void setYearReleased_isNull() throws InvalidDataTypeException {
        game.setYearReleased(null);
    }
    @Test(expected = InvalidDataTypeException.class)
    public void setYearReleased_isEmpty() throws InvalidDataTypeException {
        game.setYearReleased("");
    }
    @Test(expected = InvalidDataTypeException.class)
    public void setYearReleased_isNot4Digits() throws InvalidDataTypeException {
        game.setYearReleased("199");
    }

    @Test
    public void setYearReleased() throws InvalidDataTypeException {
        String year = "1997";
        game.setYearReleased(year);
        assertEquals(year, game.getYearReleased());

    }
    /*
    SET PLATFORM
     */
    @Test(expected = InvalidDataTypeException.class)
    public void setPlatform_isNull() throws InvalidDataTypeException {
        game.setPlatform(null);
    }
    @Test(expected = InvalidDataTypeException.class)
    public void setPlatform_isEmpty() throws InvalidDataTypeException {
        game.setPlatform("");
    }
    @Test
    public void setPlatform() throws InvalidDataTypeException {
        String platform = "Xbox";

        game.setPlatform("Xbox");
        assertEquals(platform, game.getPlatform());

    }
    /*
    SET AVERAGE set via database no validation needed
     */

    /*
    ADD TAGS
     */
    @Test(expected = InvalidDataTypeException.class)
    public void addTag_isNull() throws InvalidDataTypeException {
        game.addTag(null);
    }
    @Test(expected = InvalidDataTypeException.class)
    public void addTag_isEmpty() throws InvalidDataTypeException {
        game.addTag("");
    }
    @Test
    public void addTag() throws InvalidDataTypeException {
        String tag = "Tag Name";
        game.addTag(tag);
        ArrayList<String> tags = game.getTags();
        String tagName = tags.get(0);
        assertEquals(tag, tagName);
    }

    /*
    ADD REVIEW
     */
    @Test (expected = InvalidDataTypeException.class)
        public void addReview_null() throws InvalidDataTypeException{
        game.addReview(null);
    }


    @Test
    public void addReview() throws InvalidDataTypeException{

        game.setName("doom");
        game.setPlatform("Xbox");
        game.setYearReleased("1997");
        game.setAverageRating(3);

        Review review = new Review();
        review.setDate(new Date());
        review.setComments("comments");
        review.setStarRating(4);
        game.addReview(review);

        if (game.getReviews().size()==1){
            System.out.println("review exists for game");
        }

    }

    /*
    VALIDATE RECORD
     */

    @Test
    public void validateRecord_gameNameIsEmpty(){
        try {
            game.setName("");
            game.setYearReleased("1997");
            game.setPlatform("Xbox");
        } catch (InvalidDataTypeException e) {
        }
        assertEquals(false, game.validate());
    }

    @Test
    public void validateRecord_noPlatform(){
        try {
            game.setName("Name1");
            game.setYearReleased("1997");
            game.setPlatform("");
        } catch (InvalidDataTypeException e) {
        }
        assertEquals(false, game.validate());
    }

    @Test
    public void validateRecord_noYear(){
        try {
            game.setName("Name2");
            game.setYearReleased("");
            game.setPlatform("Xbox");
        } catch (InvalidDataTypeException e) {
        }
        assertEquals(false, game.validate());
    }



}

