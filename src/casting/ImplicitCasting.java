package casting;

public class ImplicitCasting {
    public static void main(String[] args) {


        short num1 = 45;
        int num2 = num1;

        float decimal1 = 34.5F;
        double decimal2 = decimal1;
        System.out.println(num2);
        System.out.println(decimal2);


        long number1 = 128;
        byte number2 = (byte)number1;
        System.out.println(number2);



    }
}
