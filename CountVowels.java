import java.util.*;

public class CountVowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence;
        int vowelCount = 0;
        //Prompt the user to type a phrase
        System.out.println("Enter a phrase, and the number of vowels entered will be counted:");
        sentence = in.nextLine();
        sentence = sentence.toLowerCase();
        for (int i = 0; i < sentence.length(); i++) {
            //Checks whether a character is a vowel
            if (sentence.charAt(i) == 'a'
                    || sentence.charAt(i) == 'e'
                    || sentence.charAt(i) == 'i'
                    || sentence.charAt(i) == 'o'
                    || sentence.charAt(i) == 'u') {
                //Increments the vowel counter
                vowelCount++;
            }
        }
        //Prints the number of vowels
        System.out.println("Number of vowels: " + vowelCount);
        for (int i = 0; i < sentence.length(); i++) {
            //Checks whether a character is a vowel
            if (sentence.charAt(i) == 'y')
                //Increments the vowel counter
                vowelCount++;
        }
        System.out.println("If we count 'y' as a vowel, vowel count: " + vowelCount);
    }//main
}//class
