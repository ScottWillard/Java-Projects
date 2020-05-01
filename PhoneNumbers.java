import java.util.Scanner;

class PhoneNumbers {
    public static void main(String[] args) {
        
        String newString = "";
        String[] names = new String[30];
        names[0] = "Gina";
        names[1] = "Marcia";
        names[2] = "Rita";
        names[3] = "Jennifer";
        names[4] = "Fred";
        names[5] = "Neil";
        names[6] = "Judy";
        names[7] = "Arlene";
        names[8] = "LaWanda";
        names[9] = "Deepak";
        String numbers[] = new String[30];
        numbers[0] = "(847) 341-0912";
        numbers[1] = "(847) 341-2392";
        numbers[2] = "(847) 354-0654";
        numbers[3] = "(414) 234-0912";
        numbers[4] = "(414) 435-6567";
        numbers[5] = "(608) 123-0904";
        numbers[6] = "(608) 435-0434";
        numbers[7] = "(608) 123-0312";
        numbers[8] = "(920) 787-9813";
        numbers[9] = "(930) 412-0991";
        
        String entryName = "", entryPhone = "";
        int x;
        boolean isFound = false;
        int highest = 10;
        Scanner xx = new Scanner(System.in);
        System.out.println("Enter name to look up. Type 'quit' to quit. ");
        while (highest < 30 || !entryName.equals("quit")) {
            entryName = xx.nextLine();
            if (entryName.equals("quit"))
                break;
            for (x = 0; x < highest; x++) {
                
                if (entryName.equalsIgnoreCase(names[x])) {
                    isFound = true;
                    System.out.println(names[x] + "'s phone number is " + numbers[x]);
                    x = highest;
                    highest++;
                }
            }
            if (!isFound) {
                System.out.println("Enter phone number for " + entryName + ":");
                entryPhone = xx.nextLine();
                names[highest] = entryName;
                numbers[highest] = entryPhone;
                ++highest;
                //numbers[x] = "(" + entryPhone.substring(0,3) + ") " +
                //		 entryPhone.substring(3,6) + "-" + entryPhone.substring(6, entryPhone.length());
                //System.out.println(names[x] + "'s phone number is " + numbers[x]);
            }
            System.out.println("Enter name to look up. Type 'quit' to quit.");
            isFound = false;
            highest++;
        }
    }
}

