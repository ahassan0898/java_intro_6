package loops.practices;

import utilities.ScannerHelper;

public class Exercise06 {
    public static void main(String[] args) {
//Write a program that asks user to enter a number
//If number is less than 100, then ask user to enter another number
//and find sum of entered 2 numbers.
//Keep asking user to enter numbers until the sum of all entered
//numbers is at least 100.
//If first number entered by user more than or equal to 100, print
//message “This number is already more than 100” and do not ask
//user to enter any other numbers
//NOTE: Use do while loop!!!
//Example program1:
//Program: Please enter a number
//User : 120
//Program: This number is already more than 100
//Example program2:
//Program: Please enter a number
//User : 50
//Program: Please enter a number
//User : 75
//Program: Sum of the entered numbers is at least 100

        int number= 0;
        int i = 0;
        do{
            number += ScannerHelper.getNumber();
            i++;
        }while(number <100);
        if (i >1) System.out.println("The sum of the entered numbers is at least 100");
        else System.out.println("This number is already more than 100");
    }
}
