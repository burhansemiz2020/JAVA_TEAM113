package day15_WhileLoop_DoWhileLoop_Scope;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        //Kullanicidan toplanmak uzere
        // sayilar alin. Kullaniciya
        // bitirmek icin 0 a basmasini
        //soyleyin. Kullanici sifira
        // bastiginda sifir haric kac
        // sayi girildigini ve toplamlarini
        //yazdirin
        Scanner scan = new Scanner(System.in);

        int girilenSayi = 0;
        int toplam = 0;
        int sayiAdedi = 0;

        while (girilenSayi != 0) {
            System.out.println("Toplanmak uzere tamsayi giriniz\n" +
                    "bitirmek icin 0 a basiniz");
            girilenSayi = scan.nextInt();
            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayiAdedi++;
            }

        }
        do {
            System.out.println("Toplanmak uzere tamsayi giriniz\n" +
                    "bitirmek icin 0 a basiniz");
            girilenSayi = scan.nextInt();
        if (girilenSayi != 0)
                toplam += girilenSayi;
                sayiAdedi++;

            }
            while (girilenSayi != 0) ;
            System.out.println("Girilen sayi " + sayiAdedi + " adet sayinin toplami : " + toplam);



    }
    }

