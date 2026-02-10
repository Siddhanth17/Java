class shape{
    void showshape(){
        System.out.println("This is a shape");
    }
}

class circle extends shape{
    void showcircle(){
        System.out.println("This is a circle");
    }
}

class square extends shape{
    void showsquare(){
        System.out.println("This is a square");
    }
}

public class shapejava{
    public static void main(String args[]){
        circle c = new circle();
        square s = new square();
        
        c.showshape();
        c.showcircle();
        
        s.showshape();
        s.showsquare();
    }
}

