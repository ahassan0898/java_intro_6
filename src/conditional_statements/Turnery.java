package conditional_statements;

import java.util.Scanner;

public class Turnery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1= 5;
        int num2 = 10;
        int difference;

       /* if (num1> num2){
            difference = num1 - num2;
        }else{
            difference = num2 - num1;
        }
        System.out.println(difference);

*/

difference = num1 > num2 ? num1- num2 : num2 - num1;
        System.out.println(difference);

        System.out.println("Please enter a number");




    }
}
