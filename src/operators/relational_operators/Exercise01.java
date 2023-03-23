package operators.relational_operators;

public class Exercise01 {
    public static void main(String[] args) {

        int x = 10, y = 20, z = 10;

        boolean b1 = y < z;

        boolean b2 = x <= y;

        boolean b3 = (x += z) == y++;
        boolean b4 = ++x != y / 2;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);







    }
}
