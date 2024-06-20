import java.sql.SQLOutput;
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
    }
}
