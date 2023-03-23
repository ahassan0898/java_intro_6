package projects;


import utilities.RandomGenerator;
import utilities.ScannerHelper;

import java.util.Random;

public class Project05 {
    public static void main(String[] args) {


        System.out.println("\n-------------TASK-1--------------\n");

        String sentence = ScannerHelper.getString();

        int wordCount = 0;

        if (sentence.contains(" ")) {
            for (int i = 0; i < sentence.length(); i++)
                if (sentence.charAt(i) == ' ') {
                    wordCount++;
                }
            System.out.println("This sentence has " + (wordCount + 1) + " words.");

        } else
            System.out.println("This sentence does not have multiple words");

        System.out.println("\n-------------TASK-2--------------\n");
        Random rand = new Random();
        int random1 = rand.nextInt(26);
        int random2 = rand.nextInt(26);
        //if there is a number inside of the parentheses it begins from 0-number +1
        //number outside of the parentheses is starting point
        // number inside parentheses is starting point - end point +1
       System.out.println("Int randomNumber1 = " + random1 + ";");
       System.out.println("Int randomNumber1 = " + random2 + ";");
String solution = "";
        for (int i = 0; i <= 25; i++) {

            if (i % 5 != 0)System.out.println(i);
        }

        System.out.println("\n-------------TASK-3--------------\n");
        String s1 = ScannerHelper.getString();
        int characterCount = 0;

        if (s1.length() != 0) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == 'a' || s1.charAt(i) == 'a') {
                    characterCount++;
                }

            }
            System.out.println("This sentence has " + characterCount + " a or A letters");
        } else
            System.out.println("This sentence does not have any characters");


        System.out.println("\n-------------TASK-4--------------\n");
        String word = ScannerHelper.getString();
        String reverseWord = "";

        if (word.length() != 0) {
            for (int i = word.length() - 1; i >= 0; --i) {
                reverseWord = reverseWord + word.charAt(i);
            }
            if (word.equals(reverseWord)) {
                System.out.println("This word is palindrome");
            } else
                System.out.println("This word is not palindrome");
        } else
            System.out.println("This word does not have 1 or more characters");

        System.out.println("\n-------------TASK-5--------------\n");


        for (int i = 1; i <= 9; i++) {
            for (int s = 1; s <= 9 - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}