import java.util.ArrayList;
import java.util.Scanner;

public class Day52_SearchElementArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        int position = -1;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == target) {
                position = i;
                break;
            }
        }

        System.out.println("\nArrayList: " + numbers);

        if (position != -1) {
            System.out.println("Element " + target + " found at index: " + position);
        } else {
            System.out.println("Element " + target + " not found.");
        }

        sc.close();
    }
}