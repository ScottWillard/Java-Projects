public class NumbersDemo {
    public static void main(String args[]){
        displayTwiceTheNumber(1);
        displayNumberPlusFive(1);
        displayNumberSquared(2);
    }
    
    public static void displayTwiceTheNumber(int n) {
        int x = n * 2;
        System.out.println(x);
    }
    
    public static void displayNumberPlusFive(int n) {
        int x = n + 5;
        System.out.println(x);
    }
    
    public static void displayNumberSquared(int n) {
        int x = n * n;
        System.out.print(x);
        
    }
}
