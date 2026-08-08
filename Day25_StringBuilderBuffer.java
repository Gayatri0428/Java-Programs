import java.util.*;

public class Day25_StringBuilderBuffer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // StringBuilder
        StringBuilder builder = new StringBuilder(text);

        builder.append(" Java");
        builder.insert(0, "Hello ");
        builder.reverse();

        System.out.println("\nStringBuilder Result: " + builder);

        // StringBuffer
        StringBuffer buffer = new StringBuffer(text);

        buffer.append(" Programming");

        System.out.println("StringBuffer Result: " + buffer);

        sc.close();
    }
}