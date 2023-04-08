package regex;

import utilities.ScannerHelper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWords {
    public static void main(String[] args) {

        /*
        Ask the user to enter a sentence and count how many words are in
the sentence.
The regex pattern for a single word is [A-Za-z]{1,}

print out how many words are in the sentence.
Scenario 1:
Program: Please enter a sentence
User: Hello, my name is john doe.
Program:
Hello
my
name
is
john
doe
This sentence contains 6 words
Scenario 2:
Program: Please enter a username
User:
Program: This sentence contains 0 words
         */
//Way-1

        String sentence = "Hello, my name is john doe.";
        String arr [] = sentence.split("");
        System.out.println("This sentence contains " + arr.length +" words");
        for (String s: arr) {
            System.out.println(s);
        }



        //REGEX WAY
        Pattern pattern = Pattern.compile("[A-Za-z]{1,}");
        Matcher matcher = pattern.matcher("hello, my name is john.");
        int count = 0;
        while (matcher.find()){
            System.out.println(matcher.group()); //prints out the word
            count++;
        }
        System.out.println("This sentence contains " + count + " words");
    }
}
