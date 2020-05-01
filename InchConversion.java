import java.util.Scanner;

public class InchConversion {
    public static void main(String args[]) {
        int inches;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter inches: ");
        inches = inputDevice.nextInt();
        convertToFeet(inches);
        convertToYards(inches);
    }
    
    public static void convertToFeet(int inches) {
        double x = inches / 12.0;
        System.out.print(inches);
        System.out.print(" inches is " + x);
        System.out.print(" feet");
        
    }
    
    public static void convertToYards(int inches) {
        double x = inches / 36.0;
        System.out.print(" or " + x);
        System.out.print(" yard(s)");
    }
}
