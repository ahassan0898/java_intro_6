package utilities;

public class MathHelper {


        public static int maxOf3(int a, int b, int c){
            return Math.max(Math.max(a, b) , c);
        }
        public static int maxOf4(int a, int b, int c, int d){
            return Math.max(Math.max(Math.max(a, b) , c) , d);
        }
        public static int maxOf5(int a, int b, int c, int d, int e){
            return Math.max(Math.max(Math.max(Math.max(a, b) , c) , d), e);
        }
        public static int product (int a, int b){
            return a * b;
        }

        public static int sum(int a, int b) {return a + b;
        }
    public static int square(int a) {return a*a;
        }

    }


