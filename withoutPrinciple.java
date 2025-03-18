public class UserManager {
    private String name;
    private int age;

    public UserManager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayUser() {
        System.out.println("User: " + name + ", Age: " + age);
    }

    public void logMessage(String message) {
        System.out.println("LOG: " + message);
    }

    public int addNumbers(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        UserManager user = new UserManager("Alice", 25);
        user.displayUser();
        user.logMessage("User created.");
        System.out.println("Sum: " + user.addNumbers(5, 10));
    }
}
