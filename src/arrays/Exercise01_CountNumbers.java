package arrays;

public class Exercise01_CountNumbers {
    public static void main(String[] args) {
        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};

        //You can count in the numbers above
        // negatives, positives, neutrals, evens, odds, divisible by 3, 5, 10, max, min, sum, average, product
        //abs difference between min and max
        //the biggest difference with min and max
        //unique elements -> 7
        //Find how many numbers are represented in the fibnocci series --> 0,1,1,2,3,5,8,13
        //prime numbers: 3,5,
        //Find closest number to 9:(Take the smallest in case you have 2 on the left and on the right)



        //Write a program that counts how many negative numbers you in the array -> 2

        /*
        PSEUDO CODE
        Check each number one by one
        Count whenever a number is negative
        After checking all numbers, print the result
         */

        System.out.println("\n-------for each loop------\n");

        int negatives = 0;

        for (int number : numbers) {
            if(number < 0) negatives++;
        }

        System.out.println(negatives); // 2


        System.out.println("\n-------for  loop------\n");
        negatives = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0) negatives++;
        }

        System.out.println(negatives); // 2

        //Write a program that counts how many even numbers you have in the array -->

        int evens = 0;
        for (int number : numbers) {
            if (number % 2==0) evens ++;

        }
        System.out.println(evens);

        // Write a program that finds the sum of all the numbers in the array--> 28
        int sum = 0;
        for (int i = 0; i <numbers.length ; i++) {
           sum+= numbers[i];

        }
        System.out.println(sum);



    }
}
