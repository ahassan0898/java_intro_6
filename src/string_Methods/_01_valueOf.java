package string_Methods;

public class _01_valueOf {
    public static void main(String[] args) {


//      1. return type
//        2. what is the return type? returning a String
//        3. Static or non static? it is static (since we are calling the class name that goes with the String) -->String.valueOf
//       4. takes any variable as any String


        int num =125;
        String numAsStr = String.valueOf(num);
        System.out.println(num);
        System.out.println(numAsStr);

        char c ='B';
        System.out.println(c);
        System.out.println(String.valueOf(c));





    }
}
