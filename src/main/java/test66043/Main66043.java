package test66043;

import lib043.BookList66043;
import util66043.U66043;
import lib043.Book66043;

public class Main66043 {

    public static void main(String[] args) {
        testUnique043();
        testCheckDigit043();
        testBook043();
        testBookList043();
    }
    private static void testUnique043(){
        System.out.println("## Test unique043 ##");
        System.out.println("unique: " + U66043.unique043());
        System.out.println("unique: " + U66043.unique043());
        System.out.println("unique: " + U66043.unique043());
    }
    static void testCheckDigit043(){
        System.out.println("## Test testCheckDigit043 ##");
        long number = 926184;
        System.out.println("checkDigit of " + number + "is" + U66043.checkDigit043(number)) ;
        number = 66130500043L;
        System.out.println("checkDigit of " + number + "is" + U66043.checkDigit043(number)) ;
    }
    static void testBook043(){
        System.out.println("##Test Book66043 ##");
        //constuctor
        Book66043 b;
        try {
            b = new Book66043(null,1.0);
        } catch (Exception e){
            System.out.println("Book Constuctor Error: " + e);
        }
        try {
            b = new Book66043(" ",1.0);
        } catch (Exception e){
            System.out.println("Book Constuctor Error: " + e);
        }
        try {
            b = new Book66043("OK",-31.0);
        } catch (Exception e){
            System.out.println("Book Constuctor Error: " + e);
        }
        b = new Book66043("OK" , 10.0);
        //getter
        System.out.println("Book.getIsbn: " + b.getIsbn043());
        System.out.println("Book.getTitle: " + b.getTitle043());
        System.out.println("Book.getPrice: " + b.getPrice043());
        //tiString
        System.out.println("Book.toString: " + b);
        //hashCode
        System.out.println("Book.hashCode : " + b.hashCode());
        //equals
        var bb = new Book66043("OK", 10.0);
        System.out.println("b" + b);
        System.out.println("bb" +bb);
        System.out.println("Book.equals: " + b.equals(new Book66043("OK", 10.0)));
    }
    static void testBookList043(){
        System.out.println("## Test Booklist66043 class ##");
        //newlist
        BookList66043 book = BookList66043.newList();
        //

    }

}
