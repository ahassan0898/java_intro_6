package projects;

import java.util.Arrays;

public class Project08 {
    public static void main(String[] args) {

        System.out.println("\n======TASK-1========\n");
        int [] numbers = {4,8,7,15};
        System.out.println(findClosestDistance(numbers));

        System.out.println("\n========TASK-2========\n");

        int[] numb= {5,3,-1,5,3,7,-1};
        System.out.println(findSingleNumber(numb));

        System.out.println("\n========TASK-3========\n");
        String str = "abab";
        System.out.println(findFirstUniqueCharacter(str));

        System.out.println("\n=======TASK-4========\n");
        int [] arr = {4,7,8,6};
        System.out.println(findMissingNumber(arr));


    }

    //TASK-1

    public static int findClosestDistance(int [] numbers){
        int closestDistance = Integer.MAX_VALUE;
        if (numbers.length <= 1)
            return closestDistance = -1;
        else
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (Math.abs(numbers[i] - numbers[j]) < closestDistance) ;
                    closestDistance = Math.abs(numbers[i] - numbers[j]);
                }

            }
        return closestDistance;
    }
//TASK-2
    public static int findSingleNumber(int [] numbers){
        int singleValue = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] != numbers[j])
                    singleValue = numbers[i];
            }
        }
        return singleValue;
    }
    public static char findFirstUniqueCharacter(String str){
        char unique = ' ';
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i), str.indexOf(str.charAt(i)) + 1) == -1){
                unique = str.charAt(i);
                break;
            }
        }
        return unique;
    }

    public static int findMissingNumber(int[] arr){
        Arrays.sort(arr);
        int missingNo = 0;
        for(int i = 0; i < arr.length; i++ ){
            if(arr[i + 1] - arr[i] > 1 ){
                missingNo = arr[i] + 1;
                break;
            }
        }
        return missingNo;
    }

    }



