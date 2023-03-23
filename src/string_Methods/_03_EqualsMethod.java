package string_Methods;

public class _03_EqualsMethod {
    public static void main(String[] args) {

//        1. return type is boolean- returning true/false
//        2. non static
//        3. takes objects as an argument but in our case it takes a String


        String str1 = "Tech";
        String str2 = "Global";
        String str3 = "tech";
        String str4 = "TechGlobal";
        System.out.println("TechGlobal");

        boolean isEquals = str1.equals(str2);
        System.out.println(isEquals);

        System.out.println(str1.equals(str3));
        System.out.println((str1.concat(str2)).equals(str4));
    }
}
