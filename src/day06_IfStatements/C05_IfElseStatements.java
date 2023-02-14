package day06_IfStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        /*
        EGER BIR OLAY ICIN SADECE IKI OLASILIK VARSA
        VE BU OLASILIKLARDAN BIRISI MUTLAKA CALISCAKSA
        O ZAMAN IF ELSE STATEMENTS KULLANILIR
         */
        /*
        Soru 5- Kullanicidan notunu alin
         50 veya daha buyukse ”Sinifi Gectin”,
         50’den kucukse “Maalesef kaldin” yazdirin.
         */
        /*
        ya evet ya hayir dir
        Soru6- Kullanicidan pozitif bir tamsayi
        alin sayinin tek veya cift sayi oldugunu
        yazdirin.

         */
        /*
        Kullanicidan poztif bir tamsayi alin
        5 ile bolunup bolunmedigini yazdirin
         */
        //Yukaridaki orneklerde iki ihtimal vardir
        //ya EVET Ya HAYIR

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();
        if (not>=50) {
            System.out.println("sinifi Gectiniz");
        }
        else {
            System.out.println("Maalesef kaldiniz");
        }
        //ONCE SORUYU OKUYORUZ VE NOTUN 50 DEN YA BUYUK
        //YA DA KUCUK OLDUGU SEKLINDE IKI IHTIMAL
        //OLDUGUNU GORUYORUZ. SONRA IF ELSE STATEMENTS
        //YAPIYORUZ

         /*
        ya evet ya hayir dir
        Soru6- Kullanicidan pozitif bir tamsayi
        alin sayinin tek veya cift sayi oldugunu
        yazdirin.

          */
        System.out.println("pozitif bir tamsayi giriniz");
        int num= scan.nextInt();
        if (num%2==0){
            System.out.println("girilen sayi cift sayi");
                    }
        else{
            System.out.println("girilen sayi tek sayi");
        }
        /*
        Kullanicidan poztif bir tamsayi alin
        5 ile bolunup bolunmedigini yazdirin
         */
        if (num%5==0){
            System.out.println("bese bolunur");
        }
        else{
            System.out.println("bese bolunmez");
        }
        /*
        if-else statement ta if body si veya else body si mutlaka
        calisir ama mutlaka birisi calisacak. yani ikisi birden calismaz
        ama mutlaka biri calisir
        bir kosul iki sonuc
         */
        /*
        Basit if cumleleri kodun geri kalani ile
        ilgilenmiyordu. Sorularda sartin saglanmasi
        veya saglanmamasi durumunda yapilacaklar belli
        ise basit if cumlesi yeterli olmayacaktir.
         */

    }
}
