package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_ArrayList_Introduction {
    public static void main(String[] args) {

        //1. How to create an array vs. ArrayList
        System.out.println("\n-------TASK-1---------\n");
        String [] array = new String[3];

        ArrayList<String> list = new ArrayList<>(); //capacity by default will be 10(reserving spot for 10 elements,
                                                    // but will be 0
                                                    // until you define it

        //2. How to get size of an array and ArrayList
        System.out.println("\n-------TASK-2---------\n");
        System.out.println("The size of the array = " + array.length); // 3 elements
        System.out.println("The size of the list = " + list.size()); // 0

        //3. How to print an Array vs ArrayList
        System.out.println("\n-------TASK-3---------\n");
        System.out.println("The array = " + Arrays.toString(array)); // [null, null, null]
                                                                    //  didnt intialize what is in the array
        System.out.println("The list = " + list);   // [] (empty list is displayed with just square bracket)


        //4. How to add elements to an array vs. ArrayList
        System.out.println("\n-------TASK-4---------\n");
        array[0]= "Jack";
        array[1] = "Alex";
        array[2] = "Max";
        //array[4] = "John"; // ArrayIndex out of bound


        list.add("Joe");
        list.add("Jane");
        list.add("Mike");

        list.add(2,"Jazzy"); // if I want to add a name in a specific place
        //list.add(20, "Yahya"); // Index out of bound
        System.out.println("The list = " +list); //[Joe, Jane, Mike] it goes first come first serve

        //5. How to update an exisiting element in an array vs ArrayList
        System.out.println("\n-------TASK-5---------\n");
        array[1] = "Ali";
        System.out.println("The array = " + Arrays.toString(array)); //[John, Ali, Max] replacing Jane with Ali

        list.set(1, "Jasmine");
        //list.set(20, "Jazzy"); // IndexoutOfBound
        System.out.println("The list = " + list); // [Joe, Jasmine, Mike, Adam] Replaced with Jane to Jasmine

        //6. How to retrieve-get an element from Array vs ArrayList
        System.out.println("\n-------TASK-6---------\n");
        System.out.println(array[2]);// this will give you 1 element

        System.out.println(list.get(3)); // Adam


        //7. How to loop an Array vs ArrayList
        System.out.println("\n-------TASK-7 for i loop---------\n");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); //prints each element 1 by 1
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));        //will print out each element seperatly
        }

        System.out.println("\n-------TASK-7 for each loop---------\n");

        for (String element : array) {
            System.out.println(element); // will print out each element seperately
        }

        for (String element : list) {
            System.out.println(element);

        }


        //for(dataType varName : collection){
        // block of code
        // }

    }
}
