package day12_ForLoops;

import java.util.Scanner;

public class C04_ForLoopsQuestion5 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        bu sayinin faktoryel degerini
        hesaplayin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("20 den kucuk bir sayi girin");
        int sayi=scan.nextInt();
        int fak=1;

        for (int i = sayi; i >= 1; i--){

            fak *= i;

        }
        System.out.println(sayi + "! = " + fak);
        /*
        Eger sout u for loop kisminda yazsaydik
        her bir asamadaki faktoryeli consol da yazdirir
        bu sekilde de isteyebilir di
         */
    }
}
