public class Special_Character_String {
    public static void main(String[] args) {
        String str = "Hellow! How is@";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                count++;
                System.out.println(ch);
            }
        }
        System.out.println(count);
    }
}
