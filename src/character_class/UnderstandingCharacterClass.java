package character_class;

import utilities.ScannerHelper;

public class UnderstandingCharacterClass {
    public static void main(String[] args) {


        //Use character class and useful methods
        String str = ScannerHelper.getString();

        char firstChar = str.charAt(0);
        System.out.println(Character.isUpperCase(firstChar));
        System.out.println(Character.isLowerCase(firstChar));
        System.out.println(Character.isLetter(firstChar));
        System.out.println(Character.isDigit(firstChar));
        System.out.println(Character.isWhitespace(firstChar));
        System.out.println(Character.isLetterOrDigit(firstChar));
    }
}
