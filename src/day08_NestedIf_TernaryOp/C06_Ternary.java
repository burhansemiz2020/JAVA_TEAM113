package day08_NestedIf_TernaryOp;

public class C06_Ternary {
    public static void main(String[] args) {
        /*
        Ternary operatoru ya dirrek
        sout icerisinde kullanilir
        veya bir degiskene atama yapilacak
        sekilde yazilir

         */
        int sayi = 19;
        //sayi%2==0 ? "sayi cift" : "sayi tek" bu sekilde yazilirsa java hata verir
        //cozum
        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek");

        /*
        eger true olugundaki sonuc ile
        false oldugundaki sonuc farkli
        data turlerinde olursa
        ORNEGIN
        sayi cift ise cift yazdirin
        degilse sayinin iki katini yazdirin
         */
        System.out.println(sayi%2==0 ? "sayi cift" : 2*sayi);

        /*
        String sonuc1= sayi%2==0 ? "sayi cift" : 2*sayi; olmaz
        int sonuc1=sayi%2==0 ? "sayi cift" : 2*sayi; olmaz
        */

    }
}
