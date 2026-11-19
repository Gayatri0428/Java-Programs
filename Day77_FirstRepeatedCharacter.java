import java.util.*;

public class Day77_FirstRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                continue;
            }

            if (set.contains(ch)) {
                System.out.println("First repeated character: " + ch);
                sc.close();
                return;
            }

            set.add(ch);
        }

        System.out.println("No repeated character found.");

        sc.close();
    }
}