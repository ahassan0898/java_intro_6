package practices;

import utilities.ScannerHelper;

public class Exercise01_StringMethods {
    public static void main(String[] args) {


        System.out.println("\n------------TASK-1------------\n");

        String str = ScannerHelper.getString();

        System.out.println("The string given is = " + str);


        if (str.isEmpty()) System.out.println("The string given is empty");
        else System.out.println("The length is = " + str.length());

        System.out.println("\n---------------TASK-3------------\n");

        if (str.isEmpty()) System.out.println("There is no character in this string");
        else System.out.println("The first character = " + str.charAt(0));

        System.out.println("\n-------------TASK-4----------\n");
        if (!str.isEmpty()) System.out.println("The last character = " + str.charAt(str.length()-1));


        System.out.println("\n--------------TASK-5----------\n");
        str = str.toLowerCase();

        if (str.contains("a") || str.contains("e")) System.out.println("This string has a vowel");
        else System.out.println("This string does not have a vowel");


    }
}
