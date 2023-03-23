package loops;

import utilities.ScannerHelper;

public class Exercise07_PrintCharactersInAString {
    public static void main(String[] args) {

        /*
Write a program that asks user to enter a String
Print each character of the String in a separate line

"Hello"
H -> str.charAt(0)
e -> str.charAt(1)
l-> str.charAt(2)
l
o


"Hi"
H
i

        Start point: 0
        End point : str.length() -1
        update: increment
 */
       String str = ScannerHelper.getString();
        for (int i = 0; i <= str.length()-1; i++) {
            System.out.println(str.charAt(i));
        }

    }
}
