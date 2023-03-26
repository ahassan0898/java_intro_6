package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _02_Additional_Methods {
    public static void main(String[] args) {

        /*
        Create an ArrayList to store below numbers
        10
        15
        20
        10
        20
        30
        Print the ArrayList
        Print the size
    EXPECTED:
            [10, 15, 20, 10, 20, 30]
        6
        */

        ArrayList<Integer> numbers = new ArrayList<>(); //We dont usually give number capacity bc it changes
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers); // [10, 15, 20, 10, 20, 30]
        System.out.println(numbers.size()); //6 of the elements


        /*
        Check if the list contains 5
        Check if the list contains 10
        Check if the list contains 20
        Check if the list contains 45

        EXPECTED OUTPUT:
        false
        true
        true
         */

        System.out.println("\n-----contains() method-----\n");
        System.out.println(numbers.contains(5)); // false
        System.out.println(numbers.contains(10)); // true
        System.out.println(numbers.contains(20)); // true
        System.out.println(numbers.contains(45)); //false

            /*
            What is the first occurrence index of the element 10
            What is the first occurrence index of the element 20
            What is the last occurrence index of the element 10
            What is the last occurrence index of the element 20

            EXPECTED OUTPUT:
            0
            2
            3
            4
             */
        System.out.println("\n-----------indexOf() & lastIndexOf() methods----------\n");

        System.out.println(numbers.indexOf(10)); //0
        System.out.println(numbers.indexOf(20)); //2
        System.out.println(numbers.lastIndexOf(10)); //3
        System.out.println(numbers.lastIndexOf(20)); //4

        System.out.println(numbers.indexOf(15)); //1
        System.out.println(numbers.lastIndexOf(15)); //1 bc theres only 1 of that element
        System.out.println(numbers.indexOf(21)); //-1 does not exist

        System.out.println("\n----------Remove if-----------\n");
        /*
        Remove 15 from the list
        Remove 30 from the list
        Then print the list

        Expected output:
        [10,20,10,20]
         */

        numbers.remove((Integer) 15); // it removes 15 and returns true
        numbers.remove((Integer)30); //it removes 30 and returns true
        numbers.remove((Integer) 100); //it does not remove 100 and returns false

        System.out.println(numbers); // [10,20,10,20]

        //Removing the element that is 20 ->Remove all elements that are 20
        numbers.removeIf(element -> element ==20); // lambda expression //element can be named anything like x
        System.out.println(numbers); // [10] bc 20 is removed

        System.out.println("\n------------clear() & removeAll methods----\n");
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        System.out.println(numbers);

        numbers.clear();
        //numbers.removeAll(numbers);


    }
}
