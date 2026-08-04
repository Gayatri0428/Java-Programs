import java.util.*;

public class Day22_RemoveSpaces {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String result = text.replace(" ", "");

        System.out.println("String after removing spaces: " + result);

        sc.close();
    }
}