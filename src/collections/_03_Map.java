package collections;

import java.util.*;

public class _03_Map {
    public static void main(String[] args) {
        /*
        Map is an interface and it has some implementation classes
        1. HashMap: most used/ most common implementation class
        -it stores data as key-value pairs
                -Keys are always unique - one null
                -Keys can be considered as identifiers
                -Values can be duplicate - multiple null values
                -No insertion order - no methods with indexes
        2. LinkedHashMap:
        3. TreeMap

         */

        System.out.println("\n----------HashMap---------\n");

        HashMap<String, Integer> hashMap = new HashMap<>(); //key, value pairs
        hashMap.put("Sandina", 25);
        hashMap.put("Zel", 20);
        hashMap.put("Assem", 27);
        hashMap.put("Assem", 24);
        hashMap.put("okan", 18);
        hashMap.put(null, 18);
        hashMap.put(null, 100);
        hashMap.put("", null);
        hashMap.put("Anton", null);
        hashMap.put("Jazzy", null);

        System.out.println(hashMap); // {Sandina=25, Zel=20, Assem=24, null=100, =null, Anton=null, Jazzy=null, okan=18}
        System.out.println(hashMap.size()); // 8

        System.out.println(hashMap); //{Sandina=25, Zel=20, Ayat=27} unpredicatable placement


        System.out.println("\n----TreeMap--------\n");
        TreeMap<String, Integer>treeMap = new TreeMap<>();
        treeMap.put("Ayat", 25);
        treeMap.put("Zel", 26);
        treeMap.put("Sandina", 27);
        treeMap.put("Sandina", 30); // will not allow duplicates but will update the value
        // treeMap.put(null, "Jazzy"); // null key is not allowed
        treeMap.put("Jazzy", null); // null values are allowed


        System.out.println("\n---------HashTable----\n");
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Ayat", 20);
        hashtable.put(null, 25); // nullpointerException doesnt work
        hashtable.put("Yana", null); //nullPointerException

        System.out.println("\n------HashMap, LinkedHashMap, TreeMap, HashTable in the shape of Map-\n");

        Map<Integer, Integer> numbers1 = new HashMap<>();
        Map<Integer, Integer> numbers2 = new LinkedHashMap<>();
        Map<Integer, Integer> numbers3 = new TreeMap<>();
        Map<Integer, Integer> numbers4 = new Hashtable<>();




    }
}
