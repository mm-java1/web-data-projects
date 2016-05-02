import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 4/6/16.
 */
public class ReviewerClassTest {
    Reviewer reviewer;

    @Before
    public void setup(){
        reviewer = new Reviewer();
    }

    /*
    SET REVIEWER NAME
     */
    @Test (expected = InvalidDataTypeException.class)
    public void setReviwerName_isNull() throws InvalidDataTypeException {
        reviewer.setName(null);
    }

    @Test (expected = InvalidDataTypeException.class)
    public void setReviewerName_isEmpty() throws InvalidDataTypeException {
        reviewer.setName("");
    }

    @Test
    public void setName() throws InvalidDataTypeException {
        String name = "Reviewer Name";
        reviewer.setName(name);
        assertEquals(name, reviewer.getName());
    }

    /*
    SET USER NAME
     */

    @Test (expected = InvalidDataTypeException.class)
    public void setUserrName_isNull() throws InvalidDataTypeException {
        reviewer.setUserName(null);
    }

    @Test (expected = InvalidDataTypeException.class)
    public void setUserName_isEmpty() throws InvalidDataTypeException {
        reviewer.setUserName("");
    }

    @Test
    public void setUserName() throws InvalidDataTypeException {
        String name = "User Name";
        reviewer.setUserName(name);
        assertEquals(name, reviewer.getUserName());
    }
    /*
    SET AGE
     */

    @Test (expected = InvalidDataTypeException.class)
    public void setAge_isELessThan13() throws InvalidDataTypeException {
        reviewer.setAge(11);
    }

    @Test
    public void setAge() throws InvalidDataTypeException {
        int age = 13;
        reviewer.setAge(age);
        assertEquals(age, reviewer.getAge());
    }

    /*
    SET GENDER
     */
    @Test (expected = InvalidDataTypeException.class)
    public void setGender_isNull() throws InvalidDataTypeException {
        reviewer.setGender(null);
    }

    @Test (expected = InvalidDataTypeException.class)
    public void setGender_isEmpty() throws InvalidDataTypeException {
        reviewer.setGender("");
    }

    @Test(expected = InvalidDataTypeException.class)
    public void setGender_invalid() throws InvalidDataTypeException {
        String name = "M";
        reviewer.setGender(name);
        assertEquals(name, reviewer.getGender());
    }
    @Test
    public void setGender_male() throws InvalidDataTypeException {
        String name = "Male";
        reviewer.setGender(name);
        assertEquals(name, reviewer.getGender());
    }
    @Test
    public void setGender_other() throws InvalidDataTypeException {
        String name = "other";
        reviewer.setGender(name);
        assertEquals(name, reviewer.getGender());
    }
    @Test
    public void setGender_female() throws InvalidDataTypeException {
        String name = "Female";
        reviewer.setGender(name);
        assertEquals(name, reviewer.getGender());
    }
    /*
    SET PROFILE No validation needed
     */

    /*
    SET PASSWORD
     */

    @Test (expected = InvalidDataTypeException.class)
    public void setPassword_isNull() throws InvalidDataTypeException {
        reviewer.setPassword(null);
    }

    @Test (expected = InvalidDataTypeException.class)
    public void setPassword_isEmpty() throws InvalidDataTypeException {
        reviewer.setPassword("");
    }

    @Test (expected = InvalidDataTypeException.class)
    public void setPassword_isLessThan8Digits() throws InvalidDataTypeException {
        reviewer.setPassword("1234567");
    }
    @Test
    public void setPassword() throws InvalidDataTypeException {
        String password = "12345678";
        reviewer.setPassword(password);
        assertEquals(password, reviewer.getPassword());

    }
    /*
    ADD FAVORITE GAME
     */
    @Test (expected = InvalidDataTypeException.class)
    public void setFavoriteGame_isNull() throws InvalidDataTypeException {
        reviewer.addFavoriteGame(null);
    }

    @Test
    public void setFavoriteGame() throws InvalidDataTypeException {
        Game game = new Game();
        reviewer.addFavoriteGame(game);
    }
    /*
    VALIDATE RECORD
     */

    @Test
    public void validateRecord_userNameIsNull(){
        try {
            reviewer.setPassword("123456789");
            reviewer.setUserName(null);

        } catch (InvalidDataTypeException e) {
        }

    }
    @Test
    public void validateRecord_passwordIsShort(){
        try {
            reviewer.setPassword("123456");
            reviewer.setUserName("user1");

        } catch (InvalidDataTypeException e) {
        }

    }

}
