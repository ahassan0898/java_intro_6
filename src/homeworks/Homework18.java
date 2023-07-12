package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework18 {
    public static void main(String[] args) {

        System.out.println("\n-------TASK 1-------");
        int[] arr1 = {1, 5, 10};
        int[] arr2 = {3, 7, 2};

        System.out.println(Arrays.toString(doubleOrTriple(arr1, true)));
        System.out.println(Arrays.toString(doubleOrTriple(arr2, false)));

        System.out.println("\n-------TASK 2-------");

        System.out.println(splitString("Java", 2));
        System.out.println(splitString("JavaScript", 5));
        System.out.println(splitString("Hello", 3));

        System.out.println("\n-------TASK 3-------");

        System.out.println(countPalindrome("Mom and Dad"));
        System.out.println(countPalindrome("Kayak races attracts racecar drivers"));

    }

    //Task 1
    public static int[] doubleOrTriple(int arr[], boolean tOrF){
        int[] ans = new int[arr.length];
        if(tOrF){
            for(int i = 0; i < arr.length; i++){
                ans[i] = (arr[i] * 2);
            }
        }
        else{
            for(int i = 0; i < arr.length; i++){
                ans[i] = (arr[i] * 3);
            }
        }
        return ans;
    }

    //Task 2
    public static String splitString(String str, int i1){
        String ans = "";
        if(i1 > str.length()){
            return "";
        }
        else{
            ans = str.substring(0, i1) + " " + str.substring(i1);
        }
        return ans;
    }

    //Task 3
    public static int countPalindrome(String str){
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        boolean b1 = true;
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j < str.length(); j++){
                if(str.charAt(i) == 32 && j == str.length() - 1){
                    list.add(str.substring(i + 1, j + 1).toLowerCase());
                    break;
                }
                else if(str.charAt(i) == 32 && str.charAt(j) == 32){
                    list.add(str.substring(i + 1, j).toLowerCase());
                    i = j - 1;
                    break;
                }
                else if(i == 0 && str.charAt(j) == 32){
                    list.add(str.substring(i, j).toLowerCase());
                    i = j - 1;
                    break;
                }
            }
        }
        for(int k = 0; k < list.size(); k++){
            for(int l = 0; l < list.get(k).length(); l++){
                if(list.get(k).charAt(l) != list.get(k).charAt(list.get(k).length() - 1 - l) ){
                    b1 = false;
                    break;
                }
            }
            if(b1){
                count++;
            }
            b1 = true;
        }
        return count;
    }

}
