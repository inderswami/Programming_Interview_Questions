public class Print_Reverse_Integer {

    public static void main(String[] args){

    }

    public int rverese(int n){
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
        // int rev=0
        //while (n!=0)
        //int digit=n%10;
        //rev=rev*10+digit;
        //n/=10;


    }
}
