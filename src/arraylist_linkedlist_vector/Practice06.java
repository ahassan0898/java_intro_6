package arraylist_linkedlist_vector;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice06 {
    public static void main(String[] args) {
        System.out.println("\n=============TASK-1==========\n");
        System.out.println(Arrays.toString(double1(new int[]{3, 2, 5, 7, 0})));

        System.out.println("\n=============TASK02========\n");
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,1,1,1,1));
        System.out.println(secondMax(list));

        System.out.println("\n=========TASK03==========\n");
        ArrayList<Integer>list1 = new ArrayList<>(Arrays.asList(2,3,7,1,1,7,1));
        System.out.println(secondMin(list1));

        System.out.println("\n=======TASK05====\n");
        ArrayList<Integer>list3 = new ArrayList<>(Arrays.asList(200,5,100,99,101,75));
        System.out.println(remove3OrMore(list3));


        System.out.println("\n=========TASK06=========\n");
        System.out.println(uniqueWords("TechGlobal School"));

    }


    ///////////////// TASK 01 Write a method called as
    //double1
    // to double each element
    //in an int array and return it back.
    //NOTE: The return type is an array.
    //Test data 1:
    //{3, 2, 5, 7, 0}
    //Expected output 1:
    //[6, 4, 10, 14, 0]
    //Test data 2:
    //[-2, 0, 3, 10, 100]
    //Expected output 2:
    //[-4, 0, 6, 20, 200]
    //NOTE: Make your code dynamic that works for any given
    //array
    public static int[] double1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2; //multiplies each i by 2
        }
        return arr;
    }

    /////////// Write a method called as secondMax
    // to find and return the second max number in an ArrayList
    //Test data 1: {2, 3, 7, 1, 1, 7, 1}
    //Expected output 1:
    //3
    //Test data 2: [5, 7, 2, 2, 10, 10]
    //Expected output 2:
    //7
    //NOTE: Make your code dynamic that works for any given ArrayList


    //WAY1

    public static int secondMax(ArrayList<Integer> list) {//2, 3, 7, 1, 1, 7, 1
        Collections.sort(list);//1, 1, 1, 2, 3, 7, 7
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (Integer n : list) {
            max = Math.max(max, n);
        }
        for (Integer n : list) {
            if (n > secondMax && n < max) secondMax = n;
        }
        return 0;
    }

    public static int secondMin (ArrayList<Integer> list){
        Collections.sort(list); // list
        for (int i = 1; i <list.size() ; i++) {
            if (list.get(i) > list.get(0)) return list.get(i);
        }
        return 0;
    }

    //Write a method called as
    //remove3orMore
    // to find and remove all
    //the elements in an ArrayList that are more than 2 digits.
    //Then, return the modified ArrayList back.
    //NOTE: - sign should not counted as a digit when it is negative
    //number.
    //Test data 1:
    //[200, 5, 100, 99, 101, 75]
    //Expected output 1:
    //[5, 99, 75]
    //Test data 2:
    //[-12, -123, -5, 1000, 500, 0]
    //Expected output 2:
    //[-12, -5, 0]
    //NOTE: Make your code dynamic that works for any given ArrayList


    public static ArrayList<Integer> remove3OrMore(ArrayList<Integer> list){
        list.removeIf(e->e>=100 || e>=-100);
        return list;
    }


    //Write a method called as uniquesWords
    // to find and return all the unique words in a String.
    //NOTE: The return type is an ArrayList.
    //NOTE: Assume that you will not be given extra spaces.
    //Test data 1:
    //"TechGlobal School”
    //Expected output 1:
    //["TechGlobal", "School"]
    //Test data 2:
    //"Star Light Star Bright"
    //Expected output 2:
    //["Star", "Light", "Bright"]
    //NOTE: Make your code dynamic that works for any given String

    public static ArrayList<String>uniqueWords(String str){

        ArrayList<String> strAsList = new ArrayList<>();
        for (String s:str.split(" ")) {
            if (!strAsList.contains(s)) strAsList.add(s);
        }
        return strAsList;
    }

}