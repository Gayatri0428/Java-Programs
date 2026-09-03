import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day40_ReverseArrayList {
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

        Collections.reverse(numbers);

        System.out.println("Reversed ArrayList: " + numbers);

        sc.close();
    }
}