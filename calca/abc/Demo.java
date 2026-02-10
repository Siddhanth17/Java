package calca.abc;
import addmethod.AddMethod;

public class Demo {
    public static void main(String[] args) {
        AddMethod addmethod = new AddMethod();
        int result = addmethod.add(5, 10);
        System.out.println("The sum is: " + result);
    }
}
