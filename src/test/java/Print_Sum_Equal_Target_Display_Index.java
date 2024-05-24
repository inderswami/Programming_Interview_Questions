public class Print_Sum_Equal_Target_Display_Index {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length;
        int target = 6;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Index 1: " + i);
                    System.out.println("Index 2: " + j);
                }
            }
        }
    }
}
