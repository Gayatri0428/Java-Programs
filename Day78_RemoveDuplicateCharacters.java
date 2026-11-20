import java.util.*;

public class Day78_RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (set.add(ch)) {
                result.append(ch);
            }
        }

        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}