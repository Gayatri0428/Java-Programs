
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day62_ThirdLargestArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Enter at least 3 elements.");
            sc.close();
            return;
        }

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        Collections.sort(numbers, Collections.reverseOrder());

        int distinctCount = 0;
        int previous = 0;
        boolean first = true;
        boolean found = false;

        for (int num : numbers) {
            if (first || num != previous) {
                distinctCount++;
                previous = num;
                first = false;
            }

            if (distinctCount == 3) {
                System.out.println("Third largest element: " + num);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Third largest distinct element does not exist.");
        }

        sc.close();
    }
}
