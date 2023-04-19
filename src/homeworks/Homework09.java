package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework09 {
    public static void main(String[] args) {

        System.out.println("\n======TASK-1=====\n");
        int [] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        System.out.println(numbers);

        System.out.println("\n=========TASK-2=======\n");

        String[] words = {"Z", "abc", "z", "123", "#"};
        System.out.println(words);

        System.out.println("\n=========TASK-3=======\n");

        int[] task3nums = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        System.out.println(task3nums);

        System.out.println("\n=========TASK-4=======\n");


        System.out.println("\n=========TASK-5=======\n");



        System.out.println("\n=========TASK-6=======\n");



    }

    //TASK-1

public static void firstDuplicatedNumber(int numbers){

    ArrayList<Integer> numbersList = new ArrayList<>();
    for (int num : numbersList) {
        if (numbersList.contains(num)) {
            System.out.println(num);
            break;
        }
        else numbersList.add(num);

    }

    //Task-2

/*
 public static String firstDuplicatedString(String words){

        for (int i = 0; i < words.length; i++) {
           for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    System.out.println(words[i]);
                    return;
                }
            }
       }

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
               if (!words[i].equalsIgnoreCase(words[j])) {
                    System.out.println("There is no duplicates");
                    return;
                }
            }
        }
    }

 */

    //Task-3


    int[] task3nums = {0, -4, -7, 0, 5, 10, 45, -7, 0};

       ArrayList<Integer> task3 = new ArrayList<>();
      for (int i = 0; i < task3nums.length - 1; i++) {
            for (int j = i + 1; j < task3nums.length; j++) {
                if (task3nums[i] == task3nums[j] && !task3.contains(task3nums[i])) {
                    task3.add(task3nums[i]);

                }
            }
        }
        if (task3.isEmpty()) System.out.println("There is no duplicates");
      else for (Integer n : task3) System.out.println(n);
    //TASK-4

    String[] stringArr = {"a" , "xYz", "B",};
    ArrayList<String> dup = new ArrayList<>();

    for (int i = 0; i < stringArr.length - 1; i++) {
        for (int j = i + 1; j < stringArr.length; j++) {
            if(stringArr[i].equalsIgnoreCase(stringArr[j]) && !dup.contains(stringArr[i].toLowerCase())) {
                dup.add(stringArr[i].toLowerCase());
                System.out.println(stringArr[i]);
            }
        }
    }

    if(dup.size() == 0) System.out.println("There is no duplicates");

    //TASK-5
    String[] arr = {"a", "b", "c", "d", "e", "f"};
    Collections.reverse(Arrays.asList(arr));
    System.out.println(Arrays.toString(arr));
    ArrayList<String> list = new ArrayList<>();
    for (int i = arr.length-1; i >= 0 ; i--) {
        list.add(arr[i]);
    }
    System.out.println(list);


    //TASK-6

    String str = "Java is fun"; //[java, is, fun]
    String strReversed = "";

    String[] strArr = str.split("[ ]+"); // [Java, is, fun]

    for (String s : strArr) {
        strReversed += new StringBuilder(s).reverse() + " ";
    }
    System.out.println(strReversed.trim());

}
}
