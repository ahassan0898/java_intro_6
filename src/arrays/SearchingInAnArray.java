package arrays;

import java.util.Arrays;

public class SearchingInAnArray {
    public static void main(String[] args) {

        int [] numbers = {3, 10, 8, 5 ,5};

        // Check if this array has an element equals 7
        System.out.println("\n-----LOOP WAY---------\n");
    boolean has7 = false;

        for (int number : numbers) {
            if (number == 7) {
                has7 = true;
                break;
            }
        }
        System.out.println(has7);


        System.out.println("\n------------binary search way-------------\n");
        // binary search can not be used without sorting
        Arrays.sort(numbers); // [3, 5, 5, 8,10 ]
        System.out.println(Arrays.binarySearch(numbers, 5)); //returns index of 2
        System.out.println(Arrays.binarySearch(numbers,10)); //returns the index of 4
        System.out.println(Arrays.binarySearch(numbers, 7)); // -4 if its negative it doesn't exist
    }
}
