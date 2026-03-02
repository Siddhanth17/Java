public class excp{
    public static void main(String[] args) {
        try {
            int a = 5 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}