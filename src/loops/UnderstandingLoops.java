package loops;

import utilities.ScannerHelper;

public class UnderstandingLoops {
    public static void main(String[] args) {
        // for loops syntax
        // for(initilaiation; termination; update){
        //block of code to be executed}

        // initilazation is going to be the start point
        // termination is the stop condition
        // update increasing or decreasing --> increment or decrement operators

        //print Hello World 5 times

       for(int num = 0; num <5; num++){
           System.out.println("Hello World");

           //infinite loop code under:
           // for(int num =0; num >-1; num ++){
           // System.out.println("HI");
           // }




       }



    }

    public static class Exercise10_SumOfNumbersByUser {
        public static void main(String[] args) {
            //Write a program that asks user to enter 5 numbers
            //Find sum of the given numbers by user

            ScannerHelper.getNumber();
        }
    }
}
