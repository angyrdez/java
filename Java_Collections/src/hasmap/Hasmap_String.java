package hasmap;

import java.util.HashMap;

/**
 * @author Angela
 */
public class Hasmap_String {

    /* HASMAP
    * A HashMap store items in "key/value" pairs,
    * and you can access them by an index of another type (e.g. a String)
    * One object is used as a key (index) to another object (value).
    * It can store different types: String keys and Integer values,
    *  or the same type, like: String keys and String values:
    * */
    public static void main(String[] args) {

        // CREATE A HASHMAP - <KEY, VALUE>
        HashMap<Integer, String> capitalCities = new HashMap<Integer, String>();

        // ADD ITEMS INTO A HASHMAP
        //to add items to it, use the put() method:

        capitalCities.put(0,"London");
        capitalCities.put(1,"Berlin");
        capitalCities.put(2, "Madrid");
        capitalCities.put(3,"Oslo");
        System.out.println(capitalCities);

        // ACCESS AN ITEM
        // To access a value in the HashMap, use the get() method and refer to its key:

        System.out.println(capitalCities.get(2));

        // REMOVE AN ITEM
        //To remove an item, use the remove() method and refer to the key:
        //To remove all items, use the clear() method.

        capitalCities.remove(3);


        // HASHMAP SIZE
        // to find out how many items there are, use the size() method:
        //Note: Use the keySet() method if you only want the keys,
        // and use the values() method if you only want the values:

        capitalCities.size();

        System.out.println("VALUES");
        for ( String capital : capitalCities.values()){
            System.out.println(capital);
        }

        System.out.println("KEY");
        for ( Integer key: capitalCities.keySet()){
            // Print keys and values
            System.out.println("Key: " + key + " Value: " + capitalCities.get(key));
        }


        // OTHER TYPES
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("Jhon", 32);
        people.put("Steve", 30);
        people.put("Angy", 33);

        for (String i : people.keySet()){
            System.out.println("Key: " + i + " Value: " + people.get(i));
        }





    }
}
