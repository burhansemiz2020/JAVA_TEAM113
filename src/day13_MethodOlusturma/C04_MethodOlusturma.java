package day13_MethodOlusturma;

import java.util.Scanner;

public class C04_MethodOlusturma {
    public static void main(String[] args) {
        /*
        Kullanicidan 10 dan kucuk iki pozitif
        tamsayi alip faktoryel degerlerini toplayin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("10 dan kucuk iki adet pozitif tamsayi girin: ");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int sonuc= C03_MethodOlusturma_FaktoryelHesaplama.faktoryelHesapla(sayi1)
                + C03_MethodOlusturma_FaktoryelHesaplama.faktoryelHesapla(sayi2);
        System.out.println(sonuc);
    }
}
