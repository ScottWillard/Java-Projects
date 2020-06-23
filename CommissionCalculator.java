//Name: Scott Willard
//Course: Advanced Java Programming 2805C
//Instructor: Dennis Hunchuck
//Title: Assignment 1

//Imports
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CommissionCalculator {
    
    //Global Variables
    private static double commission, goal, salesAmount;
    private static final double salary = 5000;
    private static boolean value = false;
    
    public static void main(String[] args) {
        //Formatters for currency/decimals outputs
        Locale locale = new Locale("en", "US");
        NumberFormat n = NumberFormat.getCurrencyInstance(locale);
        
        //Prompts the user to enter how much money they want to make in a year
        financialGoal(value);
        
        //Loop for computing the commission needed to meet the financial goal
        for (commission = 0; commission < (goal - salary); commission += 0.001) {
           computeCommission(commission);
        }//for
        
        //Calculates how much the user needs to sell to meet the commission goal
        double result = (5000 * 0.08) + (5000 * 0.10) + (commission / .12);
        
        //Prints the message with the results
        System.out.println("To make " + n.format(goal) + ", the sales amount " + n.format(result) +
                " is needed to make " + "a commission of "+ n.format(commission));
    
        // Displays the table
        System.out.println("--------------------------");
        System.out.println("salesAmount     Commission");
        for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
            System.out.printf("$%-16.0f", salesAmount);
            System.out.printf("$%8.1f\n", computeCommission(salesAmount));
        }//for
    }//main
    
    public static double computeCommission(double salesAmount) {
        //Declare balance and commission and initialize to 0
        double balance = 0, commission = 0;
        
        // If sales amount is $10.000.01 and above, commission rate is 12%
        if (salesAmount >= 10000.01)
            commission += (balance = salesAmount - 10000) * 0.12;
        
        // If sales amount is $5,000.01 to $10,000 commission rate is 10%
        if (salesAmount >= 5000.01)
            commission += (balance -= balance - 5000) * 0.10;
        
        // If sales amount is $0.01 to $5,000.01 commission rate is 8%
        if (salesAmount >= 0.01)
            commission += balance * 0.08;
        return commission;
    }//computeCommission

    public static boolean financialGoal(boolean value){
        Scanner in = new Scanner(System.in);
        while (!value) {
            System.out.print("How much money would you like to make in a year? ");
            //Try/catch for ensuring there are no errors
            try {
                goal = in.nextDouble();
            } catch (Exception e) {
                System.out.println("Error, try again.");
                financialGoal(false);     //Recursion until input is accepted
            }
            value = true;
        }
        return true;
    }//financialGoal
}//class
