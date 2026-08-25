import java.util.ArrayList;
import java.util.Scanner;

public class Day37_SecondSmallestArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Enter at least 2 elements.");
            sc.close();
            return;
        }

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        Integer smallest = null;
        Integer secondSmallest = null;

        for (int number : numbers) {

            if (smallest == null || number < smallest) {

                if (smallest != null && number != smallest) {
                    secondSmallest = smallest;
                }

                smallest = number;

            } else if (number != smallest &&
                       (secondSmallest == null || number < secondSmallest)) {

                secondSmallest = number;
            }
        }

        System.out.println("\nArrayList: " + numbers);

        if (secondSmallest == null) {
            System.out.println("There is no second smallest unique number.");
        } else {
            System.out.println("Smallest: " + smallest);
            System.out.println("Second Smallest: " + secondSmallest);
        }

        sc.close();
    }
}