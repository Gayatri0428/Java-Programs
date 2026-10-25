import java.util.*;
 
public class Day65_SwapElementsArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        System.out.print("Enter two indexes to swap: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= 0 && a < n && b >= 0 && b < n) {
            Collections.swap(list, a, b);
            System.out.println("After swapping: " + list);
        } else {
            System.out.println("Invalid indexes!");
        }

        sc.close();
    }
}