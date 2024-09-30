public class Print_Using_LamdaExpression {

    public static void main(String[] args) {
        System.out.println("test");

        final Runnable lambda = () -> System.out.println("Lambda");

        lambda.run();
    }
}
