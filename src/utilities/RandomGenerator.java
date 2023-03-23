package utilities;

import java.util.Random;

public class RandomGenerator {
    // write a method that generates random number between the range given and returns it.

    public static int getRandomNumber(int start, int end){
        Random r = new Random();
        return new Random().nextInt(end - start + 1) + start;
    }
}
