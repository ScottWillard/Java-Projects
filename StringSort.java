import java.util.*;

public class StringSort {
    public static void main(String[] args) {
        String[] values = {"mouse", "dog", "cat", "horse", "cow",
                "moose", "tiger", "lion", "elephant", "bird", "hamster",
                "guinea pig", "leopard", "aardvark", "hummingbird"};
        
        int x;
        String message = "";
        Arrays.sort(values);
        for (x = 0; x < values.length; ++x) {
            
            message = values[x];
            System.out.println(message);
        }
        
        
    }
}