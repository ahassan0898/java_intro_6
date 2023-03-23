package loops;

import utilities.ScannerHelper;

public class Execise10_SumOfNumbersByUser {
    public static void main(String[] args) {

        /*
Write a program that asks user to enter 5 numbers
Find sum of the given numbers by user.

2, 3, 4, 5, 6

Output:
20

11, 15, 23, -7, 8

Output:
50
 */

        System.out.println("\n-------------Without Loop------------\n");

       int num1 = ScannerHelper.getNumber();
       int num2 = ScannerHelper.getNumber();
       int num3 = ScannerHelper.getNumber();
       int num4 = ScannerHelper.getNumber();
       int num5 = ScannerHelper.getNumber();
        System.out.println(num1 + num2 +num3 + num4 + num5);


        System.out.println("\n-----------With for loop------------\n");

        int sum = 0;
        for (int i = 1; i <=5 ; i++) {
            sum += ScannerHelper.getNumber();
        }
        System.out.println(sum);

        System.out.println("\n----------While Loop-----------\n");
        int start = 1;
        int sumWhile = 0;
        while(start <=5){
           sumWhile += ScannerHelper.getNumber();
            start ++;
        }
        System.out.println(sumWhile);
    }
}
