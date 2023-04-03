package day20_ArrayList;

public class C08_baskaClasstanKullanma {
    public static void main(String[] args) {
        /*
        Verilen sayinin pozitif tam bolenleri sayisi
        10 dan cok ise "Guzel" yoksa "Kotu" yazdirin
         */
        int sayi=3;
        int pozitifTamBolenlerSayisi= C07_Question6_TamBolenlerListesi.pozitifBolenleriListele(sayi).size();
        if (pozitifTamBolenlerSayisi>10){
            System.out.println("Guzel");
        }else{
            System.out.println("Kotu");
        }

    }
}
