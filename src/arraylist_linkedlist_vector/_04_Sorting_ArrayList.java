package arraylist_linkedlist_vector;

import java.util.*;

public class _04_Sorting_ArrayList {
    public static void main(String[] args) {

        //Create an ArrayList - LinkedList and Vector

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,15,5,2,-7));

        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Yellow", "Brown"));

        Vector<Double>  balances = new Vector<>(Arrays.asList(10.3, 5.7, 10.0, 15.6)); //all should have a decimal


        System.out.println("\n----------Print Collections before sort-----\n");

        System.out.println(numbers);
        System.out.println(colors);
        System.out.println(balances);

        System.out.println("\n-------Print collections after sort----\n");
        Collections.sort(numbers); //sorts number from smallest to biggest
        Collections.sort(colors); //sorts alphabetically/ lexicographic
        Collections.sort(balances);

        System.out.println(numbers);
        System.out.println(colors);
        System.out.println(balances);
    }
}
