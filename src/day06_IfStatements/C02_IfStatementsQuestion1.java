package day06_IfStatements;

import java.util.Scanner;

public class C02_IfStatementsQuestion1 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir ucgenin
        3 kenar uzunlugunu alin, ucgen eskenar ise
        “Eskenar ucgen” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Ucgenin 3 kenar uzunlugunu giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        //if (kenar1==kenar2==kenar3)
        /*
        Java da bu sekilde uclu bir karsilastirma yoktur
        bunun yerine ikili karsilastirmalar yapip &&
        ile birlestirebiliriz
         */
        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0){
            System.out.println("Girilen kenarlar bir eskenar ucgen olusturur");
            /*
            0 dan ve eksi sayilardan kurtarmak icin
            kenar1>0 demeliyiz
             */
        }

    }
}
