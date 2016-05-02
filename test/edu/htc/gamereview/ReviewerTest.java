package edu.htc.gamereview; /**
 * Created by cheey on 4/17/2016.
 */

import edu.htc.gamereview.InvalidDataTypeException;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewerTest {

    @Test
    public void setUserName()throws InvalidDataTypeException {
        Reviewer reviewer = new Reviewer();
        reviewer.setUserName("MrBeast");
        assertEquals("MrBeast", reviewer.getUserName());
    }

    @Test (expected = InvalidDataTypeException.class)
    public void setInvalidUserName()throws InvalidDataTypeException {
        Reviewer reviewer = new Reviewer();
        reviewer.setUserName("Poop");
        assertEquals("Poop", reviewer.getUserName());
    }

    @Test
    public void setAge()throws InvalidDataTypeException {
        Reviewer reviewer = new Reviewer();
        reviewer.setAge(27);
        assertEquals(27, reviewer.getAge());
    }

    @Test (expected = InvalidDataTypeException.class)
    public void setUnderAge()throws InvalidDataTypeException {
        Reviewer reviewer = new Reviewer();
        reviewer.setAge(12);
        assertEquals(12, reviewer.getAge());
    }

    @Test (expected = InvalidDataTypeException.class)
    public void setInvalidPassword() throws InvalidDataTypeException{
        Reviewer reviewer = new Reviewer();
        reviewer.setPassWord("DOG");
        assertEquals("DOG", reviewer.getPassWord());
    }

    @Test
    public void setPassword() throws InvalidDataTypeException{
        Reviewer reviewer = new Reviewer();
        reviewer.setPassWord("dogsandcatsforever");
        assertEquals("dogsandcatsforever", reviewer.getPassWord());
    }

    @Test
    public void setGender() throws InvalidDataTypeException{
        Reviewer reviewer = new Reviewer();
        reviewer.setGender("female");
        assertEquals("female", reviewer.getGender());
    }

    @Test (expected = InvalidDataTypeException.class)
    public void setInvalidGender() throws InvalidDataTypeException{
        Reviewer reviewer = new Reviewer();
        reviewer.setGender("ogre");
        assertEquals("ogre", reviewer.getGender());
    }

}
