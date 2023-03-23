package string_Methods;

public class MethodChaining {
    public static void main(String[] args) {

        String str = "TechGlobal";

        System.out.println(str.toLowerCase()); //techglobal

        //2 methods chains
        System.out.println(str.toLowerCase().contains("tech"));

        //3 methods chains
        System.out.println(str.toUpperCase().substring(4).length());

        //6 method chained
        String sentence = "Hello, my name is John Doe. I am 30 years old and i go to school at TechGlobal.";
        System.out.println(sentence.toLowerCase().replace("a","x").replace("e", "x").replace("i", "x").replace("o", "x").replace("u", "x"));


    }
}
