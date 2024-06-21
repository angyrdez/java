package hashset;

import java.util.HashSet;

/**
 * @author Angela
 */
public class Hashset_String {

    /* JAVA HASHSET
    * a HashSet is a collection of items where every item is unique,
    * and it is found in the java.util package.
    *
    * */
    public static void main(String[] args) {

        // Declare HashSet
        HashSet<String> people;
        // Inicialize HashSet
        people = new HashSet<String>();

        // 1. Declare and initialize the HashSet
        HashSet<String> cars = new HashSet<String>();


        // ADD ITEMS
        // to add items to it, use the add() method.
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        /*
        * Note: In the example above, even though BMW is added twice it only
        * appears once in the set because every item in a set has to be unique.
        * */

        // CHECK IF AN ITEM EXISTS
        // to check wether an item exists in a HashSet, use the contains() method:
        System.out.println("Contiene: Mazda "+ cars.contains("Mazda"));

        // REMOVE AN ITEM
        // to remove an item, use the remove() method:
        //To remove all items, use the clear() method:
        cars.remove("Volvo");

        // HASHSET SIZE
        // to find out how many items there are, use the size() method;
        cars.size();

        // LOOP THROUGH A HASHSET
        // loop through the items of an HashSet with for each:
        System.out.println("Bucle for-each");
        for ( String car: cars){
            System.out.println(car);
        }
    }
}
