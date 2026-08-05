import java.util.*;

public class Day23_DuplicateCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine().toLowerCase();

        char[] chars = text.toCharArray();

        System.out.println("Duplicate Characters:");

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == ' ') {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '0';
                }
            }

            if (count > 1 && chars[i] != '0') {
                System.out.println(chars[i] + " : " + count);
            }
        }

        sc.close();
    }
}