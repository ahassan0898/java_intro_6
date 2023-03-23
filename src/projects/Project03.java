package projects;

import java.util.Scanner;

public class Project03 {
    public static void main(String[] args) {
        System.out.println("\n---------------TASK-1-------------\n");

        Scanner input = new Scanner(System.in);

        String s1 = "24", s2 = "5";

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        double num = Double.parseDouble(s1);
        double num3 = Double.parseDouble(s2);

        System.out.println("The sum of " + num1 + " and " + num2 + "= " + (num1 + num2));
        System.out.println("The subtraction of " + num1 + " and " + num2 + "= " + (num1 - num2));
        System.out.println("The division of " + num1 + " and " + num2 + "= " + num /num3);
        System.out.println("The multiplication of " + num1 + " and " + num2 + "= " + num1 * num2);
        System.out.println("The remainder of " + num1 + " and " + num2 + "= " + num1 % num2);


        System.out.println("\n--------------TASK-2--------------\n");

        System.out.println("Please enter a number");

        int random = (int) (Math.random() * 35) + 1;
        System.out.println(random);
        if (random== 2 || random ==3 || random == 5 || random == 7 || random == 11 || random == 13 || random == 17 || random == 19 || random == 23 || random == 29 || random == 31) System.out.print("NUMBER IS A PRIME NUMBER");
        else System.out.println("NUMBER IS NOT A PRIME NUMBER");

        System.out.println("\n--------------TASK-3--------------\n");
        int random1 = (int) (Math.random() * 50) +1;
        int random2 = (int) (Math.random() * 50) +1;
        int random3 = (int) (Math.random() * 50) +1;
        int min = Math.min(random1, random2);
        int max = Math.max(random1, random2);
        System.out.println("Lowest number is = " + Math.min(min, random3));

        if ((random1 < random2 && random2 < random3) || (random3 < random2 && random2 < random1)) System.out.println("Middle number is = " + random2);
        else if ((random2 < random1 && random1 < random3) || (random3 < random1 && random1 < random2))
            System.out.println("Middle number is = " + random1);
        else System.out.println("Middle number is = " + random3);

        System.out.println("Greatest number is = " + Math.max(max,random3));

        System.out.println("\n-------------TASK-4-------------\n");
        char a ='b';
        if (a >= 65 && a <= 90) System.out.println("The letter is uppercase");
        else if (a >= 97 && a <= 122) System.out.println("The letter is lowercase");
        else System.out.println("Invalid character detected!!!");

        System.out.println("\n---------------TASK-5----------------\n");

        char b ='2';
        if (b== 97 || b == 65 || b == 101 || b == 69 || b== 105 || b == 73 || b == 111 || b == 79 || b == 117 || b== 85)
            System.out.println("The letter is vowel");
        else if (b>= 65 && b <=90 || b>= 97 && b<= 122) System.out.println("The letter is a consonant");
        else System.out.println("Invalid character detected!!!");

        System.out.println("\n---------------TASK-6---------------\n");

        char c = 'a';
        if (c >= 65 && c<= 90 || c>= 97 && c<= 122) System.out.println("Invalid character is detected!!!");
        else if (c >= 48 && c <= 57) System.out.println("Invalid character is detected!!!");
        else System.out.println("Special character is = " + c);

        System.out.println("\n--------------------task -7--------------\n");
        char d = 'a';
        if (d >= 65 && d<= 90 || d >= 97 && d <= 122) System.out.println("Character is a letter");
        else if ( d >= 48 && d <= 57) System.out.println("Character is a letter");
        else System.out.println("Invalid character is detected!!!");


    }
}
