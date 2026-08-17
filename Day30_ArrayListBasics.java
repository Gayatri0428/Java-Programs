import java.util.ArrayList;
import java.util.Scanner;

public class Day30_ArrayListBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter " + n + " names:");

        for (int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }

        System.out.println("\nNames in the ArrayList:");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\nTotal Names: " + names.size());

        sc.close();
    }
}