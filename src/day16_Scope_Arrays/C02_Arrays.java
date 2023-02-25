package day16_Scope_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C02_Arrays {
    public static void main(String[] args) {
        String[] isimler = {"Nurefsan", "Berke", "Mustafa"};
        int[] sayilar = {3, 4, 5, 6, 7, 3, 4, 5, 6, 7, 3, 4, 5, 6, 7};
        char karakterler[] = {'e', '4', ',', 'd'};//braces char dan sonra olmasi daha uygun

        /*
        Array ler non primitive data turlerindendir.
         */
        String[] arr = new String[5];//eger yukaridaki gibi array i bir listes
        // seklinde olusturmazsak new keyword kullaniyorsak UZUNLUGUNU
        //yazmak sorundayiz.
        /*
        Bir array i new keyword ile olusturuyorsak
        uzunlugunu yazmak zorundayiz
        NOT:::
        bir array tanimlanan uzunluktan daha fazla veya az
        eleman alamaz.
        Yukarida String int char da element sayisi yazilmasa da
        array burda toplam kac tane oldugunu varsaymistir
         */
        //Bir arrayi yazdirmak istersek:::
        System.out.println(isimler);//[Ljava.lang.String;@4dd8dc3
        System.out.println(Arrays.toString(isimler));//[Nurefsan, Berke, Mustafa]
        System.out.println(Arrays.toString(sayilar));//[3, 4, 5, 6, 7, 3, 4, 5, 6, 7, 3, 4, 5, 6, 7]
        System.out.println(Arrays.toString(arr));//[null, null, null, null, null]
        //deger atanmadigi icin default olarak null atadi
        int[] a= new int[7];
        System.out.println(Arrays.toString(a));//[0, 0, 0, 0, 0, 0, 0]
        //deger atanmayan int lere 0 atanir default olarak
        //eger a array inin birinci elementine deger atamak icin
        a[0]=4;
        a[3]=7;
        //a[7]=8;//.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
        //olmayan indexe deger atanmaz
        //a[-1]=8; burda da deger atanmaz

        System.out.println(Arrays.toString(a));
        //Arrays de silme diye bir sey yoktur.
        //ama atama yapip degisitirebiliriz
        //sayilar array inin 4. indexindeki elementi yazdirin

        System.out.println(sayilar[4]);//7 yazdirdi
        /*
        burda arrayi yazdirmiyoruz 4. elementini yazdiriyoruz
        7 yi yazdiririz cunku bir int
         */
        //isimler array inin 1. indexindeki ismi yazdirin
        System.out.println(isimler[1]);

    }
}
