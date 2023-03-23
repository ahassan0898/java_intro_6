package arrays.practice05;

public class Exercise04 {
    public static void main(String[] args) {

    }
    public static void  containsApple (String[] arr){
        //Write a program to find if String array contains “apple”
        //as an element, ignore cases.
        //Test data 1:
        //String[] list = {“banana”, “orange”, “Apple”};
        //Expected output:
        //true
        //Test data 2:
        //String[] list = {“pineapple”, “banana”, “orange”,
        //“grapes”};
        //Expected output:
        //false

        for (String s : arr) {
            if (s.equalsIgnoreCase("apple")){
                System.out.println(true);
                break;
            }
        }


    }

}
