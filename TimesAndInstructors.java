import java.util.*;

class TimesAndInstructors {
    
    public static void main(String[] args) {
        //5 rows and 3 columns
        String[][] collegeCourses = new String[5][3];
        Scanner input = new Scanner(System.in);
        String searchName;
        
        //set college courses and names
        collegeCourses[0][0] = "CIS101";
        collegeCourses[0][1] = "Mon 9 am";
        collegeCourses[0][2] = "Farrell";
        
        collegeCourses[1][0] = "CIS210";
        collegeCourses[1][1] = "Mon 11 am";
        collegeCourses[1][2] = "Patel";
        
        collegeCourses[2][0] = "MKT100";
        collegeCourses[2][1] = "Tues 8:30 am";
        collegeCourses[2][2] = "Wong";
        
        collegeCourses[3][0] = "ACC150";
        collegeCourses[3][1] = "Tues 6 pm";
        collegeCourses[3][2] = "Deitrich";
        
        collegeCourses[4][0] = "CIS101";
        collegeCourses[4][1] = "Fri 1 pm";
        collegeCourses[4][2] = "Lennon";
        
        String prof = "";
        String profName = "";
        String meetingTime = "";
        boolean found = false;
        System.out.println("Enter college courses: ");
        
        searchName = input.nextLine();
        
        for (int row = 0; row < collegeCourses.length && !found; row++) {
            if (collegeCourses[row][0].equalsIgnoreCase(searchName)) {
                prof = collegeCourses[row][2];
                meetingTime = collegeCourses[row][1];
                found = true;
            }
        }
        
        if (profName != null) {
            System.out.println("Course name: " + searchName);
            
            System.out.println("Meeting time: " + meetingTime);
            
            System.out.println("Professor name: " + prof);
            
        } else {
            System.out.println("Invalid Entry: No Such course");
        }
    }
    
    
}
