package arrays;

import java.util.Arrays;

public class Exercise02_CountString {
    public static void main(String[] args) {
        //1. Declare a String array called as countries and assign size of 3

        String [] countries = new String[3];

        //2. Assign "Spain" to index of 1

        countries[1] = "Spain";
        countries[0] = "Belgium";
        countries[2]= "Italy";

        //3. Print the values at index of 1 and 2

        System.out.println(countries[1]);
        System.out.println(countries[2]);

        //5. Print the array : [Beligum, Spain, Italy]
        System.out.println(Arrays.toString(countries));

        //6. Sort this array and print it once again
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        //7. Print each element with for i loop
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }

        //8. Print each element with for each loop
        for (String country : countries) {
            System.out.println(country);
        }
        // 9. Count how many country has 5 characters
       int count5=0;
        for (String country : countries) {
            if(country.length()==5) count5++;
        }
        System.out.println(count5);

        //10. count how many countries has letter I or i in their name --> 3
        int countI= 0;
        for (String country : countries) {
           if (country.contains("i") || country.contains("I")) countI++;
        }
        System.out.println(countI);
    }
}
