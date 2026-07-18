import java.util.Scanner;

public class Day06_Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("\nFor Loop:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nWhile Loop:");
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n\nDo-While Loop:");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= n);

        sc.close();
    }
}