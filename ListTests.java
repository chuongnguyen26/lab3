import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.*;

public class ListTests {
    @Test
    public void testListExample(){
        StringCheck sc = new StringCheck();
        List<String> actual = new ArrayList<String>(Arrays.asList("hi", 
        "hello", "how are you"));
        // String[] expect = new String[]{"hi", "hello", "how are you"};
        ArrayList<String> expect = new ArrayList<String>(Arrays.asList("hi", "hello", 
        "how are you"));

        assertEquals(expect, ListExamples.filter(actual,sc));

    }

}
