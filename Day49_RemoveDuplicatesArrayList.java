import java.util.ArrayList;
import java.util.Scanner;

public class Day49_RemoveDuplicatesArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        for (int number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }

        System.out.println("\nOriginal ArrayList: " + numbers);
        System.out.println("After removing duplicates: " + uniqueNumbers);

        sc.close();
    }
}