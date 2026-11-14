import java.util.*;

public class Day75_MostFrequentCharacter {
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

        char maxChar = '\0';
        int maxCount = 0;

        for (char ch : map.keySet()) {
            if (map.get(ch) > maxCount) {
                maxCount = map.get(ch);
                maxChar = ch;
            }
        }

        if (maxCount > 0) {
            System.out.println("Most frequent character: " + maxChar);
            System.out.println("Frequency: " + maxCount);
        } else {
            System.out.println("No characters found.");
        }

        sc.close();
    }
}