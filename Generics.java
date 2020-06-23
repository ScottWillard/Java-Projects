public class Generics {
    
    public static void main(String[] args) {
        System.out.println(max(1, 2, 3));
        System.out.println(max("red", "green", "blue"));
        System.out.println(max(" Circle radius: 3.0", "Circle radius: 2.9", "Circle radius: 5.9"));
        System.out.println(max("♪", "☺", "♫"));
    }
    
    //Generic method
    public static <E extends Comparable<E>> E max(E a, E b, E c) {
        E m = a;
        
        if (b.compareTo(a) > 0) {
            m = b;
        }
        if (c.compareTo(m) > 0) {
            m = c;
        }
        return m;
    }
}