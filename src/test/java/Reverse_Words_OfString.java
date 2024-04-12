public class Reverse_Words_OfString {
    public static String rev(String s){
        String[] words=s.split("");
        String reverse="";
        for (int i=words.length-1;i>=0;i--){
            reverse=reverse+words[i];

        }


    return reverse;
    }

    public static void main(String[] args)
    {

        System.out.println(rev("i am good"));



    }






}
