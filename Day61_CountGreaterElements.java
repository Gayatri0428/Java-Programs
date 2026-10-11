
import java.util.ArrayList;
import java.util.Scanner;

public class Day61_CountGreaterElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.print("Enter the target number: ");
        int target = sc.nextInt();

        int count = 0;

        for (int num : numbers) {
            if (num > target) {
                count++;
            }
        }

        System.out.println("ArrayList: " + numbers);
        System.out.println(
            "Count of elements greater than " + target + ": " + count
        );

        sc.close();
    }
}
