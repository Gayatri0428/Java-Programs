import java.util.ArrayList;
import java.util.Scanner;

public class Day59_FindIndexArrayList {
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

        System.out.print("Enter the element to find: ");
        int target = sc.nextInt();

        int index = numbers.indexOf(target);

        if (index != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println("Element " + target + " not found.");
        }

        sc.close();
    }
}