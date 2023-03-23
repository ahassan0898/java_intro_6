package arrays;

import java.util.Arrays;

public class DefaultValues {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        double [] doubles = new double[5];
        char[] characters = new char[5];
        boolean[] booleans = new boolean[5];
        String[] words = new String[5];

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(doubles));
        System.out.println(Arrays.toString(characters));
        System.out.println(Arrays.toString(booleans));
        System.out.println(Arrays.toString(words));

    }
}
