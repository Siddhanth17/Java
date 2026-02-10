public class Hire {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();

        Dog d = new Dog();
        d.bark();
        d.fetch();
        d.eat(); // inherited

        GermanShepherd g = new GermanShepherd();
        g.guard();
        g.runFast();
        g.bark(); // inherited
    }
}