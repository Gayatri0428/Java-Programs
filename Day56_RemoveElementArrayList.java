import java.util.ArrayList;
import java.util.Scanner;

public class Day56_RemoveElementArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("ArrayList before removal: " + numbers);

        System.out.print("Enter the index to remove: ");
        int index = sc.nextInt();

        if (index >= 0 && index < numbers.size()) {

            int removedElement = numbers.remove(index);

            System.out.println("Removed element: " + removedElement);
            System.out.println("ArrayList after removal: " + numbers);

        } else {
            System.out.println("Invalid index.");
        }

        sc.close();
    }
}