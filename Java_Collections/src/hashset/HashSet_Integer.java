package hashset;

import java.util.HashSet;

/**
 * @author Angela
 */
public class HashSet_Integer {
    public static void main(String[] args) {

        // Create a HashSet
        HashSet<Integer> numbers = new HashSet<Integer>();

        //Create an Array of primitive numbers
        int[] nums = {1,34,76,3,45,92,2};

        // Add each element of nums to the HashSet
        for (Integer num : nums){
            numbers.add(num); // converts int to integer
        }

        // Print HashSet
        System.out.println("HASHSET LIST:");
        for ( Integer num : numbers){
            System.out.print(" "+num);
        }

    }
}
