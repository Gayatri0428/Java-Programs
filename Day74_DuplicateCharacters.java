import java.util.*;

public class Day74_DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Duplicate characters:");

        boolean found = false;

        for (char ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println(ch + " = " + map.get(ch));
                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicate characters found.");
        }

        sc.close();
    }
}