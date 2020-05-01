import java.util.Scanner;

public class RetirementGoal {
    public static void main(String[] args) {
        // your code here
        int years;
        int money;
        int amt;
        Scanner input = new Scanner(System.in);
        System.out.println("How many years until retirement?");
        years = input.nextInt();
        while (years <= 0) {
            System.out.println("Invalid entry. Years cannot be less than or equal to 0.");
            System.out.println("Please Try again.");
            years = input.nextInt();
        }
        System.out.println(years + " year(s) until your retirement.");
        System.out.println("How much money can you save annually?");
        money = input.nextInt();
        while (money <= 0) {
            System.out.println("Invalid entry. Money cannot be less than or equal to 0.");
            System.out.println("Please try again.");
            money = input.nextInt();
        }
        amt = money * years;
        System.out.println("At retirement, you'll have $" + amt + " saved.");
        
    }
}
