import java.util.ArrayList;
import java.util.Scanner;

public class Day53_AllOccurrencesArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        ArrayList<Integer> positions = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == target) {
                positions.add(i);
            }
        }

        System.out.println("\nArrayList: " + numbers);

        if (positions.isEmpty()) {
            System.out.println("Element " + target + " not found.");
        } else {
            System.out.println("Element " + target + " found at indexes: " + positions);
            System.out.println("Total occurrences: " + positions.size());
        }

        sc.close();
    }
}