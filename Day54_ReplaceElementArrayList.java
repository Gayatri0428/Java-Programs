import java.util.ArrayList;
import java.util.Scanner;

public class Day54_ReplaceElementArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("ArrayList before replacement: " + numbers);

        System.out.print("Enter the index to replace: ");
        int index = sc.nextInt();

        if (index >= 0 && index < numbers.size()) {

            System.out.print("Enter the new element: ");
            int newElement = sc.nextInt();

            numbers.set(index, newElement);

            System.out.println("ArrayList after replacement: " + numbers);

        } else {
            System.out.println("Invalid index.");
        }

        sc.close();
    }
}