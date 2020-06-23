import java.util.*;
import java.io.*;
import java.lang.*;

public class readFile {
    private Scanner x;
    
    public void readFile() {
        while (x.hasNext()) {
            String a = x.next();
            String b = x.next();
            String c = x.next();
            System.out.printf("%s %s %s\n", a, b, c);
        }
    }
    
    public void closeFile(){
        x.close();
    }
}
