import java.util.*;

public class Day15_BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        int left = 0;
        int right = n - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                index = mid;
                break;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}