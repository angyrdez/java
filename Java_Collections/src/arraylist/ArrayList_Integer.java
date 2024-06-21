package arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Angela
 */
public class ArrayList_Integer {

    public static void main(String[] args) {

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        myNumbers.add(2);
        myNumbers.add(34);
        myNumbers.add(54);
        myNumbers.add(53);
        myNumbers.add(12);

        // SORT AN ARRAYLIST
        //Another useful class in the java.util package is the Collections class,
        // which include the sort() method for sorting lists alphabetically or numerically:

        Collections.sort(myNumbers);
        System.out.println("Sorted list");
        for (Integer num : myNumbers){
            System.out.println(num);
        }



        // OTHER TYPES
        // Elements in an ArrayList are actually objects.
        // In the examples above, we created elements (objects) of type "String".
        // Remember that a String in Java is an object (not a primitive type).
       // To use other types, such as int, you must specify an equivalent wrapper class:
        // Integer. For other primitive types, use: Boolean for boolean, Character for char,
        // Double for double, etc:
    }
}
