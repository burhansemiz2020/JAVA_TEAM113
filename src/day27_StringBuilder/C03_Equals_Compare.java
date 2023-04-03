package day27_StringBuilder;

public class C03_Equals_Compare {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        //System.out.println(sb1==str);
        //Java da farkli data turune sahip non primitive objeler == ile karsilastirilamazlar
        System.out.println(sb1==sb2);//false
        System.out.println(sb1==sb1);//true

        System.out.println(sb1.equals(sb2));//false

        /*
        Icerik ayni olsa bile StringBuilderda equals metodu false doner.
        Cunku stringBuilder classinda equals metodu yoktur. Equals metodunu
        parent classi olan Object class indan kullanir ve bundan dolayi
        iceriklere bakmadan reddeder. Kisaca stringbuilder da equals var ama
        ise yaramiyor.
         */
        System.out.println(sb1.equals(str));//false
        System.out.println(sb1.equals(sb1));//bu iki obje ayni deyip true verir

        /*
        Bu durumda iki string builder in iceriklerinin ayni oldugunu kontrol
        etmek icin campareTo metodu kullanilir.
         */
        System.out.println(sb1.compareTo(sb2));//0 verdi
        //System.out.println(sb1.compareTo(str));//cte
        StringBuilder sb3=new StringBuilder("Hava");
        StringBuilder sb4=new StringBuilder("Hara");

        System.out.println(sb1.compareTo(sb3));//2 Java ile Hava yi karsilastirdi J ve H harfler arasindaki mesafeyi olctu iki fark ciakrdi
        System.out.println(sb1.compareTo(sb4));//2 Java ile Hara yi karsilastirdi J ve H harfler arasindaki mesafeyi olctu iki fark cikardi
        System.out.println(sb3.compareTo(sb4));//4 Hava ile Hara yi karsilastirdi V ve R harfler arasindaki mesafeyi olctu dort fark cikardi
        /*
        CompareTo () karsilastirilan StringBuilder lar ayni metne sahipse 0 doner.
        Ayni degisle bastan itibaren kontrole baslar. Farkli olan ilk harfin
        karsilastirilan kelimedeki ayni index deki harften kac harf ileride oldugunu dondurur
         */


    }
}
