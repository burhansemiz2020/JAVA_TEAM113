package day13_MethodOlusturma;

import java.util.Scanner;

public class C02_MethodOlusturma_IkiSayiToplama {
    public static void main(String[] args) {
        /*
        method olusturacagimiza soruya
        bakarak karar veririrz.

         */
        //Kullanicidan iki sayi alip
        // toplamlarini yazdiran bir
        // method olusturun.

        // class in icinde main in disinda
        //void sadece yazdiran method
        ikiSayiTopla();
        ikiSayiTopla();
    }



    public static void ikiSayiTopla(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Toplamak uzere iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();

        System.out.println("Iki sayinin toplami: " + (sayi1+sayi2));
        /*
        bir methodun calismasi icin method branch e ihtiyac var
        methodlar cagrilmadan calismaz bu yuzden kola ihtiyac vardir
         */
    }
}
