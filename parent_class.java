class parent {

    void method1() {
        System.out.println("Parent method 1");
    }

    void method2() {
        System.out.println("Parent method 2");
    }

    void method3() {
        System.out.println("Parent method 3");
    }
}

class Child extends parent {

    void display() {
        super.method1();
        super.method2();
        super.method3();

        System.out.println("Child class display method");
    }
}

public class parent_class {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
