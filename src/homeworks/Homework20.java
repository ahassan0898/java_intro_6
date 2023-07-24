package homeworks;

import java.util.TreeMap;

public class Homework20 {
    public static void main(String[] args) {

        System.out.println("\n-------TASK 1-------\n");

        int[] i1 = {1, 5, 10};
        int[] i2 = {3, 7, 2, 5, 10};

        System.out.println(sum(i1, true));
        System.out.println(sum(i2, false));

        System.out.println("\n-------TASK 2-------\n");

        System.out.println(sumDigitsDouble("Java"));
        System.out.println(sumDigitsDouble("ab12"));
        System.out.println(sumDigitsDouble("23abc45"));
        System.out.println(sumDigitsDouble("Hi-23"));

        System.out.println("\n-------TASK 3-------\n");
        System.out.println(countOccurrence("Hello", "World"));
        System.out.println(countOccurrence("Hello", "l"));
        System.out.println(countOccurrence("Can I can a can", "anc"));
        System.out.println(countOccurrence("IT conversations", "IT"));
    }

    //Task 1
    public static int sum(int[] i1, boolean b1){
        int count = 0;
        if(b1){
            for(int i = 0; i < i1.length; i++){
                if(i1[i] % 2 == 0){
                    count++;
                }
            }
        }
        else{
            for(int i = 0; i < i1.length; i++){
                if(i1[i] % 2 == 1){
                    count++;
                }
            }
        }
        return count;
    }

    //Task 2
    public static int sumDigitsDouble(String str){
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 48 && str.charAt(i) <= 57 ){
                sum += Integer.parseInt(str.substring(i, i + 1));
            }
        }

        if(sum == 0){
            return -1;
        }
        else{
            return (sum * 2);
        }
    }

    //Task 3
    public static int countOccurrence(String str1, String str2){
        TreeMap<Character, Integer> map = new TreeMap<>();
        int count = 0;
        int maxSize = str1.length();
        boolean b1 = true;
        for(int i = 0; i < str1.length(); i++){
            if(map.containsKey(str1.toLowerCase().charAt(i))){
                map.put(str1.toLowerCase().charAt(i), map.get(str1.toLowerCase().charAt(i)) + 1 );
            }
            else{
                map.put(str1.toLowerCase().charAt(i), 1);
            }
        }

        for(int k = 0; k < maxSize; k++) {
            for (int i = 0; i < str2.length(); i++) {
                if (map.containsKey(str2.toLowerCase().charAt(i)) && i == str2.length() - 1) {
                    count++;
                    map.put(str1.toLowerCase().charAt(i), map.get(str1.toLowerCase().charAt(i)) - 1);
                } else if (map.containsKey(str2.toLowerCase().charAt(i))) {
                    map.put(str1.toLowerCase().charAt(i), map.get(str1.toLowerCase().charAt(i)) - 1);
                } else {
                    b1 = false;
                    break;
                }
            }
            if(!b1){
                break;
            }
        }

        return count;




}
}
