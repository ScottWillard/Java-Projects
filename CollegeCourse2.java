import javax.swing.*;
import java.util.*;

public class CollegeCourse2 {
    protected String dept;
    protected int id;
    protected double credits;
    protected double price;
    
    public void CollegeCourse2(String dep, int num, double cr) {
        final int FEEPERCREDIT = 120;
        dept = dep;
        id = num;
        credits = cr;
        price = cr * FEEPERCREDIT;
    }
    
    public void display() {
        System.out.println(dept + id + "\nNon-lab course\n" + credits +
                " credits\nTotal fee is $" + price);
    }
}
