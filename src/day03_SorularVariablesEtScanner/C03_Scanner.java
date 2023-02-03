package day03_SorularVariablesEtScanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");

        //virgullu gireceksek double
        //kullanicidan bilgiyi almak icin scan objesini ve ilgili metodu next kullanin

        double yaricap = scan.nextDouble();

        //cevresini ve alanini yazdirin

        System.out.println("Cemberin cevresi : " +2*3.14* yaricap);
        System.out.println("Dairenin alani : " + 3.14 * yaricap * yaricap);
    }
}
