import java.util.Arrays;

/*
* According to the condition, we are given an array with a missing element.
* Even if we can determine the sequence in which no element is missed, it is still an array with an element missing.
* In this case, we can add either a number 1 less than the minimum, or 1 more than the maximum.
* Since we are given numbers on the rise, my choice fell to the second option.
*
* Required checks:
* 1.  Presence of negative elements (by the condition, we have only natural numbers).
* 2.  At least one element in the array.
 * */

public class Main {
    public static void main(String[] args) {
    }

    public static int findMissingNumber(int[] array){
        // If the array does not contain numbers, we will throw an exception
        if (array.length < 1)
            throw new IllegalArgumentException("Invalid array. The array doesn't contain a number.");

        // If the array contains a negative number, we will throw an exception
        if (isNegative(array))
            throw new IllegalArgumentException("Invalid array. The array contains negative number.");

        // Sorting an array
        Arrays.sort(array);

        // Finding the missing number
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1] + 1) {
                return array[i - 1] + 1;
            }
        }

        // If the array doesn't contain missing numbers, add a number one greater than the maximum
        return array[array.length - 1] + 1;
    }

    public static boolean isNegative(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                return true;
            }
        }
        return false;
    }
}