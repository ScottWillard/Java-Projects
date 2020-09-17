import java.util.*;

public class Admission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double GPA;
        int testScore;
        int counter = 1;
        while (counter != 0) {
            System.out.println("Enter the GPA: ");
            GPA = in.nextDouble();
            while (GPA <= 0.0 || GPA > 4.0) {
                System.out.println("Error. Try again.");
                GPA = in.nextDouble();
            }
            System.out.println("Enter the admission test score: ");
            testScore = in.nextInt();
            while (testScore < 0.0 || testScore > 100.0) {
                System.out.println("Error. Try again.");
                testScore = in.nextInt();
            }
            if ((GPA >= 3.0 && testScore >= 60) || (GPA <= 3.0 && testScore >= 80))
                System.out.println("Accept");
            else
                System.out.println("Reject");
            System.out.println("To evaluate another student, press 1. To quit Press 0");
            counter = in.nextInt();
        }//while
    }//main
}//Class
