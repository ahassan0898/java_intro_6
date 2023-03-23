package arrays.practice05;

public class Exercise05 {
    public static void main(String[] args) {

    }

    public static void duplicatedCharacters(String str) {
        //Write a program to print duplicated characters in a
        //String, ignore cases
        //Test data 1:
        //String str = ”baNana”;
        //Expected output 1:
        //a
        //N
        //Test data 2:
        //String str = ”aPple”;
        //Expected output 1:
        //P
        String answer = "";// aN
        for (int i = 0; i < str.length() - 1; i++) {      //i = 0 1 3
            for (int j = i + 1; j < str.length(); j++) { //j = 2 3 4 5
                if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j) &&
                        !answer.contains("" + str.charAt(i))) {
                    answer += str.charAt(i);
                    break;
                }
            }
        }
        char[] answerArr = answer.toCharArray();
        for (char c : answerArr) {
            System.out.println(c);

        }
    }
}