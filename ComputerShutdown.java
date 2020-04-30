import java.io.*;
public class ComputerShutdown{
    
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        Runtime r = Runtime.getRuntime();
        System.out.println("Enter no. of seconds after which you want your computer to shutdown: ");
        String a = b.readLine();
        Process p = r.exec("shutdown -s -t " + a);
    }
}
