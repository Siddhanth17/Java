class student{
    String name;

    student(String name){
        this.name = name;
    }
    void display(){
        System.out.println("Student name: " + this.name);
    }
}

public class thisjava{
    public static void main(String args[]){
        student s1 = new student("Alice");
        s1.display();

        student s2 = new student("Bob");
        s2.display();
    }
}