import java.util.Arrays;

public class Shift_Zero_To_Right {

    public static void main(String[] args) {
        int[] intArray = new int[]{1, 0, 2, 0, 3, 4, 0, 5, 6, 0, 7, 8, 9, 10}; // Sample array with zeros

        // Shift zeros to the right in the same array
        int count = 0; // Count of non-zero elements

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] != 0) {
                // Swap non-zero element to the leftmost available position
                int temp = intArray[count];
                intArray[count] = intArray[i];
                intArray[i] = temp;
                count++;
//                Test1
            }
        }

        // Print the modified array
        System.out.println("Original Array: " + Arrays.toString(intArray));
    }
}
