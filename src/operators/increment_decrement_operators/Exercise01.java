package operators.increment_decrement_operators;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        int index = 1;



        System.out.println(number * index ++);
        System.out.println(number * index ++);
        System.out.println(number * index ++);
        System.out.println(number * index ++);



    }
}
