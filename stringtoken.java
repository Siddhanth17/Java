import java.util.StringTokenizer;

public class stringtoken{
    public static void main(String[] args) {
        String str = "Hello, World! Welcome to Java programming.";
        StringTokenizer st = new StringTokenizer(str, " ,.!");

        System.out.println("Tokens:");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}