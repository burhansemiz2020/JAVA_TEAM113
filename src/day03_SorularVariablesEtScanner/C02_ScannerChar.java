package day03_SorularVariablesEtScanner;

import java.util.Scanner;

public class C02_ScannerChar {
    public static void main(String[] args) {
        /*Soru 5- Kullanicidan ismini, soyismini ve
        yasini alip asagidaki formatta yazdirin.
        girilen bilgiler : J Doe, 44*/
        //Tek bir istekle uc bilgiyi alabiliriz//
        //Ornegin
       Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi, soyIsminizi ve yasinizi giriniz" +
                "\nHer bilgiden sonra ENTER'a basiniz");
       char isimIlkHarf= scan.nextLine() .charAt(0);

       String soyIsim= scan.nextLine();
       double yas = scan.nextDouble();

        System.out.println("Girilen bilgiler : " + isimIlkHarf + " " + soyIsim + " , " + yas);




    }
}
