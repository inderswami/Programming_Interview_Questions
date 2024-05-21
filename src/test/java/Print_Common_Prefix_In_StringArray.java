public class Print_Common_Prefix_In_StringArray {

    public static void main(String[] args) {
        String[] str = {"in", "inder", "india"};
        String str1 = str[0];
        String str2 = str[str.length - 1];
        int index = 0;
        while (index < str1.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break; // Exit loop when a character mismatch is found
            }
        }

        if (index == 0) {
            System.out.println("No common prefix found");
        } else {
            System.out.println("Common Prefix: " + str1.substring(0, index));
        }
    }
}
