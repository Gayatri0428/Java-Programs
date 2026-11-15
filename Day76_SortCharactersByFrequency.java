import java.util.*;

public class Day76_SortCharactersByFrequency {
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

        List<Character> chars = new ArrayList<>(map.keySet());

        chars.sort((a, b) -> {
            int result = map.get(b) - map.get(a);
            return result != 0 ? result : Character.compare(a, b);
        });

        System.out.println("Characters sorted by frequency:");

        for (char ch : chars) {
            System.out.println(ch + " = " + map.get(ch));
        }

        sc.close();
    }
}