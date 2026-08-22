import java.util.ArrayList;
import java.util.Scanner;

public class Day35_RemoveDuplicatesArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("\nOriginal ArrayList: " + numbers);

        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }

        System.out.println("ArrayList after removing duplicates: "
                + uniqueNumbers);

        sc.close();
    }
}