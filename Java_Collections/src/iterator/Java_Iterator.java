package iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author anrdez
 */
public class Java_Iterator {

    // JAVA ITERATOR
    // An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
    public static void main(String[] args) {

        // GETTING AN ITERATOR
        // the iterator() method can be used to get an iterator for any collection.

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());

        // LOOPING THROUG A COLLECTION
       // To loop through a collection, use the hasNext() and next() methods of the Iterator:
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // OTHER EXAMPLE

        HashSet<Integer> nums = new HashSet<Integer>();
        //Get an iterator to the HashSet
        Iterator<Integer> iter = nums.iterator();


        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        // REMOVING ITEMS FROM A COLLECTION
        //Iterators are designed to easily change the collections
        // that they loop through. The remove() method can remove items
        // from a collection while looping
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> itera = numbers.iterator();

        while(itera.hasNext()){
            Integer inum = itera.next();
            if(inum < 10){
                itera.remove();
            }
        }
        System.out.println(numbers);

        // Note: Trying to remove items using a for loop or a for-each loop would not work
        // correctly because the collection is changing size at the same time that the
        // code is trying to loop.


    }

}
