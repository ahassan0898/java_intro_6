package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _01_List {
    public static void main(String[] args) {
        /*
        List is an interface and it has some class implementations
        1. ArrayList
        2. LinkedList
        3. Vector

        Common Features:
           They keep insertion order
           They allow null elements

         */


        ArrayList<String> list= new ArrayList<>();
        list.add("Ayat");

        System.out.println(list); // [Ayat]

        System.out.println("\n-------------ArrayList and LinkedList in the shape of list---\n");
        List<Integer> numbers1 = new ArrayList<>();
        List<Integer> numbers2 = new LinkedList<>();

    }
}
