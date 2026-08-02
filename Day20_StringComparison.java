import java.util.*;

public class Day20_StringComparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("\n=== String Comparison ===");
        System.out.println("equals(): " + str1.equals(str2));
        System.out.println("equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));
        System.out.println("compareTo(): " + str1.compareTo(str2));
        System.out.println("\n=== Common String Methods ===");
        System.out.println("Length: " + str1.length());
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Contains \"Java\": " + str1.contains("Java"));
        System.out.println("Starts with \"J\": " + str1.startsWith("J"));
        System.out.println("Ends with \"a\": " + str1.endsWith("a"));

        sc.close();
    }
}