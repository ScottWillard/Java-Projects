import java.util.*;
import javax.swing.*;

public class UseCourse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String dept, inStr;
        String[] labCourses = {"BIO", "CHM", "CIS", "PHY"};
        int id, credits;
        int found = 0;
        int x;
        System.out.println("Enter department: ");
        dept = in.nextLine();
        System.out.println("Enter course number: ");
        inStr = in.nextLine();
        id = Integer.parseInt(inStr);
        System.out.println("Enter credits");
        credits = in.nextInt();
        credits = Integer.parseInt(inStr);
        for (x = 0; x < labCourses.length; ++x)
            if (dept.equals(labCourses[x]))
                found = 1;
        if (found == 1) {
            LabCourse course = new LabCourse(dept, id, credits);
            course.display();
        } else {
            CollegeCourse2 course = new CollegeCourse2();
            course.display();
        }
    }
}
