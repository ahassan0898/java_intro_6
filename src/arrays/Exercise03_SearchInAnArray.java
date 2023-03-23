package arrays;

import java.util.Arrays;

public class Exercise03_SearchInAnArray {
    public static void main(String[] args) {

        String [] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad" };

        /*
        Check the collection you have above and print true if it contains Mouse
        Print false otherwise

        RESULT:
        true
        */
        boolean hasM= false;
        for (String object : objects) {
            if (object.equals("Mouse")){
                hasM= true;
                break;
            }
        }
        System.out.println(hasM);

        System.out.println("\n-------Binary Search------------\n");

        Arrays.sort(objects); // [Keyboard, Mouse, Mouse, Remote, iPad]
        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0); //it will return an index, if it is more than or equal to 0 it is true
    }
}
