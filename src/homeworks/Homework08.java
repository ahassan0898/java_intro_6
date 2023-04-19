package homeworks;

import utilities.ScannerHelper;

import java.util.Arrays;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("\n===========TASK-1===========\n");
        countConsonants("");
        System.out.println("\n===========TASK-2===========\n");
        String str = ScannerHelper.getString();
        wordArray(str);
        System.out.println("\n===========TASK-3===========\n");
        String sentence = ScannerHelper.getString();
        removeExtraSpaces(sentence);
        System.out.println("\n===========TASK-4===========\n");
        String str4 = ScannerHelper.getString();
        count3OrLess(str4);
        System.out.println("\n===========TASK-5===========\n");
        System.out.println("\n===========TASK-6===========\n");
    }

    //TASK-1
    public static void countConsonants(String sentence) {
        String line = ScannerHelper.getString();
        String pattern = "(?i)[aeiou]";
        System.out.println(line.replaceAll(pattern, "").length());
    }

    //TASK-2
    public static String[] wordArray(String str) {
        String[] strArray = str.split("");
        for (int i = 0; i < 1; i++) {
            System.out.println(Arrays.asList(str));

        }
        return strArray;
    }

    //TASK-3
    public static void removeExtraSpaces(String line) {
        System.out.println(line.replaceAll("\\s+", " s"));
    }

    //TASK-4
    public static void count3OrLess(String str4) {
        int counter = 0;
        String pattern = "^.{0,2}$";
        if (str4.matches(pattern)) {
            counter++;
        }
        System.out.println(counter);

    }
}