import java.util.ArrayList;
import java.util.Scanner;

public class Day38_CommonElementsArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> common = new ArrayList<>();

        System.out.print("Enter number of elements for first list: ");
        int n1 = sc.nextInt();

        System.out.println("Enter elements for first list:");
        for (int i = 0; i < n1; i++) {
            list1.add(sc.nextInt());
        }

        System.out.print("Enter number of elements for second list: ");
        int n2 = sc.nextInt();

        System.out.println("Enter elements for second list:");
        for (int i = 0; i < n2; i++) {
            list2.add(sc.nextInt());
        }

        for (int number : list1) {
            if (list2.contains(number) && !common.contains(number)) {
                common.add(number);
            }
        }

        System.out.println("\nFirst ArrayList: " + list1);
        System.out.println("Second ArrayList: " + list2);
        System.out.println("Common Elements: " + common);

        sc.close();
    }
}