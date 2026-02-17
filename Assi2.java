class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String studentId;

    Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Student ID: " + studentId);
    }
}

class GraduateStudent extends Student {
    String researchTopic;

    GraduateStudent(String name, int age, String studentId, String researchTopic) {
        super(name, age, studentId);
        this.researchTopic = researchTopic;
    }

    void displayResearchDetails() {
        displayStudent();
        System.out.println("Research Topic: " + researchTopic);
    }
}

public class Assi2{
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent("Rahul", 23, "S123", "Artificial Intelligence");
        gs.displayResearchDetails();
    }
}
