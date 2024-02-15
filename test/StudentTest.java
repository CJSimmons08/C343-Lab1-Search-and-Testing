import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StudentTest {

    @Test
    public void test(){
        test_find_first_true();
        test_find_first_equal();
        test_find_first_true_sorted();
    }

    @Test
    public void test_find_first_true(){
        String test_description = "finding the index of the first true value in an array";
        boolean[] testArray = {false, false, true, false, true};
        try{
            assertEquals(2, Search.find_first_true(testArray, 0, testArray.length));
        }
        catch (Exception e){
            fail(test_description + e.toString());
        }
    }

    @Test
    public void test_find_first_equal(){
        String test_description = "finding the index of the first value equal to x";
        int[] testArray = {33, 11, 4, 5, 99, 5, 32, 75};
        try{
            assertEquals(3, Search.find_first_equal(testArray, 5));
        }
        catch(Exception e){
            fail(test_description + e.toString());
        }
    }

    @Test
    public void test_find_first_true_sorted(){
        String test_description = "finding the index of the first true value of a sorted array";
        boolean[] testArray = {false, false, true, true, true, true, true};
        try{
            assertEquals(2, Search.find_first_true_sorted(testArray, 0, testArray.length));
        }
        catch (Exception e){
            fail(test_description + e.toString());
        }
    }
}
