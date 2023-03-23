package string_Methods;

public class _07_CharAt {
    public static void main(String[] args) {

//        1. returns a char
//        2. Non-Static
//        3. Yes it takes an argument because we put a number inside the parenthesis.

        String name = "Ayat";

        char firstLetter = name.charAt(0); // A
        char secondLetter = name.charAt(1); // Y
        char thirdLetter = name.charAt(2); // A
        char fourthLetter = name.charAt(3); // T

        System.out.println(name);
        System.out.println(firstLetter);
        System.out.println(secondLetter);
        System.out.println(thirdLetter);
        System.out.println(fourthLetter);


        String str = "HelloWorld";
        System.out.println(str.charAt(9));


    }
}
