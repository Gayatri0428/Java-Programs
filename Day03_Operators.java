import java.util.*;

public class Day03_Operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Arithmetic Operators
        System.out.println("\n=== Arithmetic Operators ===");
        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));

        if (b != 0) {
            System.out.println("Division       : " + (a / b));
            System.out.println("Modulus        : " + (a % b));
        } else {
            System.out.println("Division       : Cannot divide by zero");
            System.out.println("Modulus        : Cannot divide by zero");
        }

        // Relational Operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Logical Operators
        System.out.println("\n=== Logical Operators ===");
        System.out.println("(a > 0 && b > 0) : " + (a > 0 && b > 0));
        System.out.println("(a > 0 || b > 0) : " + (a > 0 || b > 0));
        System.out.println("!(a > b)         : " + !(a > b));

        sc.close();
    }
}