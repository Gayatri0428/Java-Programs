import java.util.*;

public class Day66_CopyArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++)
            list1.add(sc.nextInt());

        ArrayList<Integer> list2 = new ArrayList<>(list1);

        System.out.println("Original ArrayList: " + list1);
        System.out.println("Copied ArrayList: " + list2);

        sc.close();
    }
}