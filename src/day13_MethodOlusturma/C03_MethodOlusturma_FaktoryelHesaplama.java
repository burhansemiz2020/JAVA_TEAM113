package day13_MethodOlusturma;


public class C03_MethodOlusturma_FaktoryelHesaplama {
    public static void main(String[] args) {
        /*
        verdigimiz bir sayinin faktoryelini hesaplayip
        sonucu bize donduren bir method olusturun
         */

        int sonuc= faktoryelHesapla(5);
        System.out.println(sonuc);
                /*
                method olusturma asamalari
                1- public static standart
                2- olusturdugumuz method
                bize bir asonuc dondurecekse
                dondurecegi sonucun data turunu
                yaziyoruz
                3-method ismi
                4-method parantezi () icine
                methoda gondermemiz gereken
                bilgileri hangi variable ile
                gonderecegimizi yazalim
                Buna parametre deniz asagidaki int sayi
                5- dondurulmesi istenen islemi yap
                6- return keyword kullanarak dondurulmesi
                istenen degeri dondur.
                 */

    }
    public static int faktoryelHesapla(int sayi){
        //sayi 5 ise
        int faktoryel=1;
        for (int i = sayi; i >= 1; i--) {
            faktoryel*=i;

        }
        return faktoryel;

    }
}
