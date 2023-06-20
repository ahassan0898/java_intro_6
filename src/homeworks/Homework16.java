package homeworks;

import java.util.HashMap;
import java.util.TreeMap;

public class Homework16 {
    public static void main(String[] args) {


        System.out.println("\n-------TASK 1-------\n");
        String s1 = "{104}LA{101}Paris{102}Berlin{103}Chicago{100}London";


        System.out.println("\n-------TASK 2-------\n");
        HashMap<String, Integer> m1 = new HashMap<String, Integer>();
        m1.put("Apple", 3);
        m1.put("Mango", 1);

        calculateTotalPrice1(m1);

        HashMap<String, Integer> m2 = new HashMap<String, Integer>();
        m2.put("Apple", 2);
        m2.put("Pineapple", 1);
        m2.put("Orange", 3);

        calculateTotalPrice1(m2);


        System.out.println("\n-------TASK 3-------\n");
        HashMap<String, Integer> m3 = new HashMap<String, Integer>();
        m3.put("Apple", 3);
        m3.put("Mango", 5);

        calculateTotalPrice2(m3);

        HashMap<String, Integer> m4 = new HashMap<String, Integer>();
        m4.put("Apple", 4);
        m4.put("Mango", 8);
        m4.put("Orange", 3);

        calculateTotalPrice2(m4);
    }

    //Task 1
    public static TreeMap<Integer, String> parseData(String str){
        TreeMap<Integer, String> coll = new TreeMap<Integer, String>();
        for(int i = 0; i < str.length() - 4; i++){
            for(int j = i + 1; j < str.length(); j++ ){
                if(str.charAt(i) ==  123 && str.charAt(j) == 123){
                    coll.put(Integer.parseInt(str.substring(i + 1, i + 4)), str.substring(i + 5, j));
                    break;
                }
                else if(str.substring(i + 1, i + 4).equals("100") && str.charAt(j) == 110){
                    coll.put(Integer.parseInt(str.substring(i + 1, i + 4)), str.substring(i + 5));
                    break;
                }
            }
        }
        return coll;
    }

    //Task 2
    public static void calculateTotalPrice1(HashMap<String, Integer> m1){
        double total = 0.0;

        if(m1.containsKey("Apple")) {
            total += m1.get("Apple") * 2.00;
        }
        if(m1.containsKey("Orange")) {
            total += m1.get("Orange") * 3.29;
        }
        if(m1.containsKey("Mango")) {
            total += m1.get("Mango") * 4.99;
        }
        if(m1.containsKey("Pineapple")) {
            total += m1.get("Pineapple") * 5.25;
        }
        System.out.println(total);
    }

    //Task 3
    public static void calculateTotalPrice2(HashMap<String, Integer> m1){
        double total = 0.0;

        if(m1.containsKey("Apple")) {
            for(int i = 1; i <= m1.get("Apple"); i++){
                if(i % 2 == 0){
                    total += 1.00;
                }
                else{
                    total += 2.00;
                }
            }
        }
        if(m1.containsKey("Orange")) {
            total += m1.get("Orange") * 3.29;
        }
        if(m1.containsKey("Mango")) {
            for(int i = 1; i <= m1.get("Mango"); i++){
                if(i % 4 == 0){
                    continue;
                }
                else{
                    total += 4.99;
                }
            }
        }
        if(m1.containsKey("Pineapple")) {
            total += m1.get("Pineapple") * 5.25;
        }
        System.out.println(total);
    }

}


