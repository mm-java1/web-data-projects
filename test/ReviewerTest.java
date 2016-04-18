/**
 * Created by cheey on 4/17/2016.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewerTest {

    @Test
    public void setUserName(){
        Reviewer reviewer = new Reviewer();
        reviewer.setUserName("MrBeast");
        assertEquals("MrBeast", reviewer.getUserName());
    }

    @Test
    public void setAge(){
        Reviewer reviewer = new Reviewer();
        reviewer.setAge(27);
        assertEquals(27, reviewer.getAge());
    }

}
