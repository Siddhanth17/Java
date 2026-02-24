class invalidexception extends Exception {
    public invalidexception(String message) {
        super(message);
    }
}

public class invalidexception {
    static void validate(int age) throws invalidexception {
        if (age < 18) {
            throw new invalidexception("Age must be at least 18.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validate(15);
        } catch (invalidexception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}