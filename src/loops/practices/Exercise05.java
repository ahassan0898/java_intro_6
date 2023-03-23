package loops.practices;

public class Exercise05 {
    public static void main(String[] args) {

        //Assume that you are given a number and you are
        //asked to find series of Fibonacci numbers
        //•What is Fibonacci numbers: a series of numbers in
        //which each number ( Fibonacci number ) is the sum
        //of the two preceding numbers
        //•It always starts with 0 and 1
        //•EX: 0, 1, 1, 2, 3, 5, 8, 13, 21
        //NOTE: Write a program that handles any n series of
        //numbers
        //Test data 1:
        //5
        //Expected output 1:
        //0 – 1 – 1 – 2 – 3
        //Test data 2:
        //7
        //Expected output 2:
        //0 – 1 – 1 – 2 – 3 – 5 - 8

        int fib = 5;
        int num1 = 0, num2=1, num3;

        String answer= "";

        for (int i = 1; i <= fib ; i++) {
            answer +=num1 + " - ";
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println(answer.substring(0,answer.length()-3));

    }
}
