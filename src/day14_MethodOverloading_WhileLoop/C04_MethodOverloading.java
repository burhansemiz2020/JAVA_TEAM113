package day14_MethodOverloading_WhileLoop;

public class C04_MethodOverloading {
    /*
       Java overloading kurallari
       1. isim ve parametreleri ayni olan birden fazla metot
       olusturulamaz.
       2. data turleri farkli olan parametrelerin yerlerini
       degistirirsek java yeni bir metot olarak kabul eder.
       (int double) yerine (double int) izin verir.
       Overloading olan class larda Java hangi metodun
       calistirilacagina su sekilde karar verir:
       1. cagrilan isisimde metot var mi?
       2. metot call da kullanilan arguments ile metotlardaki
       parametrelerin %100 uyumlu oldugu var mi?
       3. argument ile parametre ayni olmasa bile verilen
       argumentleri kabul edecek parametre var mi?
        //mesela bunu kabul etmez: topla("ali", "veli");
        4. casting ile birden fazla metodu kullanilabiliyorsa
        daha az casting ile calisacak metodu kullanir.
        */

    public static void main(String[] args) {
        topla(3,5);
        topla(3.4, 2.3);
        topla('a', 'b');// illa char olmasina gerek yok
        //bunlari kabul edebilecek var mi diye sordu
        //char variabler lar ascii tablosuna gore
        //int gibi davranirlardi
        topla(3f, 4f);//burda iki double olan overloading calisir
        //burda da float yok ama int parametresei bunu kabul etti.
        //Yani illa ki ayni degerden olmasi sart degil fakat o degeri
        //donusturebilecek bir deger olursa yazdirir
        topla(3f, 4);//itiraz etmiyor ama bunu double int olarak topluyor
    }
    public static void topla(int a, int b){
        System.out.println("iki tamsayinin toplami:  " + (a+b));
    }
    public static void topla(double a, double b){
        System.out.println("iki double sayinin toplami:  " + (a+b));
    }
    /*public static void topla(int sayi1, int sayi2){}
    bunu yaparsak yukarda da burda da hata verir
     */
    public static void topla(int sayi1, double sayi2){
        System.out.println("int ve double sayilarin toplami: " +(sayi1+sayi2));
    }
    public static void topla(double sayi1, int sayi2) {
        System.out.println("double ve int sayilarin toplami : " +(sayi1+sayi2));
        /*
        signature lar topla double double
        seklinde dizilir
         */

    }
}
