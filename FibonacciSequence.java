import java.util.*;
import java.lang.Math;

public class FibonacciSequence {            // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
    
    static int x = 1, y = 1, z = 0;
    
    static void printFibonacci(int count) {
        if (count > 0) {
            z = x + y;
            x = y;
            y = z;
            System.out.print(" " + z);
            printFibonacci(count - 1);
        }
    }
  
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("How many iterations?");
        int a = in.nextInt();
        int count = a;
        System.out.print(x + " " + y);
        printFibonacci(count - 2);//n-2 because 2 numbers are already printed
    }
}
