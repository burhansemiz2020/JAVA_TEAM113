package day06_IfStatements;

import java.util.Scanner;

public class C02_IfStatementsQuestion2 {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan bir sayi isteyin,
        sayiyi kontrol edip 5 ile bolunebiliyorsa
        “Sayi 5’in tam kati” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi sayi giriniz");
        int sayi1 = scan.nextInt();

        if (sayi1%5==0) {
            System.out.println("Sayi 5'in tam kati");}
            if (sayi1 % 3 == 0) {
                System.out.println("3 Ile bolunebilen sayi");
            }
        }


    }

