package homeworks;

import java.util.Arrays;

public class Homework11 {
    public static void main(String[] args) {

        System.out.println("\n=============TASK-1=======\n");


        String task1 = "    Hello    ";
        System.out.println(noSpace(task1));

        System.out.println("\n=============TASK-2=======\n");

        String task2 = "      A   ";
        System.out.println(replaceFirstLast(task2));

        System.out.println("\n=============TASK-3=======\n");

        String task3 = "Java";
        System.out.println(hasVowel(task3));

        System.out.println("\n=============TASK-4=======\n");

        checkAge(1920);

        System.out.println("\n=============TASK-5=======\n");

        averageOfEdges(0, 0, 6);  //When its an int put it in parenthesis like this

        System.out.println("\n=============TASK-6=======\n");

        String[] arr = {"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(arr)));
        System.out.println("\n=============TASK-7=======\n");

        int[] array= {3,4,5,6};
        System.out.println(Arrays.toString(no3or5(array)));

        System.out.println("\n=============TASK-8=======\n");
        int[] nums = {41, 53, 19, 47, 67};
        System.out.println(countPrimes(nums));
    }

    //TASK-1

    public static String noSpace(String str) {
        return str.replaceAll("\\s+", " ").trim();
    }

    //TASK-2
    public static String replaceFirstLast(String str) {
        str = str.trim();
        if (str.length() < 2) return "";
        else
            return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }

    //TASK-3

    public static boolean hasVowel(String str) {
        return str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i") ||
                str.toLowerCase().contains("o") || str.toLowerCase().contains("u");
    }

    //TASK-4
    public static void checkAge(int yearOfBirth) {
        int currentYear = 2023;
        int age = currentYear - yearOfBirth;
        if (age > 100 || currentYear < yearOfBirth) System.out.println("AGE IS NOT VALID");
        else if (age < 16) System.out.println("AGE IS NOT ALLOWED");
        else System.out.println("AGE IS ALLOWED");
    }

    //TASK-5

    public static int averageOfEdges(int a, int b, int c) { // when put in the parenthesis it means it will take those arguments
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        return (min + max) / 2; //return the average of all the numbers
    }

    public static String[] noA(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().startsWith("a"))
                arr[i] = "###";
        }
        return arr;
    }

    public static int[] no3or5(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 15 == 0)
                numbers[i] = 101;
            else if (numbers[i] % 5 == 0)
                numbers[i] = 99;
            else if (numbers[i] % 3 == 0)
                numbers[i] = 100;

        }

        return numbers;
    }

    public static int countPrimes(int[] arr) {
        int primes = 0;
        for (int num : arr) {
            if (num < 2) continue;
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) isPrime = false;
            }
            if (isPrime) primes++;
        }
        return primes;
    }
}