public class Vowels_Constants_InString {
    public static void main(String[] args) {
        String str="Inder";
        int vowel=0;
        int constant=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowel++;
            }
            else {
                constant++;
            }
        }

        System.out.println("Volwels:"+vowel);
        System.out.println("Constants:"+constant);
    }
}
