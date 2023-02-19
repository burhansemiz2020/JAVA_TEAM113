package day11_StringManipulations_ForLoop;

public class C02_nullPointer {
    public static void main(String[] args) {

        /*
        null bir deger degildir
        null bir pointer dir.
        Ne ise yarar: yanina yazildigi
        null primitive variable a
        deger atanmadigini isaret eder

         */
        String str;//burada str olusturuldu ama deger atamasi yapimadi
        /*
        java deger atamadan variable olusturulmasina
        izin verir
        ama atamadan kullanilmasina izin vermez
        */

        //System.out.println(str);//Variable 'str' might not have been initialized
        //deger atanmamis olabilir diyor

        //str.concat("Java");//Variable 'str' might not have been initialized
        //ama bazen degeri sonradan atanamak uzere variable yapabiliriz

        //ornegin 20 kisilik bir sinifin bir kismina deger atamayiz
        //ama gormek isteriz. mesela bir okul uygulamasi
        //olusturulmus ama deger atanmamislari listelemek istedigimizde
        //null olarak isaretleyebiliriz
        /*
        bazen programlarda variable lar olusturulur.
        ama daha sonra deger atanacagi icin deger atamasi
        yapilmaz.Deger atamasi yapilmadan listeleme bile
        olmadigi icin CTE verir
        bunun icin deger verilmedigini isaretleyecek ama
        CTE olusmasini engelleyecek bir cozum olarak
        "null pointer" olusturulmustur.
         */
        str=null;
        //burda cift tirnak icerisinde degil
        //str="null" degil esitiligin saginda bir deger yok
        //bu sadece null pointerdir
        //degeri null dir demeyiz
        System.out.println(str);
        //System.out.println(str.concat("Java"));
        /*
        Exception in thread "main" java.lang.NullPointerException:
        Cannot invoke "String.concat(String)" because "str" is null
	    at day11_StringManipulations_ForLoop.C02_nullPointer.main(C02_nullPointer.java:46)
         */
        //System.out.println(str.length());
        /*
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.concat(String)" because "str" is null
	at day11_StringManipulations_ForLoop.C02_nullPointer.main(C02_nullPointer.java:46)

	sonuc olarak str i null yazdirip
        */
        System.out.println(str + "Java");
        String str2= str + "Java";
        System.out.println("str2 : " + str2);
        /*
        her ne kadar bu ornekte null ile beraber yazdiriyor gorunse de
        null deger degildir
         */
        //int sayi=null; kabul etmez

        //Integer sayi=null; //kabul eder Integer wrapper di
        /*
        Biz genelde null ile ugrasmayiz
        string bir ifade olusturup bir deger atayacaksak hiclik degeri atariz
         */
        String str3="";
        //seklinde deriz burda bir deger vardir hiclik degeridir
        System.out.println(str3.concat("Java"));

        //System.out.println(str.isEmpty());//null olarak isaretlenmis bir string
        //hic bir sekilde kullanilamaz sadece yazdirilabilir ya da + ile toplama seklinde
        //kullanilabilir.
        //null pointer biraz developper larin isi
        System.out.println(str3.isEmpty());//true verir
    }
}
