package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("-----------Task 1-------------");
        System.out.println(noDigit("123Hello World149"));

        System.out.println("-----------Task 2-------------");
        System.out.println(noVowel("125$"));

        System.out.println("-----------Task 3-------------");
        System.out.println(sumOfDigits("John’s age is 29"));

        System.out.println("-----------Task 4-------------");
        System.out.println(hasUpperCase("$125.00"));

        System.out.println("-----------Task 5-------------");
        System.out.println(middleInt(10, 2, 30));

        System.out.println("-----------Task 6-------------");
        int[] numbers = {13, 322, 22, 13, 13, 33, 16};
        System.out.println(Arrays.toString(no13(numbers)));

        System.out.println("-----------Task 7-------------");
        int[] numbersTask7 = {0,1, 2, 3, 4};
        System.out.println(Arrays.toString(arrFactorial(numbersTask7)));

        System.out.println("-----------Task 8-------------");

        System.out.println(Arrays.toString(categorizeCharacters("abc123$#%")));
    }


    //Task1
    public static String noDigit(String str) {

        return str.replaceAll("\\d", "");
    }


    //Task-2
    public static String noVowel(String str) {

        return str.replaceAll("[aeiouAEIUO]", "");
    }


    // Task-3
    public static int sumOfDigits(String str) {

        if (str.length() < 1) return 0;
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                result += Character.getNumericValue(str.charAt(i));
        }
        return result;
    }


    //Task-4
    public static boolean hasUpperCase(String str) {

        boolean answer = false;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) answer = true;
        }
        return answer;
    }


    // Task-5
    public static int middleInt(int a, int b, int c) {
        int[] middle = {a, b, c};
        Arrays.sort(middle);
        return middle[1];
    }


    // Task-6
    public static Object[] no13(int[] numbers) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int number : numbers) {
            if (number != 13) result.add(number);
        }
        return result.toArray();
    }


    //Task-7
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int[] arrFactorial(int[] numbersTask7) {

        int newNumber = 1;
        for (int i = 0; i < numbersTask7.length; i++) {

            if(i < 2) {
            }
            else{
                newNumber = factorial(numbersTask7[i]);
            }
            numbersTask7[i] = newNumber;
        }
        return numbersTask7;
    }


    //Task-8
    public static String[] categorizeCharacters(String str){


        String[] arrOfStr = str.split("1");


        for (int i = 0; i < str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))) arrOfStr = str.split("1");

        }
        return arrOfStr;

    }

}
