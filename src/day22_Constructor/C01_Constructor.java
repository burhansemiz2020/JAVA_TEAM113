package day22_Constructor;

import day21_ArrayList_ForEach.C04_kareleriToplami;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_Constructor {
    public static void main(String[] args) {
        /*
        ==Bir obje ancak bir classtan olusturulabilir
        ==Bir objeyi olusturdugumuz class ayni zamanda
        o objenin data turudur.
        ==Her obje olusturuldugu classin ozelliklerini
        tasir.
        ==Eger bir programda ortak ozelliklere sahip
        objeler uretmek uzere tasarladiginiz
        bir class varsa main metot olmasi sart degildir.
        Bu class lar kaliphane gibi calisir.
        O classtan ayni ozelliklere sahip objeler uretmemizi saglar



         */
        Scanner scan = new Scanner(System.in);//scan objesinin data turu scanner dir non primitive
        List<String> isimler = new ArrayList<>();//burdaki ise List//ArrayList<>(); bu kismin adi constructor dir.
        C04_kareleriToplami obje=new C04_kareleriToplami();
        Random rnd=new Random();
        String str=new String("Ali");
        C02_Hemsire hemsire1=new C02_Hemsire();
        System.out.println(hemsire1.mesaiUcretiHesapla(5));
        /*
        Constructor obje uretmemize yarayan bir yapidir. Bazilari buna ozel bir metot diyebilir.
        Class variable metot degildir. kendine munhasir bir yapidir.
        Java da bir objenin sekillenmesi icin mutlaka constructor
        calistirilmalidir.
         */
        //ANCAK
        String str2;
        Random rnd2;
        List<String> harfler;
        //bu durumda obje olusturulur. referans olusturulur ama objenin kendisi
        //olusturulmaz. olusmasi icin constructorin calismasi ve varolan degerleri atamasi gerekir.

    }
    }
