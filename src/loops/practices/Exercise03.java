package loops.practices;

import utilities.ScannerHelper;

public class Exercise03 {
    public static void main(String[] args) {

        //Write a Java program that asks user to enter 2 different integers
        //between 0 to 10 ( 0 and 10 are included)
        //Print all the numbers between given 2 integers starting from
        //smallest to biggest (given numbers are included)
        //HOWEVER, do not print the number of 5

        int num1 = ScannerHelper.getNumber();//10
        int num2 = ScannerHelper.getNumber();//8

        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if (i != 5) System.out.println(i);
        }
    }
}
