package string_Methods;

import utilities.ScannerHelper;

public class Exercise05 {
    public static void main(String[] args) {

        String str = ScannerHelper.getString();

        System.out.println(str.startsWith("a") || str.startsWith("A") && str.endsWith("e") || str.endsWith("E"));




    }
}
