import java.util.*;

public class PhoneNumberFormat2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String QUIT = "999";
        final int correct = 10;
        System.out.println("Enter 10 digits: ");
        String iP = in.nextLine();
        String input = "";
        String number = "";
        while (!iP.equals(QUIT))
            if (iP.length() != correct)
                iP = "invalid";
            else {
                
                number = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
            }
        System.out.println(number);
    }
}
