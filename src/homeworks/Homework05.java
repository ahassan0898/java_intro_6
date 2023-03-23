package homeworks;

import utilities.ScannerHelper;

public class Homework05 {
    public static void main(String[] args) {

        System.out.println("\n---------------TASK-1-----------\n");
        String solution = "";
        for (int i = 1; i <= 100 ; i++) {
            if(i % 7 == 0) solution += i + " - ";
        }
        System.out.println(solution.substring(0,solution.length() - 3));

        System.out.println("\n---------------TASK-2-----------\n");

        solution = "";
        for (int i = 1; i <= 50 ; i++) {
            if(i % 6 == 0) solution += i + " - ";
        }
        System.out.println(solution.substring(0,solution.length() - 3));

        System.out.println("\n---------------TASK-3-----------\n");

        solution = "";
        for (int i = 100; i >= 50 ; i--) {
            if(i % 5 == 0) solution += i + " - ";
        }
        System.out.println(solution.substring(0,solution.length() - 3));
            System.out.println("\n---------------TASK-4-----------\n");

            for (int i = 0; i <= 7; i++) {
                int square = i * i;
                System.out.println("The square of " + i + " is = " + square);
            }

            System.out.println("\n---------------TASK-5-----------\n");

            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            System.out.println(sum);


            System.out.println("\n---------------TASK-6-----------\n");
        int number = ScannerHelper.getNumber();//5
        int answer = 1;//1 1 2 6 24 120

        for (int i = 1; i <= number; i++) {// i = 1 2 3 4 5 6
            answer *= i; //answer = answer * i;
        }
        System.out.println(answer);

            System.out.println("\n---------------TASK-7-----------\n");

            String name = ScannerHelper.getString();
            name = name.toLowerCase();
            int count = 0;

            for (int i = 0; i <= name.length() - 1; i++) {
                char c = name.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    count++;
            }
            System.out.println("There are " + count + " vowel letters in this full name");


            System.out.println("\n---------------TASK-8-----------\n");

            for (; ; ) {
                String name2 = ScannerHelper.getFirstName();
                if (name2.contains("j") || name2.contains("J")) {
                    System.out.println("End of the program");
                    break;
                }
            }
        }
    }


