package random_class;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random r = new Random();
        int num1 = r.nextInt(16);
        int num2 = r.nextInt(36) + 40;
        int num3 = r.nextInt(36) + 40;
        int num4 = r.nextInt(36) + 40;
        int num5 = r.nextInt(36) + 40;

        int num6 = r.nextInt(16)+15;
        int num7= r.nextInt(25)+28;
// 5 = gives you the range between 0-4 + 10 on top
        //number outside of the parenthseis is starting point
        // number inside parenthesis is starting point - end point +1
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);



    }
}
