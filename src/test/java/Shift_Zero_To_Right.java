public class Shift_Zero_To_Right {

    public static void main(String[] args) {
        int[] intArray = new int[]{1, 0, 2, 0, 3, 4, 0, 5, 6, 0, 7, 8, 9, 10}; // Sample array with zeros
        int[] newArray = new int[intArray.length]; // Creating a new array to store the result
        int count = 0;

        // First, copy all non-zero elements to the beginning of the new array
        for (int number : intArray) {
            if (number != 0) {
                newArray[count] = number;
                count++;
            }
        }

        // Then, fill the remaining elements of the new array with zeros
        while (count < newArray.length) {
            newArray[count] = 0;
            count++;
        }

        // Print the new array
        System.out.println("Original Array: " + Arrays.toString(intArray));
        System.out.println("Array with Zeros Shifted to Right: " + Arrays.toString(newArray));
    }
}
