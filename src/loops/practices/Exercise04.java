package loops.practices;

import utilities.ScannerHelper;

public class Exercise04 {
    public static void main(String[] args) {
        //Write a program that asks user to enter a String.
        //Count the number of vowels in the given String and print it.
        //Vowels are A, E, O, U, I, a, e, o, u, I


        String name = ScannerHelper.getString();

        name = name.toLowerCase();
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }
        System.out.println(count);
    }
}
