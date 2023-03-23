package mathClass;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");
        int num1 = inputReader.nextInt();
        int num2 = inputReader.nextInt();
        int num3 = inputReader.nextInt();

        System.out.println("The min of " + num1 + " , " + num2 + " , " + num3 + " is: " + Math.min(num1, Math.min(num2, num3)) );

    }
}
