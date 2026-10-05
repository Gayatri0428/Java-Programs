import java.util.ArrayList;
import java.util.Scanner;

public class Day57_RemoveElementByValueArrayList {
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

        System.out.print("Enter the element to remove: ");
        int target = sc.nextInt();

        if (numbers.remove(Integer.valueOf(target))) {
            System.out.println("Element " + target + " removed successfully.");
        } else {
            System.out.println("Element " + target + " not found.");
        }

        System.out.println("ArrayList after removal: " + numbers);

        sc.close();
    }
}