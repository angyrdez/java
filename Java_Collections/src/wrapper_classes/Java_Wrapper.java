package wrapper_classes;

import java.util.ArrayList;

/**
 * @author anrdez
 * @project Java_Collections
 */
public class Java_Wrapper {

    /* JAVA WRAPPER CLASSES
    * Wrapper classes provide a way to use primitive data types (int, boolean,..) as objetcs.
    *
    *Sometimes, you must use wrapper classes, for example when working with Collection objects
    * such as ArrayList, where primitive types cannot be used.
    * (the list can only store objects).
    * */
    public static void main(String[] args) {

        //ArrayList<int> numbers = new ArrayList<int>(); // invalid
        ArrayList<Integer> nums = new ArrayList<Integer>(); // valid

        // CREATING WRAPPER OBJECTS
        // to create a wrapper object, use the wrapper class instead of the primitive type.
        // To get the value, you can just print the object.

        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println("myInt: "+myInt);
        System.out.println("myDouble: "+myDouble);
        System.out.println("myChar: "+myChar);

        // Since you're now working with objects,
        // you can use certain methods to get information about the specific object.

        //For example, the following methods are used to get the value associated with
        // the corresponding wrapper object:
        // intValue(), byteValue(), shortValue(), longValue(), floatValue(),
        // doubleValue(), charValue(), booleanValue().

        //will output the same result as the example above:
        System.out.println("intValue(): "+myInt.intValue());
        System.out.println("doubleValue(): "+myDouble.doubleValue());
        System.out.println("charValue(): "+myChar.charValue());

        //Another useful method is the toString() method, which is used to convert
        // wrapper objects to strings.

        //
        // In the following example, we convert an Integer to a String,
        // and use the length() method of the String class to output the length of the "string":
        Integer number = 100;
        String myString = number.toString();
        System.out.println("tostring: "+myString.length());

    }
}
