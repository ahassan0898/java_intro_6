package string_Methods;

import java.sql.SQLOutput;

public class _14_Replace {
    public static void main(String[] args) {

        String str = "ABC123";
        System.out.println(str);

        str= str.replace("ABC", "abc");
        System.out.println(str); // abc123


        System.out.println(str.replace("2",""));

    }
}
