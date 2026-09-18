import java.util.ArrayList;
import java.util.Scanner;

public class Day47_AverageEvenOddArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        int evenSum = 0;
        int oddSum = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
                evenCount++;
            } else {
                oddSum += number;
                oddCount++;
            }
        }

        System.out.println("\nArrayList: " + numbers);

        if (evenCount > 0) {
            double evenAverage = (double) evenSum / evenCount;
            System.out.println("Average of even numbers: " + evenAverage);
        } else {
            System.out.println("No even numbers found.");
        }

        if (oddCount > 0) {
            double oddAverage = (double) oddSum / oddCount;
            System.out.println("Average of odd numbers: " + oddAverage);
        } else {
            System.out.println("No odd numbers found.");
        }

        sc.close();
    }
}