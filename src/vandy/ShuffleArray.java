package vandy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create an array with the values (1, 2, 3, 4, 5, 6, 7)
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        // Convert the array to a List
        List<Integer> list = new ArrayList<>();
        for (int value : originalArray) {
            list.add(value);
        }

        // Shuffle the List
        Collections.shuffle(list);

        // Convert the shuffled List back to an array
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        // Print the shuffled array
        System.out.println("Shuffled Array: " + Arrays.toString(shuffledArray));
    }
}
