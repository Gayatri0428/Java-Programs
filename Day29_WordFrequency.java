import java.util.Scanner;

public class Day29_WordFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase().trim();

        if (sentence.isEmpty()) {
            System.out.println("No words entered.");
            sc.close();
            return;
        }

        String[] words = sentence.split("");
        boolean[] counted = new boolean[words.length];

        System.out.println("\nWord Frequency:");

        for (int i = 0; i < words.length; i++) {

            if (counted[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    counted[j] = true;
                }
            }

            System.out.println(words[i] + " : " + count);
        }

        sc.close();
    }
}