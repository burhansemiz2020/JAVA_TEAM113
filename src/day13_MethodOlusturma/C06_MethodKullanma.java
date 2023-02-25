package day13_MethodOlusturma;

import java.util.Scanner;

public class C06_MethodKullanma {
    public static void main(String[] args) {
        /*
        Verilen bir stringin
        palidron olup olmadigini
        yazdirin
        Palidron duz ters ayni
        sekilde yazilan demektir.
         */
        //madam
        //123321
        //kabak vs

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz: ");

        String metin = scan.nextLine();
        String tersMetin=C05_MethodOlusturma_StringiTerseCevirme.stringTersineCevir(metin);
        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin palindrome");
        } else{
            System.out.println("Girilen metin Palindrome degil");
        }
    }
}
