import java.util.*;

public class Day28_ReverseWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("No words entered.");
        } else {
            String[] words = sentence.split("\\s+");

            System.out.println("Sentence with words reversed:");

            for (int i = words.length - 1; i >= 0; i--) {
                System.out.print(words[i] + " ");
            }
        }

        sc.close();
    }
}