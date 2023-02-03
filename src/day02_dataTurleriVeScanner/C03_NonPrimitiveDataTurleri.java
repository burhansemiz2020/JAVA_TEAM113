package day02_dataTurleriVeScanner;

public class C03_NonPrimitiveDataTurleri {
    public static void main(String[] args) {
        String isim="Ali Can";
        String ilkHarf="K";/*istesek char yapabilirdik ama
                            stringin ozelliklerini kullanmak
                            istedik. tek karakter atayacaksak
                            ikisini de kullanabiliriz/*/
        System.out.println(ilkHarf.toLowerCase());//bu ozellikle K kucuk olarak yazildi
        /*non primitive data turlerindeki variablarin
        hem deger hem de metotlari olur
        bircok ozellike ulasabiliriz
         */
        String metin="asfasfnasdkjfsdkajfhdskljfhaklfasfasfnasdkjfsdkajfhdskljfhaklf" +
                "asfasfnasdkjfsdkajfhdskljfhaklfasfasfnasdkjfsdkajfhdskljfhaklf" +
                "asfasfnasdkjfsdkajfhdskljfhaklfasfasfnasdkjfsdkajfhdskljfhaklf" +
                "asfasfnasdkjfsdkajfhdskljfhaklfasfasfnasdkjfsdkajfhdskljfhaklf" +
                "asfasfnasdkjfsdkajfhdskljfhaklfasfasfnasdkjfsdkajfhdskljfhaklf" +
                "asfasfnasdkjfsdkajfhdskljfhaklfasfasfnasdkjfsdkajfhdskljfhaklf" ;
        System.out.println(metin);/*NPDT siniri olmadigi icin
        hafizada net bir yer kaplar diyemeyiz*/

        System.out.println();

        String not="not";
        String Not="Variable isimlerinin " +
                "Buyuk harf ile baslamak tavsiye " +
                "edilmez ama java kabul eder";
        String nOT="Bir kere deklare edilen variable tekrar deklare edilemez" +
                "ama isimler farkli sekilde yazildigi icin Java " +
                "bunlari farkli variable olarak kabul eder";
        /*Variale isimlerinde $ # gibi semboller
        kullanilabilie ama tavsiye edilmez
         */

        /* Java da short int byte gibi
        keyword leri variable olarak kabul etmez
         */
        /*Java da camelCase yazim tarzi vardir
        ilk kelimenin ilk harfi kucuk diger kelimlelerim
        ilk harfleri buyuk
         */


    }
}
