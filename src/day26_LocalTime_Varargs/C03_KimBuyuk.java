package day26_LocalTime_Varargs;

import java.time.LocalDate;
import java.util.Scanner;

public class C03_KimBuyuk {
    public static void main(String[] args) {
        /*
        Kullanicidan iki farkli kisinin isim ve dogum tarihini gun ay yilini alip
        hangi tarihte dogan kisinin daha buyuk oldugunu yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("1. Kisi: Isminizi giriniz");
        String isim1= scan.nextLine();
        System.out.println("2. Kisi: Isminizi giriniz");
        String isim2= scan.nextLine();

        System.out.println("1. Kisi: Dogum tarihini gun ay yil seklinde giriniz : ");
        int gun=scan.nextInt();
        int ay=scan.nextInt();
        int yil=scan.nextInt();
        LocalDate tarih1=LocalDate.of(yil,ay,gun);
        System.out.println("2. Kisi: Dogum tarihini gun ay yil seklinde giriniz : ");
        int gun2=scan.nextInt();
        int ay2=scan.nextInt();
        int yil2=scan.nextInt();
        LocalDate tarih2=LocalDate.of(yil,ay,gun);

        System.out.println(tarih2.isBefore(tarih1));

    }
}
