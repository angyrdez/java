package arraylist;
import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;

/**
 * @author Angela
 */

public class ArrayList_String {

    // HOW THE ARRAYLIST WORKS
    /*
    *The ArrayList class has a regular array inside it. When an element is added,
    * it is placed into the array. If the array is not big enough, a new,
    * larger array is created to replace the old one and the old one is removed.
    * */

    public static void main(String[] args) {

        //Create an ArrayList object called cars that will store strings:
        ArrayList<String> cars = new ArrayList<String>();


        // 1 ADD ITEMS
        // To add elements to the list, use the add() method

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Peugeot");


        // You can also add an item at a specified position by referring to the index number.

        cars.add(0,"Mercedes"); // Insert element at the beginning of the list (position 0)

        //Remember: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.
        System.out.println("Car List: " + cars);

        // 2 ACCESS AN ITEM
        //  use the get() method and refer to the index number:
        System.out.println("Car at the position 0: " + cars.get(0));


        // 3 CHANGE AN ITEM
        //To modify an element, use the set() method and refer to the index number:
        cars.set(0, "Opel");
        System.out.println("The new car in position 0 is: " + cars.get(0));

        // 4 REMOVE AN ITEM
        cars.remove(0);
        System.out.println("the new list is: " + cars);

        // To remove ALL the elements in the ArrayList, use the clear() method.

        // ARRAYLIST SIZE
        //To find out how many elements an ArrayList have, use the size method:

        System.out.println("Size of the list: " + cars.size());

        // LOOP THROUGH AN ARRAYLIST
        //Loop through the elements of an ArrayList with a for loop,
        // and use the size() method to specify how many times the loop should run:

        for (int i = 0; i < cars.size(); i++) {

            if (i == cars.size() - 1) {
                // Last element, no agregar coma
                System.out.println(cars.get(i));
            } else {
                // No es el último elemento, agregar coma
                System.out.print(cars.get(i) + ", ");
            }
        }

        int count = 0;
        for (String car : cars){

            if (count == cars.size()-1){
                // Último elemento, no agregar coma
                System.out.println(car);
            }else {
                // No es el último elemento, agregar coma
                System.out.print(car + ", ");
            }
            count++;
        }

        Collections.sort(cars); // Sort cars
        System.out.println("Sorted list");
        for (String car: cars){
            System.out.println(car);
        }
    }
}