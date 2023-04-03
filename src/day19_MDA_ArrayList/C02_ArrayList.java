package day19_MDA_ArrayList;

import day17_Arrays_Questions.C06_ArrayeElemenEkleme;
import day17_Arrays_Questions.C07_ArrayeElemanEklemeMetodu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {
        /*
        arraylist uzunlugu esnek bir listedir
        array altyapisini kullanir. Ancak ekleme
        ve silme gibi islemlerde daha avantajlidir.
         */
        int[] arr={3,4};
        arr= C07_ArrayeElemanEklemeMetodu.arrayeElementEkle(arr, 5);
        System.out.println(Arrays.toString(arr));
        arr=C07_ArrayeElemanEklemeMetodu.arrayeElementEkle(arr, 2);
        System.out.println(Arrays.toString(arr));

        List<String> harfler=new ArrayList<>();
        System.out.println(harfler);//konsolda bos bir list olusturur.
        harfler.add("s");
        harfler.add("l");
        harfler.add("a");
    }
}
