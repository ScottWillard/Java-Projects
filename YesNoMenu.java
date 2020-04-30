import java.util.*;

public class YesNoMenu{
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        String option = "";
        boolean value = false;
        option = z.toString();
        while (value != true) {
            System.out.println("Press 'y' for Yes, 'n' for No, 'm' for Menu. To exit, press any other key.");
            option = z.nextLine();
            switch (option) {
                case "y":
                    System.out.println("Yes");
                    break;
                case "n":
                    System.out.println("No");
                    break;
                case "m":
                    System.out.println("Menu");
                    break;
                default:
                    System.out.println("Exit");
                    value = true;
                    break;
            }//switch
        }//while
    }//main
}//class
