class animal {
    void eat() {
        System.out.println("Animal is eating");
    }
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends animal {
    void bark() {
        System.out.println("Dog is barking");
    }
    void fetch() {
        System.out.println("Dog is fetching");
    }
}

class GermanShepherd extends Dog {
    void guard() {
        System.out.println("German Shepherd is guarding");
    }
    void runFast() {
        System.out.println("German Shepherd is running fast");
    }
}

class inherited {
    public static void main(String args[]) {
        GermanShepherd gs = new GermanShepherd();
        gs.bark();
        gs.eat();
        gs.guard();
        gs.runFast();
    }
}