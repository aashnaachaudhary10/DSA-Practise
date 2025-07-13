// Importing all classes from java.util package (not mandatory here, but commonly used)
import java.util.*;

// Interface A with an abstract method show()
interface A {
    void show();  // Method to be implemented by any class that implements A
}

// Interface B with an abstract method display()
interface B {
    void display();  // Method to be implemented by any class that implements B
}

// Class C implements both interfaces A and B
// This is how Java supports multiple inheritance using interfaces
class C implements A, B {

    // Implementing method from Interface A
    public void show() {
        System.out.println("Show from A");
    }

    // Implementing method from Interface B
    public void display() {
        System.out.println("Display from B");
    }
}

// Main class to run the program
public class multipleInheritance {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Creating an object of class C
        C obj = new C();

        // Calling methods implemented from both interfaces
        obj.show();     // Output: Show from A
        obj.display();  // Output: Display from B
    }
}
