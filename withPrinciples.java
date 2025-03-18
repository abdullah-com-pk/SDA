// Manages user-related tasks
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayUser() {
        System.out.println("User: " + name + ", Age: " + age);
    }
}

// Handles logging
public class Logger {
    public void logMessage(String message) {
        System.out.println("LOG: " + message);
    }
}

// Performs calculations
public class Calculator {
    public int addNumbers(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        User user = new User("Alice", 25);
        user.displayUser();

        Logger logger = new Logger();
        logger.logMessage("User created.");

        Calculator calculator = new Calculator();
        System.out.println("Sum: " + calculator.addNumbers(5, 10));
    }
}
