import java.util.Scanner;

class InchesToFeet_Interactive{
    public static void main(String[] args) {
        // Modify the code below
        final int INCHES_IN_FOOT = 12;
        //int inches = 86;
        int inches;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter the number of inches:");
        inches = inputDevice.nextInt();
        int feet;
        int inchesLeft;
        feet = inches / INCHES_IN_FOOT;
        inchesLeft = inches % INCHES_IN_FOOT;
        System.out.println(inches + " inches is " +
                feet + " feet and " + inchesLeft + " inches");
    }
}
