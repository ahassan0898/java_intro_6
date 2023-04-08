package regex;

import utilities.ScannerHelper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsername {
    public static void main(String[] args) {


        /*
        Ask the user to enter a username.
If the username matches the format of [a-zA-Z0-9]{5,10}, print out
"Valid Username".

If it does not match the desired format then print out "Error!
Username must be 5 to 10 characters long and can only contain
letters and numbers"
Scenario 1:
Program: Please enter a username
User: JDoe123
Program: Valid Username
Scenario 2:
Program: Please enter a username
User: John Doe
Program: Error! Username must be 5 to 10 characters long and can only contain letters and numbers
         */

        //WAY 1

        String validUsername= ScannerHelper.getString();
        String regex = "[a-zA-Z0-9]{5,10}";


       if (Pattern.matches(regex,validUsername)){
           System.out.println("Valid Username");
       }
       else {
           System.out.println("Error! Username must be 5 to 10 characters long and can only contain letters and numbers");
       }

       //WAY 2

        //WAY 2
        if(validUsername.matches(regex)){
            System.out.println("Valid Username");
        }
        else{
            System.out.println("Error! Username must be 5 to 10 characters long and can only contain letters and numbers");
        }

        //WAY 3
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(validUsername);

        if(matcher.matches()){
            System.out.println("Valid Username");
        }else {
            System.out.println("Error! Username must be 5 to 10 characters long and can only contain letters and numbers");
        }

    }
}
