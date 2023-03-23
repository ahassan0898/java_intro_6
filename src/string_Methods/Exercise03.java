package string_Methods;

public class Exercise03 {
    public static void main(String[] args) {

        String str = "The best is Java";

        System.out.println(str.substring(12)); // Java

        String java = str.substring(str.lastIndexOf(' ')+ 1);
        System.out.println(java);




    }
}
