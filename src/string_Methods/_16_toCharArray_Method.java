package string_Methods;

import java.util.Arrays;

public class _16_toCharArray_Method {
    public static void main(String[] args) {
       String name = "John";
        char [] charsOfName = name.toCharArray();
        System.out.println(Arrays.toString(charsOfName));

        System.out.println(charsOfName[1]);
        System.out.println(charsOfName.length);
        for (char c : charsOfName) {
            System.out.println(c);
        }
        }
    }

