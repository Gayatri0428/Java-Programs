import java.util.ArrayList;
import java.util.Scanner;

public class Day55_InsertElementArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("ArrayList before insertion: " + numbers);

        System.out.print("Enter the index to insert: ");
        int index = sc.nextInt();

        if (index >= 0 && index <= numbers.size()) {

            System.out.print("Enter the new element: ");
            int newElement = sc.nextInt();

            numbers.add(index, newElement);

            System.out.println("ArrayList after insertion: " + numbers);

        } else {
            System.out.println("Invalid index.");
        }

        sc.close();
    }
}