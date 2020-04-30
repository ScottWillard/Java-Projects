import java.util.*;

public class FormLetterWriter{
    private String lastName;
    private String firstName;
    
    public void displaySalutation(String last) {
        this.lastName = last;
        System.out.println("Dear Mr. or Mrs. " + this.lastName + ", thank you for your recent order.");
    }
    
    public void displaySalutation(String firs, String las) {
        this.firstName = firs;
        this.lastName = las;
        System.out.println("Dear " + this.firstName + " " + this.lastName + ", thank you for your recent order.");
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String last) {
        this.lastName = last;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String first) {
        this.firstName = first;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FormLetterWriter las = new FormLetterWriter();
        FormLetterWriter fis = new FormLetterWriter();
        FormLetterWriter fin = new FormLetterWriter();
        
        System.out.print("Enter the first name of the customer: ");
        fis.setFirstName(in.nextLine());
        System.out.print("Enter the last name of the customer: ");
        las.setLastName(in.nextLine());
        
        fin.displaySalutation(las.getLastName());
        fin.displaySalutation(fis.getFirstName(), las.getLastName());
    }
}
