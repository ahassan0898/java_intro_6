package arrays.practice05;

public class Exercise02 {
    public static void main(String[] args) {
        String [] arr = {"red", "blue", "yellow", "white"};
        getShortestLongest(arr);
    }
    public static void getShortestLongest(String[] words){

        //Write a program to find the longest and shortest strings
        //in an String array
        //Test data:
        //String[] words = {"red", "blue", "yellow", "white"};
        //Expected output:
        //The longest word is = yellow
        //The shortest word is = red

       String shortest = words [0];
       String longest =words[0];
        for (String word : words) {
            if (word.length()> longest.length()) longest =word;
            else if (word.length() < shortest.length()) shortest = word;
        }
        System.out.println("The longest word is = " + longest);
        System.out.println("The shortest word is = " + shortest);


    }
}
