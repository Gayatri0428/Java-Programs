import java.util.ArrayList;
import java.util.Scanner;

public class Day41_SumAverageArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.size();

        System.out.println("\nArrayList: " + numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        sc.close();
    }
}