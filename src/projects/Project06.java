package projects;

import java.util.Arrays;

public class Project06 {
    public static void main(String[] args) {
        //TASK 1
        int[] arr = {10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallestWithSort(arr);
        //TASK 2
        int[] arr1 = {10, 7, 7, 10 - 3, 10, -3};
        findGreatestAndSmallest(arr1);
        //TASK 3
        int[] arr2 = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallestWithSort(arr2);
        //TASK 4
        int[] arr3 = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallest(arr3);
        //TASK 5
        String[] dupes = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        findDuplicatedElementsInAnArray(dupes);
        //TASK 6
        String[] words = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        findMostRepeatedElementInAnArray(words);
    }


    //TASK-1
    public static void findGreatestAndSmallestWithSort(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("Smallest = " + numbers[0]);
        System.out.println("Greatest = " + numbers[numbers.length - 1]);

}
    public static void findGreatestAndSmallest(int[] arr1) {
        System.out.print("\n====================TASK2====================\n");
        /*
        Write a method that takes an int array that has at least one element.
        Find the greatest and smallest elements from the array and print them. DO NOT sort the array and complete task without sorting.
         */
        int min = 10;
        int max = 10;

        for (int i : arr1) {
            if (i > max) max = i;
            else if (i < min) min = i;
        }
        System.out.println("Smallest = " + min);
        System.out.println("Greatest = " + max);
    }

    public static void findSecondGreatestAndSmallestWithSort(int[] arr2) {
        System.out.print("\n====================TASK3====================\n");
        /*
        Write a method that takes an int array that has at least one element.
        Find the second greatest and second smallest elements from the array and print them. Complete task using sort() method.
         */
        Arrays.sort(arr2);

        for (int j : arr2) {
            if (j != arr2[0]) {
                System.out.println("Second Smallest = " + j);
                break;
            }
        }

        for (int i = arr2.length - 1; i >= 0; i--) {
            if (arr2[i] != arr2[arr2.length - 1]) {
                System.out.println("Second Greatest = " + arr2[i]);
                break;
            }
        }
    }

    public static void findSecondGreatestAndSmallest(int[] arr3) {
        System.out.print("\n====================TASK4====================\n");
        /*
        Write a method that takes an int array that has at least one element.
        Find the second greatest and second smallest elements from the array and print them. DO NOT sort the array and complete task without sorting.
         */
        //System.out.println(Arrays.toString(arr3));
        int max = 10;
        int min = 10;
        int secondMax = 10;
        int secondMin = 10;

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > max) max = arr3[i];
            if (arr3[i] < min) min = arr3[i];

        }

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > min && arr3[i] < secondMin) secondMin = arr3[i];
            if (arr3[i] < max && arr3[i] > secondMax) secondMax = arr3[i];
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);
    }

    public static void findDuplicatedElementsInAnArray(String[] dupes) {
        System.out.print("\n====================TASK5====================\n");
       /*
        Write a method that takes a String array. Find all duplicated elements and print them.
NOTE: It is case-sensitive!

        */
        for (int i = 0; i < dupes.length; i++) {
            for (int j = i + 1; j < dupes.length; j++) {
                if (dupes[i].equals(dupes[j])) System.out.println(dupes[j]);
            }
        }
    }

    public static void findMostRepeatedElementInAnArray(String[] words) {
        System.out.print("\n====================TASK6====================\n");
        /*
        Write a method that takes a String array. Find the most repeated element and print it.
         */
        String repeat = "";
        int counter = 0;
        int newCounter = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    newCounter++;
                    if (newCounter > counter) {
                        repeat = words[i];
                        counter = newCounter;
                    }
                }

            }
            newCounter = 0;

        }
        System.out.println(repeat);


    }


}



