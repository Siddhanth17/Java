interface Animal{
    void sound();
}

class Dog implements Animal{
    public void sound(){
        System.out.println("Woof");
    }
}

class Cat implements Animal{
    public void sound(){
        System.out.println("Meow");
    }
}

public class interfaceexample{
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal c = new Cat();
        a.sound();
        c.sound();
    }
}
