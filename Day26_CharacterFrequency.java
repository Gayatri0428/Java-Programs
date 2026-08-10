import java.util.*;

public class Day26_CharacterFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine().toLowerCase();

        boolean[] counted = new boolean[text.length()];

        System.out.println("\nCharacter Frequency:");

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ' || counted[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                    counted[j] = true;
                }
            }

            System.out.println(text.charAt(i) + " : " + count);
        }

        sc.close();
    }
}