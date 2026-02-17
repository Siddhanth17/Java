public class stringbuffer{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb.toString());

        sb.insert(5, ",");
        System.out.println(sb.toString());

        sb.replace(0, 5, "Hi");
        System.out.println(sb.toString());

        sb.delete(2, 7);
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb.toString());
    }
}