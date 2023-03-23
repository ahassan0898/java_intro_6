package loops.loops;

public class Exercise01_PrintNumberDividedBy3 {
    public static void main(String[] args) {
        /*
Write a program that prints all the numbers divided by 3, starting from 1 to 100 (both included)

3
6
9
.
.
.
.
96
99
 */
        System.out.println("\n-------------while loop---------\n");
        int num= 1;
        while (num<=100){
            if(num %3== 0) System.out.println(num);
            num++;
        }
        System.out.println("\n------------for loop------\n");
        for (int i = 1; i <=100 ; i++) {
          if(i %3 ==0)  System.out.println(i);
        }
    }
}
