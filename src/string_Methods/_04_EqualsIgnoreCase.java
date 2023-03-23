package string_Methods;

public class _04_EqualsIgnoreCase {
    public static void main(String[] args) {


        String str1 = "Hello";
        String str2 = "Hi";
        String str3 = "hello";
        String str4 = " HeLlOHI";

        System.out.println(str1.equalsIgnoreCase(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str3)); // true
        System.out.println((str1 + str2).equals(str4));// false-equals has to be exact

    }
}
