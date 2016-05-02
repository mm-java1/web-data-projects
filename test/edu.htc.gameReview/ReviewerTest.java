package edu.htc.gameReview;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Gyan on 4/18/2016.
 */
public class ReviewerTest {


    @Test(expected = DataTypeInvalidException.class)
    public void reviewer_setUserNameNull() throws DataTypeInvalidException{
        Reviewer reviewer = new Reviewer();
        reviewer.setUserName(null);
    }

    @Test
    public void reviewer_setUserName() throws DataTypeInvalidException{
        Reviewer reviewer = new Reviewer();
        reviewer.setUserName("UserOne");
        assertEquals("UserOne",reviewer.getUserName());
    }


    @Test(expected = DataTypeInvalidException.class)
    public void reviewer_setPasswordNull() throws DataTypeInvalidException {
        Reviewer reviewer = new Reviewer();
        reviewer.setPassword(null);
    }

    @Test(expected = DataTypeInvalidException.class)
    public void reviewer_setPasswordEmpty() throws DataTypeInvalidException {
        Reviewer reviewer = new Reviewer();
        reviewer.setPassword(" ");
    }

    @Test(expected = DataTypeInvalidException.class)
    public void reviewer_setPasswordLessThanEight() throws DataTypeInvalidException{
        Reviewer reviewer = new Reviewer();
        reviewer.setPassword("1234567");
    }

    @Test
    public void reviewer_setPassword() throws DataTypeInvalidException{
        Reviewer reviewer = new Reviewer();
        reviewer.setPassword("1T345678");
        assertEquals("1T345678",reviewer.getPassword());
    }

    @Test(expected = DataTypeInvalidException.class)
    public void reviewer_setGenderNull() throws DataTypeInvalidException{
        Reviewer reviewer = new Reviewer();
        reviewer.setGender(null);

    }

    @Test(expected = DataTypeInvalidException.class)
    public void reviewer_setGenderNotFromList() throws DataTypeInvalidException{
        Reviewer reviewer = new Reviewer();
        reviewer.setGender("human");

    }

    @Test
    public void reviewer_setGenderFromList() throws DataTypeInvalidException{
        Reviewer reviewer = new Reviewer();
        reviewer.setGender("Male");
        assertEquals("Male",reviewer.getGender());
    }

    @Test(expected = DataTypeInvalidException.class)
    public void reviewer_setAgeNull() throws DataTypeInvalidException{
        Reviewer reviewer = new Reviewer();
        reviewer.setGender(null);
    }

    @Test(expected = DataTypeInvalidException.class)
    public void reviewer_setAgeUnderAge() throws DataTypeInvalidException{
        Reviewer reviewer = new Reviewer();
        reviewer.setAge(10);
    }

    @Test
    public void reviewer_setAge() throws DataTypeInvalidException{
        Reviewer reviewer = new Reviewer();
        reviewer.setAge(15);
        assertEquals(15,reviewer.getAge());
    }

}
