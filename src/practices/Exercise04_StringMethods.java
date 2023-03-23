package practices;

import utilities.ScannerHelper;

public class Exercise04_StringMethods {
    public static void main(String[] args) {


        String str = ScannerHelper.getString();
        if (str.length() <4) System.out.println("INVALID INPUT");
         else System.out.println(str.startsWith("xx") && str.endsWith("xx"));


    }
}
