import java.util.*;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        String[] names = {"Ariel", "Brad", "Clifford", "Denise", "Emily",
                "Fred", "Gina", "Henry"};
        Scanner keyboard = new Scanner(System.in);
        int number;
        try {
            number = Integer.parseInt(keyboard.nextLine());
            System.out.println("Name is " + names[number]);
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Subscript out of range. ");
        }
    }
}
