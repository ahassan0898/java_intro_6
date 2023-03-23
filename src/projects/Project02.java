package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {

        System.out.println("\n---------TASK-1-------\n");

        Scanner input =  new Scanner(System.in);

        System.out.println("Please enter 3 numbers: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println("The product of the numbers entered is = " + num1 * num2 * num3);

        System.out.println("\n--------TASK-2--------\n");

        System.out.println("What is your first name?");
        String fName = input.nextLine();
        input.nextLine();

        System.out.println("What is your last name?");
        String lName = input.nextLine();

        System.out.println("What is your year of birth?");
        int year = input.nextInt();
        input.nextLine();
        int difference = 2022 - year;
        System.out.println("Jennifer Worley's age is = " + difference);
        input.nextLine();

        System.out.println("\n--------TASK-3--------\n");

        System.out.println("What is your full name?");
        String name = input.nextLine();

        System.out.println("What is your weight?");
        int weight = input.nextInt();
        double kg = weight * 2.205;
        System.out.println("Alex Morgan's weight is = " + kg + " lbs. ");
        input.nextLine();

        System.out.println("\n--------------TASK-4------------\n");

        System.out.println("What is student 1's full name?");
        String name1 = input.nextLine();

        System.out.println("What is your age?");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("What is student 2's full name?");
        String name2 = input.nextLine();

        System.out.println("What is your age?");
        int age2 = input.nextInt();
        input.nextLine();

        System.out.println("What is student 3's full name?");
        String name3 = input.nextLine();

        System.out.println("What is your age?");
        int age3 = input.nextInt();
        input.nextLine();

        System.out.println("Scott Wender's age is " + age + ". ");
        System.out.println("Ben Meeder's age is " + age2 + ". ");
        System.out.println("Matt Chris's age is " + age3 + ". ");

        int avAge = age + age2 + age3;
        System.out.println("The average age is " + avAge /3 + ". ");

        int eldestAge = Math.max(age, age2);
        System.out.println("The eldest age is = " + Math.max(eldestAge, age3) + ". ");

        int youngestAge = Math.min(age, age2);
        System.out.println("The youngest age is = " + Math.min(youngestAge, age3) + ". ");


    }
}
