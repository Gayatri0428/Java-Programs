import java.util.ArrayList;
import java.util.Scanner;

public class Day36_SecondLargestArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Enter at least 2 elements.");
            sc.close();
            return;
        }

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        Integer largest = null;
        Integer secondLargest = null;

        for (int number : numbers) {

            if (largest == null || number > largest) {
                if (largest != null && number != largest) {
                    secondLargest = largest;
                }
                largest = number;
            } 
            else if (number != largest &&
                     (secondLargest == null || number > secondLargest)) {
                secondLargest = number;
            }
        }

        System.out.println("\nArrayList: " + numbers);

        if (secondLargest == null) {
            System.out.println("There is no second largest unique number.");
        } else {
            System.out.println("Largest: " + largest);
            System.out.println("Second Largest: " + secondLargest);
        }

        sc.close();
    }
}