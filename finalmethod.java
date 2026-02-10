class parent {
    final void display()
    {
        System.out.println("this is final method");
    }
}

class child extends parent {
    // void display() 
    // {
    //     System.out.println("this is child class");
    // }
}

public class finalmethod {
    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
}


