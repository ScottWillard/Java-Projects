import java.util.Scanner;
import java.util.Arrays;

public class StringSort2 {
    
    
    public static void main(String[] args) {
        String[] values = new String[15];
        int x = 0;
        int count = 0;
        String word;
        final String QUIT = "zzz";
        boolean didUserQuit = false;
        Scanner in = new Scanner(System.in);
        for (x = 0; x < values.length; ++x)
            values[x] = QUIT;
        x = 0;
        System.out.println("Enter a word or " + QUIT + " to quit");
        while (x < values.length) {
            word = in.nextLine();
            if (word.equals(QUIT)) {
                count = x;
                x = values.length;
                didUserQuit = true;
            } else {
                values[x] = word;
                ++x;
            }
        }
        if (!didUserQuit)
            count = values.length;
        String message = "Values:";
        Arrays.sort(values);
        for (x = 0; x < count; ++x)
            message = message + "  " + values[x];
        System.out.println(message);
    }
}

