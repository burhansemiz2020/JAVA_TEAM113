package day04_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C05_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {
        //Kullanicidan 3 bqsamakli ir sayi alin
        //ve sayinin rakamlar toplamini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli pozitif bir tamsayi giriniz");

        int girilenSayi = scan.nextInt();//136

        int rakam = girilenSayi % 10;

        int rakamlarToplami = rakam;

        //======

        girilenSayi = girilenSayi / 10;

        rakam = girilenSayi % 10 ;

        rakamlarToplami = rakamlarToplami + rakam;

        //======

        girilenSayi = girilenSayi / 10; //girilen sayi 13 10 a bolecek 1 sonucu alinacak

        rakam = girilenSayi % 10;

        rakamlarToplami = rakamlarToplami + rakam;



        girilenSayi = girilenSayi / 10; //girilen sayi 13 10 a bolecek 1 sonucu alinacak

        rakam = girilenSayi % 10;

        rakamlarToplami = rakamlarToplami + rakam;


        girilenSayi = girilenSayi / 10; //girilen sayi 13 10 a bolecek 1 sonucu alinacak

        rakam = girilenSayi % 10;

        rakamlarToplami = rakamlarToplami + rakam;


        System.out.println("Girilen sayinin rakamlar toplam : " + rakamlarToplami);



    }
}
