package vandy;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static boolean isPangram(String input) {
        // Convert the input to lowercase to handle both upper and lower case letters
        input = input.toLowerCase();
        
        // Create a set to store the letters encountered
        Set<Character> letterSet = new HashSet<>();
        
        // Iterate through the input and add letters to the set
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letterSet.add(ch);
            }
        }
        
        // Check if the set contains all 26 letters (A to Z)
        return letterSet.size() == 26;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace with your input string
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
