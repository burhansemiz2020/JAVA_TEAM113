package day04_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C02_asciiTableSorusu {
    public static void main(String[] args) {
        //Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char girilenHarf= scan.next().charAt(0);
        System.out.println("Girilen harf : " + girilenHarf +
                "\nGirilen harften sonraki 3 harf : " +
                (char) (girilenHarf+1)   + ", " +
                (char) (girilenHarf+2)   + ", " +
                (char) (girilenHarf+3)   );

































    }
}
