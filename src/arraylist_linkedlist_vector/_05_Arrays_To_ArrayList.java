package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _05_Arrays_To_ArrayList {
    public static void main(String[] args) {

        /*
        how to convert an array to an arrayList
        1. Arrays.asList() method //Creating from scratch
        2.loops (manual way) not preferred
        3. Collections.addAll (collection1, collection2)// it will add collection2 into collection1 //combining

         */

        System.out.println("\n------------Way-1--asList() method-----------\n");
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Berlin", "Paris", "Rome"));

        System.out.println("\n------------Way-2------------\n");

        String [] countries = {"USA", "Germany", "Spain", "Italy"};
        ArrayList<String> list = new ArrayList<>();
        for (String country :countries) {
            list.add(country);
        }
        System.out.println(list);


        System.out.println("\n---------Way 3---Collections.addAll() method ---\n");
        Collections.addAll(list,countries);
    }
}
