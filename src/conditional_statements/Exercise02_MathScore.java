package conditional_statements;

import java.util.Scanner;

public class Exercise02_MathScore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hey David! Please enter your math grade?");
        int number = input.nextInt();

        if (number >= 60) {

            System.out.println("Awesome! You have passed the math class!");
        }
        else{
            System.out.println("Sorry you failed!");
        }







    }
}
