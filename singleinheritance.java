class Parent {
    void display() {
        System.out.println("This is the Parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the Child class.");
    }
}

class singleinheritance {
    public static void main(String args[]) {
        Child c = new Child();
        c.show();
        c.display();
    }
}