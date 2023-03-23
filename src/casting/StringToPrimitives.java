package casting;

public class StringToPrimitives {
    public static void main(String[] args) {


        int num1 = 5, num2 = 10;
        System.out.println(String.valueOf(num1) + String.valueOf(num2));


        String price = "1597.06";

        System.out.println(Double.valueOf(price) - 10.0);


    }
}
