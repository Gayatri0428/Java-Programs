import java.util.ArrayList;
import java.util.Scanner;

public class Day31_ArrayListOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Add elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names.add(sc.nextLine());
        }

        System.out.println("\nOriginal ArrayList:");
        System.out.println(names);

        // Access an element
        System.out.println("\nFirst name: " + names.get(0));

        // Update an element
        System.out.print("\nEnter index to update: ");
        int index = sc.nextInt();
        sc.nextLine();

        if (index >= 0 && index < names.size()) {
            System.out.print("Enter new name: ");
            String newName = sc.nextLine();

            names.set(index, newName);
        } else {
            System.out.println("Invalid index.");
        }

        // Search for a name
        System.out.print("\nEnter name to search: ");
        String searchName = sc.nextLine();

        if (names.contains(searchName)) {
            System.out.println(searchName + " is present.");
        } else {
            System.out.println(searchName + " is not present.");
        }

        // Remove an element
        System.out.print("\nEnter index to remove: ");
        int removeIndex = sc.nextInt();

        if (removeIndex >= 0 && removeIndex < names.size()) {
            names.remove(removeIndex);
        } else {
            System.out.println("Invalid index.");
        }

        System.out.println("\nFinal ArrayList:");
        System.out.println(names);

        sc.close();
    }
}