import java.util.*;
public class CountSpaces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type something: ");
        int res = CountSpaces.calculateSpaces(in.nextLine());
        System.out.println("The number of white spaces is: " + res);
    }
    
    public static int calculateSpaces(String aString) {
        int i;
        int x = 0;
        int res;
        for (i = 0, x = 0; i < aString.length(); i++) {
            char ch = aString.charAt(i);
            if (ch == ' ')
                x++;
        }
        return x;
    }
    
}
