import java.util.*;

public class Day67_ArrayListToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        Integer[] arr = list.toArray(new Integer[0]);

        System.out.println("ArrayList: " + list);
        System.out.println("Array: " + Arrays.toString(arr));

        sc.close();
    }
}