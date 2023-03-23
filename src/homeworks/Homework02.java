package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        System.out.println("\n--------------------TASK-1-------------\n");

       Scanner input = new Scanner(System.in);

        System.out.println("The number 1 entered by user is = ");
        int num1 = input.nextInt();

        System.out.println("The number 2 entered by user is = ");
        int num2 = input.nextInt();

        System.out.println("The sum of number 1 and 2 entered by user is = " + (num1 + num2));


        System.out.println("\n--------------TASK-2------------\n");

        System.out.println("Please enter a number?");
        int num3 = input.nextInt();
        input.nextLine();

        System.out.println("Please enter a number?");
        int num4 = input.nextInt();
        int product = num3 * num4;
        System.out.println("The product of the given 2 numbers is: " + product);


        System.out.println("\n--------------------TASK-3-------------\n");

        System.out.println("Please enter five numbers");

       double num5 = input.nextInt();
       double num6 = input.nextInt();
        double add = num5 + num6;
        double subtraction = num5 - num6;
        double multiplication = num5 * num6;
        double division = num5 / num6;
        double remainder = num5 % num6;

        System.out.println("The sum of the given numbers is = " + add);
        System.out.println("The product of the given numbers is = " + multiplication);
        System.out.println("The subtraction of the given numbers is = " + subtraction);
        System.out.println("The division of the given numbers is = " + division);
        System.out.println("The remainder of the given numbers is = " + remainder);


        System.out.println("\n--------------------TASK-4-------------\n");

        System.out.println(-10 + 7 * 5);
        System.out.println((72+24) % 24);
        System.out.println(10 + -3 * 9 / 9);
        System.out.println (5 + 18 / 3 * 3 - (6 % 3));


        System.out.println("\n--------------------TASK-5-------------\n");
        System.out.println("Please input two numbers");
         int average1 = input.nextInt();
         int average2= input.nextInt();
     System.out.println("The average of the given numbers is: " + (average1 + average2) /2);


        System.out.println("\n--------------------TASK-6-------------\n");

        System.out.println("Please input five numbers");
        int average3 = input.nextInt();
        int average4 = input.nextInt();
        int average5 = input.nextInt();
        int average6 = input.nextInt();
        int average7 = input.nextInt();

     System.out.println("The average of the given numbers is: " + (average3 + average4 + average5 + average6 + average7) / 5);

        System.out.println("\n--------------------TASK-7-------------\n");

        System.out.println("Please input 3 numbers");
        int square1 = input.nextInt();
        int square2 = input.nextInt();
        int square3 = input.nextInt();
        input.nextLine();

        System.out.println("The " + square1 + " multiplied with " + square1 + " is = " + square1 * square1);
        System.out.println("The " + square2 + " multiplied with " + square2 + " is = " + square2 * square2);
        System.out.println("The " + square3 + " multiplied with " + square3 + " is = " + square3 * square3);

        System.out.println("\n--------------------TASK-8-------------\n");

        System.out.println("Please find the area and perimeter");

        int square = input.nextInt();
        System.out.println("Perimeter of the square = " + 4 * square);
        System.out.println("Area of the square = " + square * square);

        System.out.println("\n--------------------TASK-9-------------\n");
        double average = 90000;

        System.out.println("A Software Engineer in Test can earn $" + average * 3 + " in 3 years.");

        System.out.println("\n--------------------TASK-10-------------\n");

        input.nextLine();
        System.out.println("What is your favorite book?");
        String favBook = input.nextLine();

        System.out.println("What is your favorite color?");
        String favColor = input.nextLine();

        System.out.println("What is your favorite number?");
        int favNumber2 = input.nextInt();
        input.nextLine();

        System.out.println("User's favorite book is: " + favBook + "\nUser's favorite color is: " + favColor + "\nUser's favorite number is: " + favNumber2);

        System.out.println("\n--------------------TASK-11-------------\n");

        System.out.println("What is your first name?");
        String firstName = input.nextLine();

        System.out.println("What is your last name?");
        String lastName = input.nextLine();

        System.out.println("What is your age?");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("What is your email address?");
        String emailAddress = input.nextLine();

        System.out.println("What is your phone number?");
        String phoneNumber = input.nextLine();

        System.out.println("What is your address?");
        String address = input.nextLine();

        System.out.println("\tUser who joined this program is " + firstName + lastName + "." + " John's age is " + age + "." + " John's email \naddress is " + emailAddress + "," + " phone number is " + phoneNumber + ", and address \nis " + address + ".");




    }
}
