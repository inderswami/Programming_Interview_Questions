import java.util.stream.IntStream;

public class Print_1to100_Without_Using_AnyLoop {


    public static void printNum(int num) {

        if (num <= 100) {
            System.out.println(num);
            num++;
            printNum(num);


        }
    }
    public static void main(String[] args) {

printNum(1);
// Using streams
        IntStream.range(1,101).forEach(e->System.out.println(e));



        }


    }




