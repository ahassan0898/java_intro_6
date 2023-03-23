package string_Methods;

public class _11_Substring {
    public static void main(String[] args) {

//        1. return
//        2. returning a String
//        3. non-static - we are calling it by the object
//        4. yes, it takes an argument by taking 1 or 2 as an int


        String str = "I love java";
        String firstWord = str.substring(0,1);// I -> same as str.charAt(0)
        String secondWord = str.substring(2,6); //love
        String thirdWord = str.substring(7,11); // java
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);

        System.out.println(str.substring(str.length()/2));

    }
}
