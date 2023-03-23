package conditional_statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise03_PosNegZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your number?");
        int number = input.nextInt();

        if(number >0){

            System.out.println("POSITIVE");
        }
        else if (number < 0){
            System.out.println("NEGATIVE");
        }
        else{
            System.out.println("ZERO");
        }
        System.out.println("End of the program");

        if(number > 0){
            System.out.println("POSITIVE");
        }
        else{
            if(number <0) {
                System.out.println("NEGATIVE");
            }
            else{
                System.out.println("ZERO");
            }
        }

        System.out.println("End of the program");

    }
}
