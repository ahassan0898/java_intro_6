package loops;

public class Exercise04_PrintNumbersDivisibleBy5 {
    public static void main(String[] args) {
        //Write a java program to check numbers from 1 to 50 (50 is included)
        // and print all the numbers that can be divided by 5
        //start:1
        //end: 50
        //update: increment

        for (int i = 1; i <=50 ; i++) {
            if (i % 5== 0) System.out.println(i);
        }

    }
}
