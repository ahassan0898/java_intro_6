package loops.practices;

public class Exercise01 {
    public static void main(String[] args) {

//Write a program that prints all the numbers from 1 to 10
//(1 and 10 are included)
//If the number is dividable by 2, then print “Foo” instead of
//number itself
//If the number is dividable by 5, then print “Bar” instead
//of number itself
//If the number is dividable by both 2 and 5, then print
//“FooBar” instead of number itself
//Else print number itself
//Expected output:
//1
//Foo
//3
//Foo
//Bar
//Foo
//7
//Foo
//9
//FooBar

        for (int i = 1; i <= 10; i++) {
            if (i% 10==0) System.out.println("FooBar"); // priortize the one with the most requirements
            else if (i %5==0) System.out.println("Bar");
            else if (i %2 ==0) System.out.println("Foo");
            else System.out.println(i);
        }
    }
}
