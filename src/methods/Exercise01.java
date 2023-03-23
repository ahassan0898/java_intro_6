package methods;

import utilities.MathHelper;
import utilities.RandomGenerator;

public class Exercise01 {
    public static void main(String[] args) {

        int r1= RandomGenerator.getRandomNumber(5,8);
        int r2= RandomGenerator.getRandomNumber(3,4);
        int r3 = RandomGenerator.getRandomNumber(10,12);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }
}
