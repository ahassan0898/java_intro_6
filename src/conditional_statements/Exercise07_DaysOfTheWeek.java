package conditional_statements;

import java.util.Random;

public class Exercise07_DaysOfTheWeek {
    public static void main(String[] args) {

        Random r = new Random();
        int random1 = r.nextInt(7);
        System.out.println(random1);

        if (random1 == 0) System.out.println("Sunday");
            else if (random1 == 1) System.out.println("Monday");
        else if (random1 == 2) System.out.println("Tuesday");
        else if (random1 == 3) System.out.println("Wednesday");
            else if (random1 == 4) System.out.println("Thursday");
         else if (random1 == 5) System.out.println("Friday");
         else if (random1 == 6) System.out.println("Saturday");


        switch (random1){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
        }

    }
}
