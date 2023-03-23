package conditional_statements;

import java.util.Scanner;

public class Exercise06_CheckAll10 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        int random = (int) (Math.random() * 2) + 10;
        int random1 = (int) (Math.random() * 2) + 10;

        if(random == 10 && random1 == 10){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }





    }
}
