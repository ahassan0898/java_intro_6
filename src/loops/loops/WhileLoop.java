package loops.loops;

public class WhileLoop {
    public static void main(String[] args) {

        //print numbers starting from 1-5 5 included
        System.out.println("\n-----------for loop-------\n");
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i);
        }

        System.out.println("\n----------while loop----------\n");
        int num = 1;
        while (num <=5){
            System.out.println(num);
            num ++;
        }
    }
}
