package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class _02_Set {
    public static void main(String[] args) {

        /*

        SET comes to mind when you talk about collections that have unique elements

        Set is an interface and it has some class implementation as below:
        -Set does not keep insertion order
        -Set does not allow duplicates
        -Set allow ONLY 1 null element (because it does not allow duplicates

        1. HashSet: the most common Set implementation
               - It does not keep insertion order
               - It does not allow duplicates
               - It allows ONLY 1 null element
        2. LinkedHashSet:
          - It keeps insertion order- predictable
               - It does not allow duplicates
               - It allows ONLY 1 null element
        3. TreeSet:
            - It sorts the element
               - It does not allow duplicates
               - It DOES NOT have any null element


         */

        HashSet<String> objects = new HashSet<>();
        objects.add(null);
        objects.add(null);
        objects.add("Sandina");
        objects.add(null);
        objects.add("Okan");
        objects.add("Alex");
        objects.add("Alex");
        objects.add("John");
        objects.add("abc");
        objects.add("123");
        objects.add("");
        objects.add("Sal");
        objects.add("Boo");

        System.out.println(objects);


        System.out.println("\n-------------LinkedHashSet---------\n");

        LinkedHashSet<String> words = new LinkedHashSet<>();

        words.add(null);
        words.add("Sandina");
        words.add(null);
        words.add("Okan");
        words.add("Alex");
        words.add("Alex");
        words.add("John");
        words.add("abc");
        words.add("123");
        words.add("");
        words.add("Sal");
        words.add("Boo");
        System.out.println(words); //will be in order


        System.out.println("\n----------TreeSet-------\n");

        TreeSet<String> treeSet = new TreeSet<>();
        // treeSet.add(null); // null pointer exception as it does not know how to sort when it is null
        treeSet.add("Sandina");
        treeSet.add("Okan");
        treeSet.add("Alex");
        treeSet.add("Alex");
        treeSet.add("John");
        treeSet.add("abc");
        treeSet.add("123");
        treeSet.add("");
        treeSet.add("Sal");
        treeSet.add("Boo");
        System.out.println(treeSet); // [, 123, Alex, Boo, John, Okan, Sal, Sandina, abc]

        System.out.println(treeSet.descendingSet()); // [abc, Sandina, Sal, Okan, John, Boo, Alex, 123, ]

        System.out.println(treeSet.subSet("Boo", "Sandina")); // [Boo, John, Okan, Sal]

        System.out.println(treeSet.tailSet("Okan")); // [Okan, Sal, Sandina, abc]
        System.out.println(treeSet.headSet("Okan")); // [, 123, Alex, Boo, John]

        System.out.println(treeSet.floor("Okan")); // Okan
        System.out.println(treeSet.ceiling("Okan")); // Okan

        System.out.println(treeSet.lower("Okan")); // John
        System.out.println(treeSet.higher("Okan")); // Sal

        System.out.println(treeSet.first()); // min
        System.out.println(treeSet.last()); // max


        System.out.println("\n-----------HashSet, LinkedHashSet, and TreeSet in the shape of Set------\n");

        Set<Integer> number1 = new HashSet<>();
        Set<Integer> number2 = new LinkedHashSet<>();
        Set<Integer> number3 = new TreeSet<>();
    }
}
