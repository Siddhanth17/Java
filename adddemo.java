public class adddemo {
    private int a = 10;
    private int b = 20;

    protected int l = 30;

    public int add() {
        return a + b;
    }

    public static void main(String[] args) {
        adddemo demo = new adddemo();
        int result = demo.add();
        System.out.println("The sum is: " + result);
    }

    protected void addprotected(int a, int b) {
        System.out.println("The sum is: " + (a + b));
    }


}

