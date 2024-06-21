package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @author Angela
 */
public class LinkedList_String {

    /*
    * The LinkedList class is a collection which can contain many objects of the same type,
    * just like the ArrayList.
    *
    *
    * */

    // HOW THE LINKEDLIST WORKS
    /*
    *The LinkedList stores its items in "containers." The list has a link to the first container
    * and each container has a link to the next container in the list. To add an element to the list,
    * the element is placed into a new container and that container is linked to one of the other
    * containers in the list.
    * */

    //Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

    public static void main(String[] args) {

        LinkedList<String> casa = new LinkedList<String>();


        //LINKEDLIST METHODS

        // addFirst()	Adds an item to the beginning of the list
        // addLast()	Add an item to the end of the list
        // removeFirst()	Remove an item from the beginning of the list
        // removeLast()	Remove an item from the end of the list
        // getFirst()	Get the item at the beginning of the list
        // getLast()	Get the item at the end of the list

        casa.addFirst("Cocina");
        casa.add("Salon");
        casa.add("Habitación");
        casa.addLast("baño");

        System.out.println(casa);

        Collections.sort(casa);
        System.out.println("ordenada: " + casa);


        // REVERSE THE ORDER
       // You can also sort a list in reverse order, by using the reverseOrder() method.

        casa.sort(Collections.reverseOrder());

        for (String hab : casa){
            System.out.println(hab);
        }
    }
}
