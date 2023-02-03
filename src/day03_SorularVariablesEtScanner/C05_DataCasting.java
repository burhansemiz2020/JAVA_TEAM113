package day03_SorularVariablesEtScanner;

public class C05_DataCasting {
    public static void main(String[] args) {
        boolean bl= false;
        bl=true;

        //bl="true"; olmaz tirnak string ister
        //bl ye char ya da sayi degeri atayamayiz

        char ch='t';
        ch='%';
        ch=' ';
        ch=99; //tirnak olmada kabul etti neden?

        int sayi1=20;
        short sayi2=15;
        double sayi3=24;

        sayi1=sayi2; // int<----short
                    // burda ben senden int istiyorum sen bana
                    // short veriyorsun kabul etmiyorum demedi
        //sayi1=sayi3; int <---- double
        // bunu kabul etmedi
        //sayi2=sayi3; yine kabul etmedi
        //sayi2=sayi1; short<----int
        sayi2=(short)sayi3; //short<----double
        sayi3=sayi1;//double<----int
                    // kabul
        sayi3=sayi2;//double<----short
                    // kabul

        /* Bazi primitive data turleri
        baska hicbir data turunden deger
        kabul etmezler> Bazi primitive
        data turleri ozel sartlar ile
        baska turdeki datalari deger
        olarak kabul eder
         */
        sayi1=ch;
        //sayi2=ch; kabul etmedi
        sayi3=ch;


    }
}
