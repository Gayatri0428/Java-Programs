import java.util.ArrayList;
import java.util.Scanner;

public class Day48_DuplicateElementsArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        for (int i = 0; i < numbers.size(); i++) {

            for (int j = i + 1; j < numbers.size(); j++) {

                if (numbers.get(i).equals(numbers.get(j))
                        && !duplicates.contains(numbers.get(i))) {

                    duplicates.add(numbers.get(i));
                }
            }
        }

        System.out.println("\nArrayList: " + numbers);

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate elements found.");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }

        sc.close();
    }
}