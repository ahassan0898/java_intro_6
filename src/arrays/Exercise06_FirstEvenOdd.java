package arrays;

public class Exercise06_FirstEvenOdd {
    public static void main(String[] args) {

        int[] numbers = {0,5,3,2,4,7,10};
        int even= 1;
        for (int number : numbers) {
            if (number%2==0){
                System.out.println(number);
                break;
            }
        }
        int odd =1;
        for (int number : numbers) {
            if (number %2==1 ){
                System.out.println(number);
                break;
            }
        }
    }
}
