import java.util.*;

public class SqrtException {
    public static void main(String[] args) throws ArithmeticException {
        int num = 0, sqrt = 0;
        double result = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to get find square root of: ");
        num = in.nextInt();
        try {
            if (num < 0)
                throw (new ArithmeticException());
            result = Math.sqrt(num);
            System.out.println(result);
        } catch (ArithmeticException error) {
            System.out.println("Can't take square root of negative number");
        }
    }
}
