package collections;

import java.util.HashMap;
import java.util.Map;

public class Exercise03_CalculateCharacters {
    public static void main(String[] args) {


        System.out.println("\n----TASK-1----\n");

        String str = "banana";
        HashMap<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)); // this will give characters one by one


            for (char letter: str.toCharArray()){
               if (!letters.containsKey(letter)) letters.put(letter,1);
               else letters.put(letter, letters.get(letter) +1);
                //if letters already has a key with letter, then increase its value by 1
                //else put it into map wth the value of 1
            }
            System.out.println(letters);
        }


        // System.out.println(lettersMap); // {a=3, b=1, n=2}

        System.out.println("\n-------TASK-2-----\n");



    }
}
