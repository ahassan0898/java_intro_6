package exceptions.custom;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println(checkAge(16));// true
        System.out.println(checkAge(120)); // true
        System.out.println(checkAge(121)); // runtime exception
    }

    /*
    Write a method that takes an int as an argument and returns true or false
    The method name is checkAge

    if the age is more than or equals to 16 --> return true
    if the age is less than 16 --> return false

    if the age is less than 1 or more than 120 throw a runtime exception

     */

    public static boolean checkAge(int age){
        if (age >= 16 && age <= 120) return true;
        else if (age > 0 && age <16) return false;
        else throw new RuntimeException("The age cannot be less than 1 or more than 120!!");

    }

    /*
    Create a method that takes an int as an argument to state the day in the week
1 - Sunday
2 - Monday
7 - Saturday
method name = isCheckInHours()
Method returns true or false

if it is a valid day -> return true
if the input is not in the range of 1-7, then throw an exception with message
"The input does not represent any day!!!"
     */

    public static boolean isCheckInHours(int days){
        if (days >= 1 && days <=7 ) return true;
        else throw new RuntimeException("The input does not represent any day!!!");
    }
}
