package operators.shorthand_operators;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Hey user, please enter your balance: ");

        double balance = inputReader.nextDouble();
        System.out.println("The initial balance = $ " + balance);

        System.out.println("What is the first transaction amount?");
        double firstTrns = inputReader.nextDouble();

        balance -= firstTrns;
        System.out.println("The balance after first transaction = $ " + balance);

        System.out.println("What is the second transaction amount?");

        System.out.println("The balance after second transaction = $ " + (balance -= inputReader.nextDouble()));

        System.out.println("What is the third transaction amount?");

        System.out.println("The balance after third transaction = $ " + (balance -= inputReader.nextDouble()));






    }
}
