import edu.htc.Reviewer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Gyan on 4/18/2016.
 */
public class ReviewerTest {
    @Test
    public void reviewer(){
        Reviewer reviewer = new Reviewer("Robert",24,"Male","Never stop playing","12345");
        assertEquals("Robert", reviewer.getPlayerName());
        assertEquals(24, reviewer.getAge());
        assertEquals("Male", reviewer.getGender());
        assertEquals("Never stop playing", reviewer.getComments());
        assertEquals("12345", reviewer.getPassword());
    }
}
