package arrays;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {

        String[] cities= {"Chicago", "Miami", "Toronto"};

        //The number of elements in the array
        System.out.println(cities.length); // 3

        //get particular element from the array
        String Miami = cities[2];
        System.out.println(Miami); // or cities[1]


        System.out.println(cities[0]); //Chicago
        System.out.println(cities[2]); //Toronto

        //Index out of bounds exception (numbers that are not included in the array)
        //System.out.println(cities[-2]);

        // How to print the array with all elements --> [Chicago, Miami, Toronto]
        //1. Convert your array to a string
        //2. print it with the print method

        System.out.println(Arrays.toString(cities));

        System.out.println("\n-------------For loop-----------\n");
        //How to loop an array
        for (int i = 0; i < 3; i++) {
            System.out.println(cities[i]);
        }


        System.out.println("\n-------------For each loop -Enhanced loop-----------\n");
        //for collection this is a preferred way
        for (String element : cities){
            System.out.println(element);
        }
    }
}
