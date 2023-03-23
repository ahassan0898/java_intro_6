package character_class;

import utilities.ScannerHelper;

public class CountCharacters {
    public static void main(String[] args) {

         /*
        Write a method that asks user to enter a String
        Count letters
        Count digits

        Examples
        "123 Street Chicago"    -> This string has 3 digits and 13 letters
        "ABC"                   -> This string has 0 digits and 3 letters
        "12345"                 -> This string has 5 digits and 0 letters
        "     "                 -> This string has 0 digits and 0 letters


        PSEUDO
        Get characters of the String one by one
        Check if the character is letter -> if so increase the count of letters by one
        Check if the character is digit  -> if so increase the count of digits by one
         */

        String str= ScannerHelper.getString();

        int digits= 0;
        int letters= 0;

        for (int i = 0; i <str.length()-1 ; i++) {
            if (Character.isDigit(str.charAt(i))) digits++;
        else if (Character.isLetter(str.charAt(i))) letters++;
        }
        System.out.println("This string had " + digits + "digits and " + letters + "letters");

        System.out.println("\n------------TASK-2-----------\n");

        String str1= ScannerHelper.getString();
        int upper =0, lower =0;
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;


        }
        System.out.println("This string had " + upper + "uppercase letters and " + lower + "lowercase letters");


        str = ScannerHelper.getString();
        int specials = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) specials++;
        }
        System.out.println(specials);



        }
}
