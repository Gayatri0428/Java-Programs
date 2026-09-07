import java.util.ArrayList;
import java.util.Scanner;

public class Day43_FrequencyArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.print("Enter the number to find frequency: ");
        int target = sc.nextInt();

        int count = 0;

        for (int number : numbers) {
            if (number == target) {
                count++;
            }
        }

        System.out.println("\nArrayList: " + numbers);
        System.out.println("Frequency of " + target + ": " + count);

        sc.close();
    }
}