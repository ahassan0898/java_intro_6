package string_Methods;

import java.sql.SQLOutput;

public class _05_ToLowerCase {
    public static void main(String[] args) {
//      1.return type
//      2. Returns a String
//      3. non static
//      4. Does not take arguments


        String str1 = "JAVA IS FUN";
        String str2 = "java is fun";


        System.out.println(str1.toLowerCase()); // java is fun
        System.out.println(str2.toLowerCase()); // java is fun

        char c = 'A';
        System.out.println(String.valueOf(c).toLowerCase());

    }
}
