package loops;

public class Exercise03_PrintEvenNumbers {
    public static void main(String[] args) {
        //Write a java program to print only even numbers from 0-10 (0-10 are included)
        //start point :0
        //end point: 10
        // update: increment

        for (int i = 0; i <=10 ; i++) {
           if(i %2 == 0) System.out.println(i);
        }

        System.out.println("\n----------second way-----------\n");
        for (int i = 0; i <=10 ; i+=2) {
            System.out.println(i);
        }


    }
}
