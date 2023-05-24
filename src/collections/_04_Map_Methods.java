package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _04_Map_Methods {
    public static void main(String[] args) {

        /*

        Create a map to stroe the countries with thier capitals
        key             value
        country         Capital city

        France          Paris
        Italy           Rome
        Spain           Madrid

         */

        HashMap<String, String> capitals = new HashMap<>();

        //How to add entries to a map

        capitals.put("France", "Paris");
        capitals.put("Italy", "Rome");
        capitals.put("Spain", "Madrid");


        // How to print a Map
        System.out.println(capitals);


        //How to retrieve a value
        System.out.println(capitals.get("Franc")); // Paris
        System.out.println(capitals.get("Italy")); // Rome


        System.out.println("\n-----How to remove some entries --- \n");

        System.out.println(capitals.remove("Italy", "Rome")); // false
        System.out.println(capitals.remove("Spain", "Madrid")); // true


        System.out.println("\n----------How to get the size of the map--------\n");

        System.out.println(capitals.size()); //1

        capitals.put("Ukraine", "Kviv");
        capitals.put("Turkiye", "Ankara");

        System.out.println(capitals);
        System.out.println(capitals.size());// 3


        System.out.println("\n--------How to get all keys---\n");

        System.out.println(capitals.keySet()); // just the keys as a set
        Set<String> keys = capitals.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println("\n----How to get all values----\n");

        System.out.println(capitals.values()); //

        System.out.println("\n----How to get all entries-----\n");

        System.out.println(capitals.entrySet());

        Set<Map.Entry<String, String>> entries = capitals.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
