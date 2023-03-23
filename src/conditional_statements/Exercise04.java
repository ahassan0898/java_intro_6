package conditional_statements;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age?");
        int age = input.nextInt();

        if (age>=55){
            System.out.println("It is your time to get retired!");
            }
        else {
            int left = 55 - age;
            System.out.println("You have " + left+  " years to be retired");
        }

    }
}
