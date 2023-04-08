package regex;

import java.util.regex.Pattern;

public class RemoveAll {
    public static void main(String[] args) {
        //Counting vowels (without regex)

        String str = "Hello, my name is ayat and i go to techglobal";
        int vowelCount = 0;
        for (char s : str.toCharArray()) {
            if (Character.toLowerCase(s) == 'a' || Character.toLowerCase(s) == 'e' || Character.toLowerCase(s) == 'i' || Character.toLowerCase(s) == 'o' || Character.toLowerCase(s) == 'u'){
                vowelCount++;
        }
    }
        System.out.println("The word has " + vowelCount + " vowels");

        //Counting vowels with regex
        str= str.replaceAll("[^aeiouAEIOU]",""); //
        System.out.println("The word has " + str.length() + " vowels");


        //phone number validation

        String phoneNumberRegex = "[(]?[0-9]{3}[)]?-[0-9]{3}-[0-9]{4}";
        System.out.println(Pattern.matches(phoneNumberRegex,"(123)-243-9786"));
        //(xxx)-xxx-xxxx
        //(xxx)- > [0-9]{3}
        //xxx
        //xxxx

    }
}
