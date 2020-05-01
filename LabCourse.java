import java.util.*;

public class LabCourse extends CollegeCourse2 {
    private final int LABFEE = 50;
    
    public LabCourse(String dept, int id, int credits) {
        super();
        price = price + LABFEE;
    }
    
    @Override
    public void display() {
        System.out.println(dept + id + "\nLab course\n" + credits +
                " credits\nLab fee is $" + LABFEE +
                "\nTotal fee is $" + price);
    }
}
