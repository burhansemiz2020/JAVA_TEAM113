package day08_NestedIf_TernaryOp;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        /*
        Kullanicidan cinsiyetini aliniz
        kadin icin 60 yas ve uzeri
        erkek icin 65 yas uzeri emekli
        olabilirsin. Veya emekli olmak
        icin su kadar yil daha calismalisin
        yazdiriniz
        Hatali giris yapilirsa kullaniciyi uyarin
        ********
        EGER DEGISKEN SAYIMIZ BIRDEN FAZLA ISE
        DEGISKENLERDEN BIRINI ONCELIGE ALARAK
        ONA GORE BIR IF ELSE YAPISI KURULUR
        ORNEGIN BU SORUDA YAS DEGISKENINI
        ANA DEGISKEN YAPALIM
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Yasinizi Giriniz");
        double yas= scan.nextDouble();

        System.out.println("Cinsiyetinizi Giriniz|n: Kadin=K veya k, Erkek=E veya e");
        char cinsiyet=scan.next().charAt(0);

        if (cinsiyet=='k' || cinsiyet=='K'){ // Kadin
            if (yas<16 || yas>80){
                System.out.println("Gecersiz yas girisi, lutfen tekrar deneyin");
            } else if (yas<60) {
                System.out.println("Emekli olmak icin daha " + (60-yas) + " yil daha calismalisin");
            } else{
                System.out.println("Emekli olabilirsin");
            }
        } else if (cinsiyet=='e' || cinsiyet=='E') { // Erkek
            if (yas<16 || yas>80){
                System.out.println("Gecersiz yas girisi, lutfen tekrar deneyin");
            } else if (yas<65) {
                System.out.println("Emekli olmak icin daha " + (65-yas) + " yil daha calismalisin");
            }else{
                System.out.println("Emekli olabilirsin");
            }
        }else {
            System.out.println("Gecersiz cinsiyet girisi, lutfen yeniden deneyin");
        }

    }
}
