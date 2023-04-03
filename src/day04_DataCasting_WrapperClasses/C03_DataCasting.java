package day04_dataCasting_WrapperClasses;

public class C03_DataCasting {
    public static void main(String[] args) {
        int a=20;
        int b=6;

        System.out.println(a/b);
        //Java bolunen iki tamsayi ise sonnucun da tamsayi kismini verir

        double c=6;
        System.out.println(a/c);
        //double ile int arasindaki fark nedir?
        //bolunen sayilarin data turleri farkli ise sonucu
        //daha genis olanin cinsinden verir
        //int/double java sonucu double olarak verir
        float d=6f;
        System.out.println(a/d);// virgulden sonra 3.3333333 verdi cunku bu
                                // float yediye kadar
        //a/b isleminin sonucunu ondalikli olarak nasil yazdirabiliriz?

        System.out.println ((double) (a/b) );
        //java once parantez icini yapar
        //sonucu 3 bulur. Sonra double oldugundan
        //3'u double a cast eder.
        System.out.println((double) a/b);
        System.out.println(a/(double)b);
        //java icin parantez icin oncelikli
        //burada double parantez icine alininca
        //3.33333... sonucunu verdi ancak
        //yukarida parantez icinde a/b vardi double
        //disaridaydi bu nedenle 3.0 sonucunu verdi
        //yani matematikteki islem onceligi konusu

        //SORU:
        int e=1467;
        System.out.println(e=e/10);//146
        System.out.println(e);//146

        e=e/10;
        System.out.println(e);//14

        e=e/10;
        System.out.println(e);//1

        e=e/10;
        System.out.println(e);//0
    }
}
