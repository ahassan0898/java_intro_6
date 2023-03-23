package homeworks;

import utilities.ScannerHelper;

public class Homework04 {
    public static void main(String[] args) {

        System.out.println("\n---------------TASK-1-----------\n");

        String name = ScannerHelper.getFirstName();
        System.out.println("The length of the name = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(4));
        System.out.println("The first 3 characters in the name are = " + name.substring(0,3));
        System.out.println("The last 3 characters in the name are = " + name.substring(2,5));
        if(name == "a" || name == "A") System.out.println("You are in the club!");
        else System.out.println("Sorry, you are not in the club");

        System.out.println("\n---------------TASK-2-----------\n");

        String address = ScannerHelper.address().toLowerCase();

        if (address.contains("chicago")) System.out.println("You are in the club");
        else if (address.contains("des plaines")) System.out.println("You are welcome to join the club");
        else System.out.println("Sorry, you will never be in the club");


        System.out.println("\n---------------TASK-3-----------\n");

        String country = ScannerHelper.favCountry();
        if (country.contains("a")) System.out.println("A is there");
        else if (country.contains("i")) System.out.println("I is there");
        else if (country.contains("a") && country.contains("i")) System.out.println("A and i are there");
        else System.out.println("A and i are not there");



        System.out.println("\n---------------TASK-4-----------\n");

        String str = "    Java is fun  ";

        System.out.println("The first word in the str is = " + str.trim().toLowerCase().substring(0,4));
        System.out.println("The second word in the str is = " + str.trim().toLowerCase().substring(5,7));
        System.out.println("The third word in the str is = " + str.trim().toLowerCase().substring(8,11));


    }
}
