import java.util.Scanner;

class Eggs{
    public static void main(String[] args) {
        // Write your code here
        double dozenEggs = 3.25;
        double looseEggs = 0.45;
        int o;
        int p;
        int numEggs;
        double total;
        
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter the number of eggs in the order: ");
        numEggs = inputDevice.nextInt();
        o = numEggs % 12;
        p = numEggs / 12;
        total = (o * looseEggs) + (p * dozenEggs);
        
        System.out.print("You ordered " + numEggs);
        System.out.print(" eggs. That’s " + p);
        System.out.print(" dozen at $3.25 per dozen and " + o);
        System.out.print(" loose eggs at 45 cents each for a total of $" + total);
    }
}
