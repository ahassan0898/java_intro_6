package loops.control_statements;

import utilities.ScannerHelper;

public class Exercise01_Break {
    public static void main(String[] args) {
         /*
        Write a Java program that asks user to enter 2 different integers
        Print all the numbers between given 2 integers starting from biggest to smallest
        (given numbers are included)

        HOWEVER, do not print any number less than 10

        15, 25 ->
        25
        24
        .
        .
        .
        15


        8, 12 ->
        12
        11
        10
          */

        int n1= ScannerHelper.getNumber();
        int n2= ScannerHelper.getNumber();
        for (int i = Math.max(n1,n2); i >=Math.min(n1,n2) ; i--) {
           if(i<10) break;
           else System.out.println(i);
        }

        System.out.println("End of the program");
    }
}
