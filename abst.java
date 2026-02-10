abstract class shape {
    abstract void draw();

    void message() {

        System.out.println("this is a shape");
    }
}

class Circle extends shape{
    void draw(){
        System.out.println("drawing a circle");
    }
}
public class abst {
    public static void main(String[] args){
        Circle c = new Circle();
        c.draw();
        c.message();
        
        shape s = new Circle(); 
        s.draw();
        s.message();
        System.out.println(s instanceof shape);
    }
}