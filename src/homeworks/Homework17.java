package homeworks;

import java.util.ArrayList;
import java.util.TreeMap;

public class Homework17 {
    public static void main(String[] args) {

        System.out.println("\n-------TASK 1-------\n");

        System.out.println(nthWord("I like programming languages", 2));
        System.out.println(nthWord("QA stands for Quality Assurance", 4));
        System.out.println(nthWord("Hello World", 3));

        System.out.println("\n-------TASK 2-------\n");

        System.out.println(isArmStrong(153));
        System.out.println(isArmStrong(123));

        System.out.println("\n-------TASK 3-------\n");
        System.out.println(reverseNumber(371));
        System.out.println(reverseNumber(21));

    }
    //Task 1
    public static String nthWord(String str, int i1){
        int count = 1;
        String answer = "";
        TreeMap<Integer, String> map = new TreeMap<>();

        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j < str.length(); j++){
                if(i == 0 && str.charAt(j) ==  32){
                    map.put(count, str.substring(i, j));
                    count++;
                    break;
                }
                else if(str.charAt(i) == 32 && str.charAt(j) == 32){
                    map.put(count, str.substring(i, j));
                    count++;
                    break;
                }
                else if(str.charAt(i) == str.lastIndexOf(' ') && j == str.length() - 1){
                    map.put(count, str.substring(i, j));
                    count++;
                    break;
                }
            }
        }
        if(i1 > count){
            return "";
        }
        else{
            return map.get(i1);
        }
    }

    //Task 2
    public static boolean isArmStrong(int i1){
        int answer = 0;
        String str = String.valueOf(i1);
        ArrayList<Integer> list = new ArrayList<>();


        for(int i = 0; i < str.length(); i++){
            list.add(Integer.parseInt(str.substring(i, i + 1 )));
        }

        for(int j = 0; j < list.size(); j++){
            answer += (list.get(j) * list.get(j) * list.get(j));
        }

        if(answer == i1){
            return true;
        }
        else{
            return false;
        }
    }

    //Task 3
    public static int reverseNumber(int i1){
        int i2 = 0;

        while(i1 != 0){
            i2 = i2 * 10; // grows the first number
            i2 += i1 % 10; // adds in the next number
            i1 = i1 / 10; // shrinks the original number
        }
        return i2;
    }

}


