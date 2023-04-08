package regex;

import utilities.ScannerHelper;

import java.util.function.DoubleToIntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {

        String input = ScannerHelper.getString(); //java
        System.out.println(Pattern.matches("[a-z0-9_-]{3,10}", input));

        //java -> true
        //"I love java" --> false because theres spaces
        //"1a2B3--> false because there is a capital letter
        //"tech-global-school -> false more than 10 characters

        Pattern pattern = Pattern.compile("Java"); //compiled String regex into a Regex pattern
        Matcher matcher = pattern.matcher("I love Java, Java is fun");
        System.out.println(pattern); // prints out compiled regex pattern as a pattern
        System.out.println(pattern.toString()); // prints out compiled regex as a string
        System.out.println(pattern.pattern()); // prints out compiled regex as a string

        System.out.println(matcher.matches());

        int count = 0;
       while(matcher.find()){ //matcher.find()-> finds the next matched word in the given String -> returns true of false depending if it found the word
           count ++; //everytime it finds java
           System.out.println(matcher.group()); //prints out the found word, it will print out Java twice
           System.out.println(matcher.start()); //gets the starting index of where the word is found
           System.out.println(matcher.end()); // gets the ending index of there the matching word is found
       }
        System.out.println("Java count " + count);

       // Exercise04
        System.out.println("\n========EXERCISE04==========\n");
        System.out.println(Pattern.matches("[a-zA-Z0-9_-]{9,15}", "ayathassan"));
    }
}
