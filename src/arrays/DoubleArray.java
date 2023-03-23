package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        //Create an array to store -> 5.5, 6, 10.3, 25

        double[] number = {5.5, 6, 10.3, 25};

        //2. print the array --> {5.5, 6, 10.3, 25}

        System.out.println(Arrays.toString(number));

        //3. print the size of the array --> the length is 4
        System.out.println("The length is " + number.length);

        //4. print each element using for each loop

        for (double v : number) {
            System.out.println(v);
        }
    }
}
