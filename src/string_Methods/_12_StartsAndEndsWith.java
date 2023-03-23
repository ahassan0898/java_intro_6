package string_Methods;

public class _12_StartsAndEndsWith {
    public static void main(String[] args) {


//        1. return
//        2. returns a boolean
//        3. non - static - its being called by an object
//        4. Yes its calling an argument and takes a char or a string

        String str = "TechGlobal";
        boolean startsWith = str.startsWith("T");
        boolean endsWith = str.endsWith("T");
        System.out.println(startsWith);
        System.out.println(endsWith);

        System.out.println(str.startsWith("Techgl"));
        System.out.println(str.endsWith("TechGlobal"));




    }
}
