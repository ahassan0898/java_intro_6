package loops;

public class Exercise09_FindSumOfNumbers {
    public static void main(String[] args) {
        //Write a java program to find the sum of the numbers from 10 to 15 (10 and 15 are included)
        //Start point: 10
        //End point:15
        //update: Increment
        int sum =0;
        for (int i = 10; i <=15  ; i++) {
           sum +=i;
        }
        System.out.println(sum);
    }
}
