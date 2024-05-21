public class Print_Unique_Elements_Array {
    public static void main(String[] args) {
        int arr[] = {5, 6, 3, 3, 2, 2};
        // to find unique in string we need to convert string into character array

        for (int i = 0; i < arr.length; i++) {
            boolean unique = true; // Assume element is unique until proven otherwise

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) { // Avoid comparing the element with itself
                    unique = false; // If a duplicate is found, mark as not unique
                    break;
                }
            }

            if (unique) {
                System.out.println(arr[i]); // Print if element is unique
            }
        }
    }
    }

