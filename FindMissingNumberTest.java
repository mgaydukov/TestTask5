import org.junit.Test;
import static org.junit.Assert.*;

public class FindMissingNumberTest {

    @Test
    public void testFindMissingNumber_withMissingNumber() {
        int[] array = {1, 2, 4, 5};
        int result = Main.findMissingNumber(array); // Missing: 3
        assertEquals(3, result);
    }

    @Test
    public void testFindMissingNumber_withMissingNumberSecond() {
        int[] array = {12, 10};
        int result = Main.findMissingNumber(array); // Missing: 11
        assertEquals(11, result);
    }

    @Test
    public void testFindMissingNumber_withTwoMissingNumber() {
        int[] array = {3, 2, 1, 6, 7}; // Two numbers are missing
        int result = Main.findMissingNumber(array); // Missing: 4
        assertEquals(4, result);
    }

    @Test
    public void testFindMissingNumber_noMissingNumber() {
        int[] array = {3, 4, 5, 6}; // No missing numbers
        int result = Main.findMissingNumber(array); // Missing: 7
        assertEquals(7, result);
    }

    @Test
    public void testFindMissingNumber_withRepeatingNumber() {
        int[] array = {7, 2, 3, 4, 5, 7, 7}; // Some numbers are repeated
        int result = Main.findMissingNumber(array); // Missing: 6
        assertEquals(6, result);
    }

    @Test
    public void testFindMissingNumber_withOneNumber() {
        int[] array = {1}; // Array with one number
        int result = Main.findMissingNumber(array); // Missing: 2
        assertEquals(2, result);
    }

    @Test
    public void testFindMissingNumber_noNumbers() {
        int[] array = {}; // Array without numbers
        int result = Main.findMissingNumber(array); // Missing: exception
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMissingNumber_invalidArray() {
        int[] array = {-1, 0, 1, 2}; // The array contains a negative number
        Main.findMissingNumber(array); // Missing: exception
    }
}
