package conditional_statements;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter either a, b, or c");
        input.nextLine();
        String letter = input.nextLine();

        System.out.println("please enter either a, b, or c");
        input.nextLine();
        letter = input.nextLine();

        switch (letter) {
            case "a": {
                System.out.println("The letter you entered is a");
                break;
            }
            case "b": {
                System.out.println("The letter you entered is b");
                break;
            }
            case "c": {
                System.out.println("The letter you entered is c");
                break;
            }
            default: {
                System.out.println("ERROR! This is not a letter from a to c");
                {
                }
                }
            }
        }
    }