package conditional_statements;

import java.util.Scanner;

public class Exercise05_CheckAllEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");
        int even = input.nextInt();
        int even1 = input.nextInt();
        int even2 = input.nextInt();

        if (even % 2 == 0 && even1 % 2 == 0 && even2 % 2 ==0) {
            System.out.println("True");
        }
            else {
            System.out.println("False");
        }


    }
}
