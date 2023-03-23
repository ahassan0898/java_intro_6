package string_Methods;

import utilities.ScannerHelper;

public class _13_Contains {
    public static void main(String[] args) {

//        1. return type
//        2. returns boolean
//        3. non-static
//        4. takes string as an argument


        String name = "John Doe";

        boolean containsJohn = name.contains("john");
        System.out.println(containsJohn);

        String str = ScannerHelper.getString();

        System.out.println(str.contains(" ") && str.endsWith("."));


    }
}
