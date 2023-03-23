package projects;

import utilities.ScannerHelper;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {

        System.out.println("\n----------TASK-1---------\n");

        String str = ScannerHelper.getString();

        if ( str.length() <= 8) System.out.println("This string does not have 8 characters");
        else System.out.println(str.substring(str.length()-4) + str.substring(4, str.length()-4) +str.substring(0,4));



        System.out.println("\n----------TASK-2---------\n");

        String sentence = ScannerHelper.getString();
        int number = sentence.indexOf(" ");
        if (sentence.contains(" ")) System.out.println(sentence.substring(number) + " " + sentence.substring(0,number));



        System.out.println("\n----------TASK-3---------\n");

        String str1 = ScannerHelper.getString();
        String str2 = ScannerHelper.getString();
        String str3 = ScannerHelper.getString();

        System.out.println(str1.replace("stupid", "nice"));
        System.out.println(str2.replace("idiot", "nice"));
        System.out.println(str3.replace("bad", "nice"));

        System.out.println("\n----------TASK-4---------\n");

        String name = ScannerHelper.getFirstName();

        if (name.length()>= 2)
            if (name.length() %2 == 0) System.out.println(name.substring(name.length()/ 2-1, name.length()/2 +1));
        else System.out.println(name.charAt(name.length()/2));

        else System.out.println("Invalid input!!");

        System.out.println("\n----------TASK-5---------\n");
        String country = ScannerHelper.favCountry();

        if (country.length() >=5) System.out.println(country);
        else System.out.println("Invalid input!!");

        System.out.println("\n----------TASK-6---------\n");
        String address = ScannerHelper.getAddress();

        System.out.println(address.replace("a" , "*")
                .replace("e", "#")
                .replace("i", "+")
                .replace("u", "$")
                .replace("o" , "@"));


    }
}
