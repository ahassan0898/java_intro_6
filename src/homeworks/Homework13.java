package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {




        System.out.println("----------Task1----------\n");
        System.out.println(hasLowerCase("JAVA"));

        System.out.println("\n----------Task2----------\n");
        ArrayList<Integer> task2 = new ArrayList<>(Arrays.asList(0,1,0));
        System.out.println(noZero(task2));

        System.out.println("\n----------Task3----------\n");
        int[] nums = {1, 2, 3};
        System.out.println(Arrays.deepToString(numberAndSquare(nums)));

        System.out.println("\n----------Task4----------\n");
        String[] arrTask4 = {"abc", "foo", "java", "hello"};
        String search = "hello";
        System.out.println(containsValue(arrTask4, search));

        System.out.println("\n----------Task5----------\n");
        String sentence = "This is a sentence";
        System.out.println(reverseSentence(sentence));

        System.out.println("\n----------Task6----------\n");
        removeStringSpecialsDigits("Selenium 123#$%Cypress");

        System.out.println("\n----------Task7----------\n");
        String[] strArr = {"123Java", "#$%is", "fun"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(strArr)));

        System.out.println("\n----------Task8----------\n");
        ArrayList<String> firstList = new ArrayList<>(Arrays.asList("Java", "is", "fun"));
        ArrayList<String> secondList = new ArrayList<>(Arrays.asList("abc", "xyz", "123"));
        System.out.println(removeAndReturnCommons(firstList, secondList));

        System.out.println("\n----------Task9----------\n");
        ArrayList<String> task9List = new ArrayList<>(Arrays.asList("xyXyxy", "Xx", "ABC"));
        System.out.println(noXInVariables(task9List));

    }

    // Task1
    public static boolean hasLowerCase(String str){
        for (int i = 0; i <str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))) return true;
        }
        return false;
    }


    //Task2
    public static ArrayList<Integer> noZero(ArrayList<Integer> task2){

        for (Integer integer : task2) {
            while(task2.contains(0)) task2.remove(integer);
        }

        return task2;
    }

    // Task3
    public static int[][] numberAndSquare(int[] nums) {

        int[][] numsSquare = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            numsSquare[i][0] = nums[i];
            numsSquare[i][1] = nums[i] * nums[i];
        }
        return numsSquare;
    }

    //Task4
    public static boolean containsValue(String[] arr, String search){

        Arrays.sort(arr);

        for (String s : arr) {
            if(s.equals(search)) return true;

        }
        return false;
    }


    //Task5
    public static String reverseSentence(String sentence) {
        if (!sentence.trim().contains(" ")) return "There is not enough words!";

        StringBuilder sb = new StringBuilder();
        String[] sentenceArr = sentence.trim().split("\\s+");
        for (int i = sentenceArr.length - 1; i >= 0; i--) {
            sb.append(sentenceArr[i].toLowerCase() + " ");
        }

        return sb.substring(0, 1).toUpperCase() + sb.substring(1).trim();
    }


    //Task6
    public static void removeStringSpecialsDigits(String str){
        str = str.replaceAll("[^\\p{L}\\p{Z}]","");
        System.out.println(str);
    }


    // Task7
    public static String[] removeArraySpecialsDigits(String[] arrs) {

        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = arrs[i].replaceAll("[^a-zA-Z]", "");
        }
        return arrs;
    }


    //Task8
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> firstList, ArrayList<String> secondList){
        ArrayList<String> duplicates = new ArrayList<>();

        for (String element1 : firstList) {
            for (String element2 : secondList) {
                if (element1.equals(element2) && !duplicates.contains(element1)) duplicates.add(element1);
            }
        }

        return duplicates;
    }


    //Task9
    public static ArrayList<String> noXInVariables(ArrayList<String> list){

        for (int i = 0; i < list.size(); i++) {

            String noXElement = list.get(i).replaceAll("[xX]", "");

            if (noXElement.isEmpty()) list.remove(i--);
            else list.set(i, noXElement);
        }
        return list;
    }
}
