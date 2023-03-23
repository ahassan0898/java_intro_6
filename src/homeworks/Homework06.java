package homeworks;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("\n-----------TASK-1-----------\n");

        int [] arr = new int[10];
        arr[2] = 23;
        arr[4] = 12;
        arr[7] = 34;
        arr[9] = 7;
        arr[6] = 15;
        arr[0] = 89;

        System.out.println(arr[3]);
        System.out.println(arr[0]);
        System.out.println(arr[9]);
        System.out.println(Arrays.toString(arr));


        System.out.println("\n-----------TASK-2-----------\n");

        String [] array = new String[5];
        array[1] = "abc";
        array[4]= "xyz";

        System.out.println(array[3]);
        System.out.println(array[0]);
        System.out.println(array[4]);
        System.out.println(Arrays.toString(array));


        System.out.println("\n-----------TASK-3-----------\n");

        int[] numbers = {23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n-----------TASK-4-----------\n");

        String [] countries = {"Germany", "Argentina", "Ukraine", "Romania"};

        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println("\n-----------TASK-5-----------\n");

        String [] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(dogs));
        if (Arrays.toString(dogs).contains("Pluto")) System.out.println("true");
        else System.out.println("false");

        System.out.println("\n-----------TASK-6-----------\n");

        String [] cats = {"Garfield", "Tom", "Sylvester" , "Azrael", "Felix"};
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));
        if(Arrays.toString(cats).equals("Felix") && Arrays.toString(cats).equals("Garfield"))
            System.out.println("true");
        else System.out.println("false");

        System.out.println("\n-----------TASK-7-----------\n");
        double [] num = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(num));
        for (double v : num) {
            System.out.println(v);
        }

        System.out.println("\n-----------TASK-8-----------\n");
        char[] cArray = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        System.out.println(Arrays.toString(cArray));
        int lCounter = 0;
        int lowCounter = 0;
        int upCounter = 0;
        int dCounter = 0;
        int specCounter = 0;
        for (char element : cArray) {
            if(Character.isLetter(element)) lCounter++;
            if(Character.isUpperCase(element)) upCounter++;
            if(Character.isLowerCase(element)) lowCounter++;
            if(Character.isDigit(element)) dCounter++;
            if((element > 31 && element < 48) || element > 57 && element < 65) specCounter++;
        }
        System.out.println("Letters = " + lCounter);
        System.out.println("Uppercase letters = " + upCounter);
        System.out.println("Lowercase letters = " + lowCounter);
        System.out.println("Digits = " + dCounter);
        System.out.println("Special characters = " + specCounter);

        System.out.println("\n-----------TASK-9-----------\n");

        String [] supplies = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};

        System.out.println(Arrays.toString(supplies));

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;

        for (String object : supplies) {

            if(Character.isUpperCase(object.charAt(0))) counter1++;
            if(Character.isLowerCase(object.charAt(0))) counter2++;
            if(object.startsWith("B") || object.startsWith("P")) counter3++;
            if(object.toLowerCase().equals("book") || object.toLowerCase().equals("pen")) counter4++;
        }

        System.out.println("Elements starts with uppercase = " + counter1);
        System.out.println("Elements starts with lowercase = " + counter2);
        System.out.println("Elements starting with B or P = " + counter3);
        System.out.println("Elements having \"book\" or \"pen\" = " + counter4);


        System.out.println("\n-----------TASK-10-----------\n");

        int [] number1= {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};

        System.out.println(Arrays.toString(number1));

        int tenPlus= 0;
        int tenLower = 0;
        int tenEquals = 0;

        for (int num1 : number1) {
            if(num1 > 10) tenPlus++;
            if(num1 < 10) tenLower++;
            if(num1 == 10) tenEquals++;
        }

        System.out.println("Elements that are more than 10 = " +  tenPlus);
        System.out.println("Elements that are less than 10 = " +  tenLower);
        System.out.println("Elements that are 10 = " +  tenEquals);


        System.out.println("\n-----------TASK-11-----------\n");

        int [] array1 = {5,8,13,1,2};
        int [] array2 = {9,3, 67, 1, 0 };
        int [] array3 = new int[5];
        for (int i = 0; i <array1.length; i++) {
            if(array1[i] > array2[i])  array3[i] = array1[i];

            else array3[i] = array2[i];
        }

        System.out.println("1st array is = " + Arrays.toString(array1));
        System.out.println("2nd array is = " + Arrays.toString(array2));
        System.out.println("3rd array is = " + Arrays.toString(array3));





    }
}
