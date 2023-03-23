package scannerClass;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.println("What is your name?");
        String fName = inputReader.next();
        inputReader.nextLine();

        System.out.println("What is your address?");
        String address = inputReader.nextLine();

        System.out.println("What is your favorite number?");
        int favNumber = inputReader.nextInt();


    }
}
