package mathClass;

public class FindMax {
    public static void main(String[] args) {
        int num1 = -10;
        int num2 = -15;
        int max = Math.max(num1, num2);

        System.out.println(max);

        int number1 = 2;
        int number2 = 8;
        int number3 = 5;
        int number4 = 18;

        int max1 = Math.max(number1, number2);
        int max2 = Math.max(number3, number4);
        System.out.println(Math.max(max1, max2));

        //
        number1 = -30;
        number2 = -40;
        number3 = 0;
        max1 = Math.max(number1, number2);
        System.out.println(Math.max(max1,number3));

        int a = 5;
        int b = 10;
        int c = 50;
        int d = 189;
        int f = 12;
        System.out.println(Math.max(Math.max( Math.max(a,b), Math.max(c,d)), f));




    }
}
