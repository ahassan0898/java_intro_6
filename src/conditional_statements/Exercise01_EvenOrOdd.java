package conditional_statements;

import java.util.Scanner;

public class Exercise01_EvenOrOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number?");
        int number = input.nextInt();

        if (number % 2 == 0) {

            System.out.println("The number you entered is even!");
        }
        else{
            System.out.println("The number you entered is odd!");
        }
        System.out.println("End of the program");








    }
}
