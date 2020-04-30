import java.util.*;

public class EnterIntegers{
    public static void main(String[] args) {
        int sum = 0, amount, i;
        double average;
        Scanner in = new Scanner(System.in);
        //Prompt the user to enter a number of integers
        System.out.print("How many integers? ");
        amount = in.nextInt();
        System.out.print("Enter " + amount + " integers: ");
        int[] arr = new int[amount];
        //Loop for storing array elements
        for (i = 0; i < arr.length; ++i) {
            try {
                arr[i] = in.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR");
            }
        }//for
        System.out.println("The integers from first to last: ");
        //Loop for displaying array elements ascending
        for (i = 0; i < arr.length; ++i) {
            try {
                System.out.print(arr[i] + " ");
            } catch (Exception e) {
                System.out.println("ERROR");
            }
        }//for
        System.out.println("\nThe integers from last to first: ");
        //Loop for displaying array elements in descending order
        for (i = arr.length - 1; i >= 0; --i) {
            try {
                System.out.print(arr[i] + " ");
            } catch (Exception e) {
                System.out.println("ERROR");
            }
        }//for
        //Loop for adding all elements of the array
        for (int num : arr) {
            sum = num + sum;
        }//for
        //Sum of all elements in the array
        System.out.println("\nThe sum of all the integers is: " + sum);
        //Average of all elements in the array
        average = sum / arr.length;
        System.out.println("The average if all the integers is " + average);
    }//main
}//Class