package string_Methods;

public class _08_IndexOf {
    public static void main(String[] args) {

//        1. Return
//        2. returns an int because we give it a character/ string and prints out a number
//        3. non-static-
//        4. Yes, it takes arguments - char in the parenthesis. or takes a String

        String str = "TechGlobal";
        System.out.println(str.indexOf("h"));//3

        System.out.println(str.indexOf("Y"));//-1

        System.out.println(str.indexOf("Tech"));// 0 (will only give 1st letter index)
//        lastIndexOf()
        System.out.println(str.lastIndexOf('l'));//9




    }
}
