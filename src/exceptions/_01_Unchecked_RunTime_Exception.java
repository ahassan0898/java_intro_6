package exceptions;

import utilities.ScannerHelper;

public class _01_Unchecked_RunTime_Exception {
    public static void main(String[] args) {

        String name = ScannerHelper.getFirstName();

        try{
            System.out.println(name.charAt(5)); // StringIndexOutOfBoundsException
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("I could not print char at 5 as it does not exist!");
        }


        System.out.println("The rest of the program");
    }
}
