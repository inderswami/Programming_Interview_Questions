public class Write_Program_To_Swap_Numbers {
    public static void main(String[] args) {

        //Approach 1  using temp variable

        int x=10;
        int y=20;
        System.out.println("Before Swap::");
        System.out.println(x);
        System.out.println(y);
        int temp=0;

        temp=x;
        x=y;
        y=temp;
        System.out.println("After Swap::");
        System.out.println(x);
        System.out.println(y);
//Aproach 2 without using temp

        int a=10;
        int b=20;
        System.out.println("Before Swap");
        System.out.println(a);
        System.out.println(b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap");
        System.out.println(a);
        System.out.println(b);

//Approach 3 using bitwise or ternary operator


                int k = 5;
                int l = 10;

                System.out.println("Before swapping:");
                System.out.println("k = " + k);
                System.out.println("l = " + l);

                // Swapping using ternary operator and XOR
                k = (k != l) ? k ^ l : k;
                l = (k != l) ? k ^ l : l;
                k = (k != l) ? k ^ l : k;

                System.out.println("After swapping:");
                System.out.println("k = " + k);
                System.out.println("l = " + l);














    }



}
