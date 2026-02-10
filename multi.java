class grandparent {
    void show() {
        System.out.println("I am grandparent");
    }
}

class parent extends grandparent {
    void display() {
        System.out.println("I am parent");
    }
}

class child extends parent {
    void print() {
        System.out.println("I am child");
    }
}

class multi{
    public static void main(String args[]) {
        child c = new child();
        c.print();
        c.display();
        c.show();
    }
}