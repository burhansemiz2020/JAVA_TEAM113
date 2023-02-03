package day02_dataTurleriVeScanner;

import java.util.Scanner;

public class C05_ScannerIlkGorev {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin
        //ve sayinin karesini alin
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double girilenSayi=scan.nextDouble();
        System.out.println("Girilen sayini karesi:"+girilenSayi*girilenSayi);
        //sayini karesini aldik



    }
}
