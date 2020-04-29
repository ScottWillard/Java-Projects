import java.util.*;

public class Backwards {
    public String phrase, reverse = "";
    
    public String getPhrase() {
        return phrase;
    }
    
    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
    
    public String getReverse() {
        return reverse;
    }
    
    public void setReverse(String reverse) {
        this.reverse = reverse;
    }
    
    public static void main(String[] args) {
        boolean bool = true;
        Scanner in = new Scanner(System.in);
        while (bool != false) {
            Backwards b = new Backwards();
            System.out.println("Enter something to reverse, or 999 to quit: ");
            b.setPhrase(in.nextLine());
            if (b.getPhrase().equals("999")) {
                bool = false;
                break;
            }
            for (int i = b.getPhrase().length() - 1; i >= 0; i--) {
                b.reverse += b.getPhrase().charAt(i);
            }
            System.out.println("'" + b.getPhrase() + "'" + " backwards is " + b.getReverse());
        }
        System.out.println("End of program.");
        
    }
}
