package projects;


import java.util.ArrayList;
import java.util.Arrays;

public class Project07 {
    public static void main(String[] args) {

        System.out.println("\n========TASK-1==========\n");

        System.out.println(countMultipleWords(new String[]{"foo", "", " ", "foo bar", "java is fun", " ruby"}));

        System.out.println("\n========TASK-2==========\n");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        System.out.println(removeNegatives(list));

        System.out.println("\n========TASK-3==========\n");

        System.out.println(validatePassword(""));
        System.out.println(validatePassword("abcd"));
        System.out.println(validatePassword("abcd1234"));
        System.out.println(validatePassword("Abcd1234"));

        System.out.println("\n========TASK-4==========\n");

        System.out.println(validateEmailAddress("ayathassan970@yahoo.com"));
        System.out.println(validateEmailAddress("Ayathassan"));
        System.out.println(validateEmailAddress("abc@@gmail.com"));

    }

    //task-1
    public static int countMultipleWords(String[] arr) {

        int count = 0;
        for (String str : arr) {
            if (str.trim().contains("")) count++;
        }
            return count;
    }

    //task2
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> list) {
        list.removeIf(e -> e < 0);
        return list;

    }
    //task-3

    public static boolean validatePassword(String password) {

        if (password.length() < 8 || password.length() > 16 || password.contains(" ")) {
            return false;
        } else {
            int digit = 0;
            int special = 0;
            int upCount = 0;
            int loCount = 0;
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isUpperCase(c)) {
                    upCount++;
                } else if (Character.isLowerCase(c)) {
                    loCount++;
                } else if (Character.isDigit(c)) {
                    digit++;
                } else if (!Character.isLetterOrDigit(c)) {
                    special++;
                }
            }
            return special >= 1 && loCount >= 1 && upCount >= 1 && digit >= 1;
        }
    }

    //task4
        public static boolean validateEmailAddress(String email){
            int countAtSign = 0;
            int countdot = 0;
            if(email.contains(" ")){
                return false;
            }
            else if(!email.contains("@")){
                return false;
            }
            else if(!email.contains(".")){
                return false;
            }
            for(int i = 0; i < email.length(); i++){
                if(email.charAt(i) == 64){
                    countAtSign++;
                }
                else if (email.charAt(i)==46){
                    countdot++;
                }
            }
            if(countAtSign == 0 || countAtSign > 1){
                return false;
            }
            String[] arr1 = email.split("\\.", 2);
            String[] arr2 = arr1[0].split("@" , 2);

            if(arr1[0].length() >= 2 && arr1[1].length() >= 2 && arr2[0].length() >= 2 && arr2[1].length() >= 2){
                return true;
            }
            else{
                return false;
            }
        }
    }



