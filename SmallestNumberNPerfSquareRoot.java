import java.util.*;

public class SmallestNumberNPerfSquareRoot {
    
    public static void main(String[] args) {
        System.out.print("Enter an integer m: ");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        ArrayList<Integer> factors = new ArrayList<>();
        
        getFactors(m, factors);
        
        int smallestSquare = smallestSquare(factors);
        System.out.println("The smallest number n for m * n to be a perfect square is " + smallestSquare);
        System.out.println("m * n = " + (m * smallestSquare));
    }//main
    
    private static int smallestSquare(ArrayList<Integer> factors) {

        //2D array for copying and storing the factors of the number input by user
        int[][] occurrences = copy(factors);

        //Enhanced for looping for running through the elements
        for (int i : factors) {
            search(occurrences, i);
        }
        
        //Removing duplicates and get odd sequence factors
        ArrayList<Integer> oddSequenceFactors = removeDuplicates(occurrences);
        
        //Getting smallest square by multiplying numbers that appear an odd number of times
        int smallestSquare = 1;
        for (int i : oddSequenceFactors) {
            smallestSquare *= i;
        }
        return smallestSquare;
    }//smallestSquares

    //Method for removing duplicates
    private static ArrayList<Integer> removeDuplicates(int[][] m) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        for (int i = 0; i < m.length; i++) {
            if (m[i][1] % 2 != 0) {
                temp.add(m[i][0]);
            }
        }
        
        //Removing duplicates
        ArrayList<Integer> duplicateRemoved = new ArrayList<>();
        for (int i = 0; i < temp.size(); i++) {
            
            if (!duplicateRemoved.contains(temp.get(i))) {
                duplicateRemoved.add(temp.get(i));
            }
        }
        
        return duplicateRemoved;
    }//removeDuplicates

    //Method for searching
    private static void search(int[][] m, int number) {
        for (int i = 0; i < m.length; i++) {
            if (m[i][0] == number) {
                m[i][1]++;
            }
        }
    }//search

    //Method for copying elements
    private static int[][] copy(ArrayList<Integer> factors) {
        
        int[][] temp = new int[factors.size()][2];
        
        for (int i = 0; i < temp.length; i++) {
            temp[i][0] = factors.get(i);
        }
        return temp;
    }//copy

    //Method for getting factors
    private static void getFactors(int m, ArrayList<Integer> factors) {
        
        int count = 2;
        while (count <= m) {
            if (m % count == 0) {
                factors.add(count);
                m /= count;
            } else {
                count++;
            }
        }
    }//getFactors
}//Class