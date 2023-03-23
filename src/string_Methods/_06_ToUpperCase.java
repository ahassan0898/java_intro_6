package string_Methods;

public class _06_ToUpperCase {
    public static void main(String[] args) {

//        1. return type
//        2. Returns String
//        3. Non Static
//        4. No arguments since it takes nothing in the parenthesis toUpperCase()<-- nothing in there.




        System.out.println("HelloWorld" .toUpperCase());// HELLOWORLD

        String s1 = "HELLO";
        String s2 = "hello";

        if((s1.toUpperCase().equals(s2.toUpperCase()))) System.out.println("EQUAL");
        else System.out.println("NOT EQUAL");


    }
}
