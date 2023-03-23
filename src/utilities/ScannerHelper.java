package utilities;

import java.util.Random;
import java.util.Scanner;

public class ScannerHelper {
    static Scanner input = new Scanner(System.in);

        public static String getFirstName(){
            System.out.println("Please enter a first name");
        return input.nextLine();
    }

    public static int getAge(){
        System.out.println("Please enter an age:");
        return input.nextInt();
    }

    public static int getNumber(){
        System.out.println("Please enter a number:");
        int number = input.nextInt();
        input.nextLine();

        return number;
    }

    public static String getString(){
        System.out.println("Please enter a string");
        String str = input.nextLine();
        return str;
    }

    public static String getFavBook(){
        System.out.println("Please enter your favorite book");
        String str1 = input.nextLine();
        return str1;

    }

    public static String getFavQuote(){
        System.out.println("Please enter your favorite quote");
        String str2 = input.nextLine();
        return str2;
    }

    public static String address(){
        System.out.println("What is your address?");
        String address = input.nextLine();
        return address;
    }

    public static String favCountry(){
        System.out.println("What is your favorite country?");
        String country = input.nextLine();
        return country;

    }
    public static String getAddress(){
        System.out.println("What is your address?");
        String address = input.nextLine();
        return address;
    }

}
