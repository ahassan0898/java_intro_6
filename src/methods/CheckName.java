package methods;

import utilities.ScannerHelper;

public class CheckName {
    public static void main(String[] args) {

        ScannerHelper scannerHelper = new ScannerHelper();
        String name = scannerHelper.getFirstName();
        System.out.println("The name entered by the user is " + name);

    }

}
