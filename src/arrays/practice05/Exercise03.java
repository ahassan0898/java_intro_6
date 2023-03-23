package arrays.practice05;

import utilities.RandomGenerator;

import java.util.Arrays;
import java.util.Random;

public class Exercise03 {
    public static void main(String[] args) {

    }
    public static void minAndMaxUsingSort(){
        //Write a program to generate 5 random numbers
        //between 1 to 10 (1 and 10 are included) and store those
        //numbers in an int array.
        //Find the max and min numbers among the random
        //numbers and print them.


    }
    public static void minAndMaxWithSort() {

        int[] randArr = {RandomGenerator.getRandomNumber(1, 10),
                RandomGenerator.getRandomNumber(1, 10),
                RandomGenerator.getRandomNumber(1, 10),
                RandomGenerator.getRandomNumber(1, 10),
                RandomGenerator.getRandomNumber(1, 10)};
        System.out.println(Arrays.toString((randArr)));
        Arrays.sort(randArr);
        System.out.println(Arrays.toString(randArr));

        System.out.println("The max number is = " + randArr[4]);
        System.out.println("The min number is = " + randArr[0]);

    }
}
