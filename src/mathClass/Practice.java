package mathClass;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        int randomNumber = (int)Math.random() * 51;
        int result = randomNumber * 5;

        System.out.println("The random number * 5 = " + result);

        int randomNumber1 = (int) (Math.random() * 11);
        int randomNumber2 = (int) (Math.random() * 11);

        System.out.println("Min number = " + Math.min(randomNumber1, randomNumber2));
        System.out.println("Max number = " + Math.max(randomNumber1, randomNumber2));
        System.out.println("Difference = " + Math.abs(randomNumber1-randomNumber2));


        System.out.println("Please enter 5 numbers between 1-10");





    }
}
