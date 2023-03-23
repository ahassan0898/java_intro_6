package arrays;

import utilities.ScannerHelper;

public class Exercise04_CountChars {
    public static void main(String[] args) {

        System.out.println("\n------------1st way-----------\n");
        int count = 0;
        String str = ScannerHelper.getString();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) count++;
        }
        System.out.println(count);

        System.out.println("\n--------------2nd way-------\n"); //toCharArray

        str= ScannerHelper.getString();

        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (Character.isLetter(c)) count++;
        }


    }
}
