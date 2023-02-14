package day06_IfStatements;

import java.util.Scanner;

public class C07_IfElseStatementsQuestion {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir karakter
        girmesini isteyin,
        girilen karakterin buyuk harf
        olup olmadigini yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Kullanicidan bir karakter girmesini isteyin");
        char ch=scan.next().charAt(0);
        //diyelim kullanici r girdi
        if ('A'<=ch && ch <= 'Z') {
            System.out.println("buyuk harf");
        }
        else {
            System.out.println("buyuk harf degil");
        }

    }
}
