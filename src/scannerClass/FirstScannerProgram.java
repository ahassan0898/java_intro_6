package scannerClass;

import java.util.Scanner;

public class FirstScannerProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");

        String name = input.next();
        input.nextLine();
        System.out.println("The user's name is Ayat" + name);

        System.out.println("Please enter your first and last name");

        String fullName = input.nextLine();
        System.out.println("The users full name is ");



    }
}
