import java.util.*;

public class Admission {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double GPA;
        int testScore;
        int counter = 1;
        while (counter != 0) {
            System.out.println("Enter the GPA: ");
            GPA = a.nextDouble();
            while (GPA <= 0.0 || GPA > 4.0) {
                System.out.println("Error. Try again.");
                GPA = a.nextDouble();
            }
            System.out.println("Enter the admission test score: ");
            testScore = a.nextInt();
            while (testScore < 0.0 || testScore > 100.0) {
                System.out.println("Error. Try again.");
                testScore = a.nextInt();
            }
            if ((GPA >= 3.0 && testScore >= 60) || (GPA <= 3.0 && testScore >= 80))
                System.out.println("Accept");
            else
                System.out.println("Reject");
            System.out.println("To evaluate another student, press 1. To quit Press 0");
            counter = a.nextInt();
        }//while
    }//main
}//Class
