package day03_SorularVariablesEtScanner;

import java.util.Scanner;

public class C01_SorularVariablesEtScanner {
    public static void main(String[] args) {
        //Soru3-Kullanicidan isim soyisim yas vs
        // almak icin scanner olusturmak gerekir
        //Isminiz:
        //Soyisminiz:
        //Yasiniz:
        //Kaydiniz basariyla tamamlanmistir.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi griniz");

        String isim=scan.nextLine();

        System.out.println("Lutfen soyisiminizi yaziniz");

        String soyisim=scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        double yas=scan.nextDouble();

        /*System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir");*/

        //Kullanici istedigimiz data tururunde bilgi girisi yapmazda
        //kodumuz da hata olur ve calisma duru
        //Ileride kullanici hatalarina karsi nasil tedbirler alacagimizi ogrenecegiz
        //Simdilik kullanici bizden ne istiryorsa onu yapalim

        /*System.out.print("Isminiz : " + isim);
        System.out.print("Soyisminiz : " + soyisim);
        System.out.print("Yasiniz : " + yas);
        System.out.print("Kaydiniz basariyla tamamlanmistir");*/

        //sout daki ln yi yazmassak sonuc kisminda her sey yan yana yazilir

        System.out.println("Isminiz : " + isim +
                           "\nSoyisminiz : " + soyisim +
                           "\nYasiniz : " + yas +
                           "\nKaydiniz basariyla tamamlanmistir");
        //Bu sekilde de sonuclar yan yana cikti


        //tek bir sout ta birden fazla satir
        // yazdiramazmiyiz son kisimda yazdirabiliriz
        //String bir ifadenin icinde istedigimiz yere \n yazabiliriz
        //sonuc olrak string bir ifadenin icinde \n yapmaliyiz
        //nextLine ile next i bir arada kullanmamak gerekir hata verebilir

    }
}
