
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day63_LeftRotateArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter at least one element.");
            sc.close();
            return;
        }

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.print("Enter rotation positions: ");
        int k = sc.nextInt();

        k = ((k % n) + n) % n;

        Collections.rotate(numbers, -k);

        System.out.println("Original rotation result: " + numbers);

        sc.close();
    }
}
