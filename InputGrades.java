import java.util.Scanner;

public class InputGrades {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        int x = 0, y = 0, z = 0;
        String courseEntry = "", entry = "", entryb = "", message;
        int idEntry, credits;
        char gradeEntry = ' ';
        boolean isGoodGrade = false;
        char[] grades = {'A', 'B', 'C', 'D', 'F'};
        final int NUM_COURSES = 5;
        String poop = "";
        
        Scanner sa = new Scanner(System.in);
        
        for (x = 0; x < students.length; ++x) {
            Student stu = new Student();
            System.out.println("For Student #" + (x + 1) + ", enter the Student ID: ");
            entry = sa.nextLine();
         /*idEntry  = Integer.parseInt(entry);
         stu.setID(idEntry);*/
            for (y = 0; y < NUM_COURSES; ++y) {
                System.out.println("For Student # " + (x + 1) + " enter course #" + (y + 1) + ":");
                
                entryb = sa.nextLine();
                credits = Integer.parseInt(entry);
                isGoodGrade = true;
                while (!isGoodGrade) {
                    
                    gradeEntry = entry.charAt(0);
                    for (z = 0; z < grades.length; ++z) {
                        if (gradeEntry == grades[z])
                            isGoodGrade = false;
                    }
                }
                CollegeCourse temp = new CollegeCourse();
                temp.setID(courseEntry);
                temp.setCredits(credits);
                temp.setGrade(gradeEntry);
                stu.setCourse(temp, y);
            }
            students[x] = stu;
        }
        for (x = 0; x < students.length; ++x) {
            message = "Student #" + (x + 1) + "  ID #" +
                    students[x].getID();
            for (y = 0; y < grades.length; ++y) {
                CollegeCourse temp = new CollegeCourse();
                temp = students[x].getCourse(y);
                message = message + "\n" + temp.getID() + " " + temp.getCredits() + "  -- credits. Grade is " +
                        temp.getGrade();
            }
            System.out.println(message);
        }
    }
}
