package vandy;
import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // Create a mapping of Roman numerals to their integer values
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));

            // Check if the current value is smaller than the previous value
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "IX"; // Replace with the Roman numeral you want to convert
        int intValue = romanToInt(romanNumeral);
        System.out.println(romanNumeral + " = " + intValue);
    }
}
