package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        System.out.println("\n--------TASK-1----------\n");

        Scanner input = new Scanner(System.in);

//        System.out.println("Enter first number");
//        int number1 = input.nextInt();
//
//        System.out.println("Enter second number");
//        int number2 = input.nextInt();
//
//        System.out.println("The difference between numbers is = " + Math.abs(number1 - number2));
//
//        System.out.println("\n----------TASK-2-----------\n");
//
//        System.out.println("Please enter 5 numbers");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int num3 = input.nextInt();
//        int num4 = input.nextInt();
//        int num5 = input.nextInt();
//
//        int max = Math.max(num1, num2);
//        int max2 = Math.max(num3, num4);
//
//        System.out.println("Max value = " + Math.max(Math.max(max, max2),num5));
//
//        int min = Math.min(num1, num2);
//        int min2 = Math.min(num3, num4);
//        System.out.println("Min value = " + Math.min(Math.min(min,min2), num5));
//
//        System.out.println("\n---------TASK-3----------\n");
//        System.out.println("Please enter 3 numbers");
//
//        int random1 = input.nextInt();
//        int random2 = input.nextInt();
//        int random3 = input.nextInt();
//        int sum = (random1 + random2 + random3);
//
//        System.out.println("Number 1 = " + random1);
//        System.out.println("Number 2 = " + random2);
//        System.out.println("Number 3 = " + random3);
//        System.out.println("The sum of the numbers is = " + Math.round((Math.random() + sum)));
//
//
//        System.out.println("\n--------TASK-4----------\n");
//
//
//        String alex = "125";
//        String mike = "220";
//        String save = "25.5";
//        System.out.println("Alex's money : " + (Double.parseDouble(alex) - Double.parseDouble(save)));
//        System.out.println("Mike's money : " + (Double.parseDouble(mike) + Double.parseDouble(save)));
//
//        System.out.println("\n--------------TASK-5-----------\n");
//
//        double david = 390;
//        double save1 = 15.60;
//
//        System.out.println((int)(david /save1));
//
//        System.out.println("\n-----------TASK-6----------------\n");
//
//        String s1 = "5" , s2 = "10";
//
//        System.out.println("Sum of " + s1 +" and " + s2 + " is = " + ((Integer.parseInt(s1) + Integer.parseInt(s1))));
//        System.out.println("Product of " + s1 + " and " + s2 + " is = " + Integer.parseInt(s1) * Integer.parseInt(s2));
//        System.out.println("Division of " + s1 + " and " + s2 + " is = " + Integer.parseInt(s1) / Integer.parseInt(s2));
//        System.out.println("Subtraction of " + s1 + " and " + s2 + " is = " + (Integer.parseInt(s1) - Integer.parseInt(s2)));
//        System.out.println("Remainder of " + s1 + " and " + s2 + " is = " + Integer.parseInt(s1) % Integer.parseInt(s2));
//
//        System.out.println("\n--------------TASK-7-------------\n");
//
//        String s3 = "200", s4 = "-50";
//
//        int num6 = Integer.parseInt(s3);
//        int num7 = Integer.parseInt(s4);
//
//        System.out.println("The greatest value is = " + (Math.max(num6, num7)));
//        System.out.println("The smallest value is = " + (Math.min(num6, num7)));
//        System.out.println("The average is = " + (num6 + num7) / 2);
//        System.out.println("The absolute difference is = " + Math.abs(num6 - num7));
//
//        System.out.println("\n-------------------TASK-8--------------\n");
//
//        double coins = .96;
//
//        System.out.println((int) (24 / (coins)) + " days ");
//        System.out.println((int) (168 / (coins)) + " days ");
//        System.out.println("$ " + (coins) * (150));
//
//        System.out.println("\n-----------------TASK-9----------------\n");
//
//        double save2 = 62.5;
//        System.out.println((int) (1250 / save2));
//
//        System.out.println("\n-------------------TASK-10---------------\n");
//
//        double payment = 475.50;
//
//        System.out.println("Option 1 will take " + (int) (14265 / payment) + " months");
//        System.out.println("Option 2 will take " + 14265 / 951 + " months");
//
//        System.out.println("\n---------------------TASK-11-----------------\n");
//
//        System.out.println("What is your first number?");
//        int number11 = input.nextInt();
//        System.out.println("What is your second number?");
//        int number12 = input.nextInt();
//
//        System.out.println((double)number11 / number12);
//
//        System.out.println("\n---------------------TASK-12-----------------\n");
//
//
//        int rando1 = (int) (Math.random() * 101);
//        int rando2 = (int) (Math.random() * 101);
//        int rando3 = (int) (Math.random() * 101);
//        System.out.println(rando1);
//        System.out.println(rando2);
//        System.out.println(rando3);
//
//        if (rando1 <= 25){
//            System.out.println("false");
//
//        }
//        else if (rando2 <=25){
//            System.out.println("false");
//        }
//        else if (rando3 <= 25){
//            System.out.println("false");
//        }
//        else{
//            System.out.println("true");
//        }
//
//        System.out.println("\n-----------------TASK-13-------------\n");
//        System.out.println("Please enter a number between 1-7:");
//
//        int userInput = input.nextInt();
//
//        if (userInput ==1) {
//            System.out.println("MONDAY");
//        }
//        else if (userInput == 2){
//            System.out.println("TUESDAY");
//            }
//        else if(userInput == 3){
//            System.out.println("WEDNESDAY");
//        }
//        else if (userInput == 4){
//            System.out.println("THURSDAY");
//        }
//        else if (userInput == 5){
//            System.out.println("FRIDAY");
//        }
//        else if (userInput == 6){
//            System.out.println("SATURDAY");
//        }
//        else if (userInput == 7){
//            System.out.println("SUNDAY");
//        }
//        else
//            System.out.println("END OF PROGRAM");
//            {
//            }
//
//        System.out.println("\n---------------------TASK-14----------\n");
//
//        System.out.println("Please enter your three numbers");
//        int pass1 = input.nextInt();
//        int pass2 = input.nextInt();
//        int pass3 = input.nextInt();
//
//        int average = (pass1 + pass2 + pass3) / 3;
//
//        if (average >= 70) System.out.println("YOU PASSED!");
//        else System.out.println("YOU FAILED!");

        System.out.println("\n---------TASK-15-----------\n");

        System.out.println("Please enter three numbers");
        int match1 = input.nextInt();
        int match2 = input.nextInt();
        int match3 = input.nextInt();

        if (match1 == match2 && match2 == match3) System.out.println("TRIPLE MATCH");
        else if (match1 == match3 || match2 == match3) System.out.println("DOUBLE MATCH");

        else System.out.println("NO MATCH");

        System.out.println("END OF PROGRAM");

        }
}
