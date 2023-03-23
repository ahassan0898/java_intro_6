package conditional_statements;


import java.util.Random;

public class Practice2 {
    public static void main(String[] args) {

        Random r = new Random();

        int randomNumber2 = r.nextInt(100) + 1;

        if(randomNumber2 <= 25){
            System.out.println(randomNumber2 + " is in the 1st half");
            System.out.println(randomNumber2 + " is in the 1st quarter");
        } else if(randomNumber2 <= 50){
            System.out.println(randomNumber2 + " is in the 1st half");
            System.out.println(randomNumber2 + " is in the 2st quarter");
        }else if(randomNumber2 <= 75){
            System.out.println(randomNumber2 + " is in the 2st half");
            System.out.println(randomNumber2 + " is in the 3rd quarter");
        } else{
            System.out.println(randomNumber2 + " is in the 2st half");
            System.out.println(randomNumber2 + " is in the 4th quarter");
        }


char c = 'a';
        if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) System.out.println("Character is a letter");
        else if(c >= 48 && c<= 57) System.out.println("Character is a digit");



    }
}
