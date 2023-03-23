package loops;

import utilities.ScannerHelper;

public class Exercise08_CountCharacterInAString {
    public static void main(String[] args) {

        //Write a program that asks the user to enter a string
        //Count how many A or a letter you have given String
        //pseudo code: Check each character in the String one by one
        // increase the count of letter by one when the character is A or a

        String str = ScannerHelper.getString();
        int count = 0;
        for (int i = 0; i <= str.length()-1 ; i++) {
            if (str.toUpperCase().charAt(i)== 'A') count ++;

        }
        System.out.println(count);

    }
}
