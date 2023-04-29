package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Exercise01_RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(2,3,4,5,5,2));
        System.out.println(removeDuplicates(list1));



    }

    /*
    Create a method that takes some numbers and returns the numbers back with all duplicates removed
    2,3,4,5,5,2 -> 2,3,4,5
    10,10,10,10 -> 10
    -3, -3, -5, 0, 0 -> -3, -5, 0
    NOTE: the order of elements returned does not matter
    NOTE: when you want the order to be sorted by default you use TreeSet
     */

    public static HashSet<Integer> removeDuplicates(List<Integer> numbers){
        HashSet<Integer> uniques = new HashSet<>(numbers);
        return uniques;
    }

}
