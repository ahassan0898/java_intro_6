package homeworks;

public class Homework19 {
    public static void main(String[] args) {

        System.out.println("\n-------TASK 1-------\n");
        int[] i1 = {1, 5, 10};
        int[] i2 = {3, 7, 2, 5, 10};

        System.out.println(sum(i1, true));
        System.out.println(sum(i2, false));

        System.out.println("\n-------TASK 2-------\n");

        System.out.println(nthChars("Java", 2));
        System.out.println(nthChars("Java", 3));
        System.out.println(nthChars("JavaScript", 5));
        System.out.println(nthChars("Hi", 4));

        System.out.println("\n-------TASK 3-------\n");

        System.out.println(canFormString("Hello", "Hi"));
        System.out.println(canFormString("halogen", "hello"));
        System.out.println(canFormString("programming", "gaming"));
        System.out.println(canFormString("CONVERSATION", "voices rant on"));

        System.out.println("\n-------TASK 4-------\n");

        System.out.println(isAnagram("Apple", "Peach"));
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("astronomer", "moon starer"));
        System.out.println(isAnagram("CINEMA", "iceman"));

    }

    //Task 1
    public static int sum(int[] i1, boolean b1){
        int ans = 0;
        if(b1){
            for(int i = 0; i < i1.length; i += 2){
                ans += i1[i];
            }
            return ans;
        }
        else{
            for(int i = 1; i < i1.length; i += 2){
                ans += i1[i];
            }
            return ans;
        }
    }

    //Task 2
    public static String nthChars(String str, int i1){
        String ans = "";
        if(i1> str.length()){
            return "";
        }
        else{
            for(int i = i1 - 1; i < str.length(); i+=i1){
                ans += str.charAt(i);
            }
            return ans;
        }
    }

    //Task 3
    public static boolean canFormString(String str1, String str2){
        boolean b1 = false;
        for(int i = 0; i < str2.length(); i++){
            if(str2.charAt(i) == 32){
                i++;
            }
            else {
                for (int j = 0; j < str1.length(); j++) {
                    if(str1.charAt(j) == 32){
                        j++;
                    }
                    else if(str2.toLowerCase().charAt(i) != str1.toLowerCase().charAt(j) && j == str1.length() - 1){
                        return false;
                    }
                    else if(str2.toLowerCase().charAt(i) == str1.toLowerCase().charAt(j)){
                        b1 = true;
                        break;
                    }
                }
            }
        }
        return b1;
    }

    //Task 4
    public static boolean isAnagram(String str1, String str2){
        boolean b1 = false;
        for(int i = 0; i < str2.length(); i++){
            if(str2.charAt(i) == 32){
                i++;
            }
            else {
                for (int j = 0; j < str1.length(); j++) {
                    if(str1.charAt(j) == 32){
                        j++;
                    }
                    else if(str2.toLowerCase().charAt(i) != str1.toLowerCase().charAt(j) && j == str1.length() - 1){
                        return false;
                    }
                    else if(str2.toLowerCase().charAt(i) == str1.toLowerCase().charAt(j)){
                        b1 = true;
                        break;
                    }
                }
            }
        }
        return b1;
    }

}

