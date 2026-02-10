class demo{
    demo(){
        this("Default Constructor");
    }
    demo(String message){
        System.out.println(message);
    }
}

public class main {
    public static void main(String[] args) {
        demo obj = new demo();
    }
}