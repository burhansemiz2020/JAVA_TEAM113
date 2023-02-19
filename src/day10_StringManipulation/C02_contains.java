package day10_StringManipulation;

public class C02_contains {
    public static void main(String[] args) {

        String str="Java ogren isi kap";
        System.out.println(str.contains("Java"));//true cevabini verir
        /*
        contains methodu ozellikle testlerde
        cok sik kullandigimiz bir methoddur
         */
        String s="ka";
        System.out.println(str.contains(s));//true cevabini verir

        System.out.println(str.contains("a"));//true cevabini verir

        System.out.println(str.contains(" "));//cumlede bosluk var true

        System.out.println(str.contains(""));//her bir harfin ya da
                                            // karakterin arasinda hiclik var true

        System.out.println(str.contains("java"));//ilk harfi buyuk Java var false
        /*
        ignoreCase burada yok o nedenle
        buyuk kucuk duyarliligi vardir

        contains te sayi bakmiyoruz var ya da yok
         */

    }
}
