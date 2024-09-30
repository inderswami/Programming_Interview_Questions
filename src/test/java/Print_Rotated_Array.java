public class Print_Rotated_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int rotation = 3;

        System.out.println("Original Array:");
        printArray(arr);

        rotateArray(arr, rotation);

        System.out.println("\nArray after rotation:");
        printArray(arr);
    }

    // Function to rotate the array by given positions
    public static void rotateArray(int[] arr, int rotation) {
        int n = arr.length;
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, rotation - 1);
        reverseArray(arr, rotation, n - 1);
    }

    // Function to reverse the array or a portion of it
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        //
    }
}
