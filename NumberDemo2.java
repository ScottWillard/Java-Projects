import java.util.*;

public class NumberDemo2 {
    private static boolean value = false;
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        System.out.println("-----Operations on 2 numbers-----");
        System.out.print("Press 1 to continue or any other key to quit: ");
        try {
            choice = in.nextInt();
        } catch (Exception e) {
            System.out.println("Hope you enjoyed this app!");
            System.exit(0);
        }
        //try, catch
        if (choice == 1) {
            while (!value) {
                numMenu();
                
                System.out.println("\n-----Operations on 2 numbers-----");
            }
        }//if
        else
            System.exit(0);
    }//main
    
    
    //Methods
    private static void numMenu() {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter the first number: ");
        num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        num2 = in.nextInt();
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);
        System.out.println();
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
        in.close();
    }//NumMenu
    
    public static void displayTwiceTheNumber(int n) {
        final int FACTOR = 2;
        System.out.println(n + " times " + FACTOR + " is " + (n * FACTOR));
    }//displayTwiceTheNumber;
    
    public static void displayNumberPlusFive(int n) {
        final int FACTOR = 5;
        System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
    }//displayNumberPlusFive
    
    public static void displayNumberSquared(int n) {
        System.out.println(n + " squared is " + (n * n));
    }//displayNumberSquared

//End of Methods

}//Class

