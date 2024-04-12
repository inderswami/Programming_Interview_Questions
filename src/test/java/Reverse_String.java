public class Reverse_String {
    public static void main(String[] args) {
String s="Hellow Inder";
String s1=s.toLowerCase();
        //System.out.println(s1);
String rev="";
        for (int i = s1.length() - 1; i >= 0; i--) {
rev=rev+s1.charAt(i);

        }

        System.out.println(rev);
    }


}
