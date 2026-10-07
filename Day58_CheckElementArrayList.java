import java.util.ArrayList;
import java.util.Scanner;

public class Day58_CheckElementArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("ArrayList: " + numbers);

        System.out.print("Enter the element to check: ");
        int target = sc.nextInt();

        if (numbers.contains(target)) {
            System.out.println("Element " + target + " is present in the ArrayList.");
        } else {
            System.out.println("Element " + target + " is not present in the ArrayList.");
        }

        sc.close();
    }
}