import java.util.ArrayList;
import java.util.Scanner;

public class Day44_LargestArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        int largest = numbers.get(0);

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("\nArrayList: " + numbers);
        System.out.println("Largest element: " + largest);

        sc.close();
    }
}