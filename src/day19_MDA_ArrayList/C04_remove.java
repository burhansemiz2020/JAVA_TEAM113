package day19_MDA_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String>harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("K");
        System.out.println(harfler);//[A,B,K]

        System.out.println(harfler.remove("B"));//true
        System.out.println(harfler);//[A,K]

        System.out.println(harfler.remove(0));//A
        System.out.println(harfler);//[K]

        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(18);
        sayilar.add(2);
        System.out.println(sayilar);//[1, 3, 18, 2]
        /*
        Eger sadece sayilardan olusan bir list varsa
        remove metoduna yazacagimiz sayiyi index olarak
        kabul eder.

        Eger sayiyi silmek isterseniz
        remove metodundan once o sayiyi
        bir objeye atayip, remove metodunda
        obje ismini yazabiliriz.
         */
        sayilar.remove(1);
        System.out.println(sayilar);//[1, 18, 2]
        //1 i sil
        Integer silinecekSayi=1;
        sayilar.remove(silinecekSayi);
        System.out.println(sayilar);
    }
}
