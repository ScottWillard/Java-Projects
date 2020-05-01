import javax.swing.*;
import java.util.*;

public class PhoneNumberFormat {
    
    public static void main(String[] args) {
        String inputString;
        String newString;
        final String QUIT = "999";
        final int VALID_LENGTH = 10;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an area code and a phone number (10 digits) or " + QUIT + " to quit: ");
        inputString = scan.nextLine();
        while (!inputString.equals(QUIT)) {
            if (inputString.length() != VALID_LENGTH) {
                newString = "invalid";
            } else {
                newString = "(" + inputString.substring(0, 3) + ") " +
                        inputString.substring(3, 6) + "-" +
                        inputString.substring(6, inputString.length());
            }
            System.out.println("The entered number is: " + newString);
            System.out.println("Enter an area code and a phone number (10 digits) or " + QUIT + " to quit: ");
            inputString = scan.nextLine();
        }
    }
}
