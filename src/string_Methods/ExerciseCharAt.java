package string_Methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class ExerciseCharAt {
    public static void main(String[] args) {

        String str = "TechGlobal"; // last index is 9 | length is 10
        String str2 = "Hello World"; // last index is 10 | length is 11
        String str3 = "I really love java"; //last index is 17 | length is 18

        System.out.println(str.charAt(4)); // G

        System.out.println(str.charAt(9)); //l

        System.out.println(str.length() -1);
        System.out.println(str2.length()-1);
        System.out.println(str3.length()-1);

        String strFromUser = ScannerHelper.getString();

        System.out.println(strFromUser.charAt(strFromUser.length()-1));









    }
}
