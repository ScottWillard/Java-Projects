import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String args[]) {
        //Local variables
        int num = 0;
        int x = 0;
        
        //Declarations
        System.out.println("Enter an even number: ");
        Scanner foo = new Scanner(System.in);
        
        //Begin while loop
        while (num != 999) {
            num = foo.nextInt();
            if (num == 999) {
                break;
            }
            x = num;
            num = num % 2;
            if (num == 1) {
                System.out.println(x + " is not an even number");
            } else if (num == 0) {
                System.out.println("Good job!");
            }
        }
    }
}



