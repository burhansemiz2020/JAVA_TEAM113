package day33_Polymorphism;

public class BChild extends Aparent{

    @Override
    void method1() {
        super.method1();
        /*
        Burada super. olursa hem child class daki method1
        hem de super class daki method1 calisir
         */
    }
    void method2(){
        /*
        bir method override edildiginde
        child class da @Override notasyonu
        kullanilabilir
        kullanmak veya kullanmamak arsinda
        pratikte soyle bir sonuc olusur:
        eger notasyon kullanilirsa iki metot
        arasindaki iliski takip edilir.
        Parent class daki method silinirse
        notasyon CTE verir.

        Ama elle olusturdugumuz metot 2 override inin
        parent classtaki void method 2 sini silersek
        child classinda hata vermez. Notasyon yoksa
        parent classtaki silinse de CTE vermez
         */
    }
      Integer method3(){
        /*
        Overriden metot ile overriding metotun isimve signature lari
        ayni olmalidir. return type ve access modifier signature a
        dahil degildir. Ancak overridingde bunlarla ilgili de
        kurallar vardir.
        1. access modifier kurali:
            child parent'i kisitlayamaz.
            Yani default olan child daki Integer method3 public
            olan parenttaki method 3 u kisitlayamaz. ama parent daraltabilir

            Access modifier hiyerarsisi bu noktada onem tasiyor.
            Private
            default
            pretected
            public
        Eger overriden ve overriding metotlari private yaparsak bu iki metot
        bagimsiz private metotlar olarak calisir. aralarinda override islemi olmaz
        2. Return Type kurali
        return type primitive veya void ise ya da void ise iki metodun
        return type i AYNI OLMALIDIR.
        Yani child tarafi integer, parent tarafi short ya da long olmaz

        NON PRIMITIVE ise ya ayni olmali veya parent class daki return type
        child class daki return type in parent i olmalidir.
        Yani child classi String
        object herkesin babasi

        Non primitive lerde casting olmaz parent child iliskisi hic olmaz
         (Covariant data)
         */
        return 5;
    }
}

