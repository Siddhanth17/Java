import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        system.out.println("ArrayList: " + list);
        list.remove(2);
        system.out.println("After removing element at index 2: " + list);


        system.out.println("Size of ArrayList: " + list.size());
    }
}