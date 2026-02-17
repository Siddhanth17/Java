class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    double calculateTotalSalary() {
        return salary + bonus;
    }

    void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

public class Assi1 {
    public static void main(String[] args) {
        Manager m = new Manager("Siddhanth", 101, 50000, 10000);
        m.displayManagerDetails();
    }
}
