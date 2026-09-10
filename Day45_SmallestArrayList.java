import java.util.ArrayList;
import java.util.Scanner;

public class Day45_SmallestArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        int smallest = numbers.get(0);

        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("\nArrayList: " + numbers);
        System.out.println("Smallest element: " + smallest);

        sc.close();
    }
}