package string_Methods;

public class ExerciseGetCharOrChars {
    public static void main(String[] args) {
        String name1 = "ayat"; // length 4 | middle char is index of 1 and 2 because its even
        String name2 = "Hassan"; // length 6 | middle char is index of 2
        String name3 = "Ronaldo!!"; // length 7 | middle char is index of 4
//        To find the middle char of an odd word we would need to do length() -1)/2

        System.out.println("" + name1.charAt(name1.length()/2-1) + name1.charAt(name1.length()/2));
        System.out.println(name2.charAt((name2.length()-1)/2));
        System.out.println(name3.charAt((name3.length()-1)/2));

//      To find middle character of an even word we would first get length()/2 -1
//      then we will get length()/2



    }
}
