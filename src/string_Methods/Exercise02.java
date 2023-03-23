package string_Methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {


        String favBook = ScannerHelper.getFavBook();
        String favQuote = ScannerHelper.getFavQuote();

        System.out.println("The length of your favorite book is" + favBook.length());
        System.out.println("The length of your favorite quote is" + favQuote.length());
    }
}
