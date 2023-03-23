package arrays;

import java.util.Arrays;

public class IntArray {
    public static void main(String[] args) {
        //Create an int array that will store 6 numbers
        int[] numbers = new int[6];
        numbers[0]=5;
        numbers[2] =15;
        numbers[4] =25;
        //number[7] = 45; array index out of bound exception
        // Print the array --> Print the numbers to a string

        // print each element with for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i);
        }

        //print each element with for each loop
        for (int number: numbers){ //iter (shortcut code)
        System.out.println(number);
    }


    }
}
