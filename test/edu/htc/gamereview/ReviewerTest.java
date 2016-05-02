package edu.htc.gamereview;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;
/**
 * Created by Sam on 4/10/2016.
 */
public class ReviewerTest {
    private Reviewer testReviewer;
    @Before
    public void setup(){
        testReviewer = new Reviewer();
    }

    @Test(expected = InvalidDataTypeException.class)
    public void setPassword_null() throws InvalidDataTypeException{
        testReviewer.setPassword(null);
    }

    @Test(expected = InvalidDataTypeException.class)
    public void setPassword_empty() throws InvalidDataTypeException{
        testReviewer.setPassword("");
    }

    @Test(expected = InvalidDataTypeException.class)
    public void setPassword_tooShort() throws InvalidDataTypeException{
        testReviewer.setPassword("pwd");
    }
    @Test
    public void setPassword() throws InvalidDataTypeException{
        testReviewer.setPassword("password");
        assertEquals("password", testReviewer.getPassword());
    }

    @Test(expected = InvalidDataTypeException.class)
    public void setName_null() throws InvalidDataTypeException{
        testReviewer.setName(null);
    }

    @Test(expected = InvalidDataTypeException.class)
    public void setName_empty() throws InvalidDataTypeException{
        testReviewer.setName("");
    }

    @Test
    public void setName() throws InvalidDataTypeException{
        testReviewer.setName("Gamer McGamerton");
        assertEquals("Gamer McGamerton", testReviewer.getName());
    }

    @Test(expected = InvalidDataTypeException.class)
    public void setUserName_null() throws InvalidDataTypeException{
        testReviewer.setUserName(null);
    }

    @Test(expected = InvalidDataTypeException.class)
    public void setUserName_empty() throws InvalidDataTypeException{
        testReviewer.setUserName("");
    }

    @Test
    public void setUserName() throws InvalidDataTypeException{
        testReviewer.setUserName("username");
        assertEquals("username", testReviewer.getUserName());
    }

    @Test(expected = InvalidDataTypeException.class)
    public void setAge_under13() throws InvalidDataTypeException{
        testReviewer.setAge(8);
    }

    @Test
    public void setAge() throws InvalidDataTypeException{
        testReviewer.setAge(18);
        assertEquals(18, testReviewer.getAge());
    }

    @Test(expected = InvalidDataTypeException.class)
    public void setGender_NotMFO() throws InvalidDataTypeException{
        testReviewer.setGender("toaster");
    }

    @Test
    public void setGender_lowerCase() throws InvalidDataTypeException{
        testReviewer.setGender("male");
        assertEquals("male", testReviewer.getGender());
    }
    @Test
    public void setGender_UpperCase() throws InvalidDataTypeException{
        testReviewer.setGender("FEMALE");
        assertEquals("FEMALE", testReviewer.getGender());
    }
    @Test
    public void setGender_mixedCase() throws InvalidDataTypeException{
        testReviewer.setGender("Other");
        assertEquals("Other", testReviewer.getGender());
    }

    @Test
    public void validate_true() throws InvalidDataTypeException{
        testReviewer.setUserName("user");
        testReviewer.setPassword("password");
        assertEquals(true, testReviewer.validate());
    }

    @Test
    public void validate_falseUserName() throws InvalidDataTypeException{
        testReviewer.setPassword("password");
        assertEquals(false, testReviewer.validate());
    }

    @Test
    public void validate_falsePassword() throws InvalidDataTypeException{
        testReviewer.setUserName("user");
        assertEquals(false, testReviewer.validate());
    }
}
