package day21_ArrayList_ForEach;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};
        /*
        - arrayin tum elementlerinin toplamini yazdirin
        - arrayin elementlerinden 3 ile bolunebilenleri yazdirin
        - arrayin elementleri icinde kac tane tek sayi oldgunu bulun

        burada index siralamasi uzerinden bir islem istemedigi icin
        for each metodu kullanisli bir yontem olabilir.
        Bizden istenen gorevde siralama onemsiz ise asil amaclanan
        tum elementleri elden gecirmek ise for loop yerine for eachloop
        tercih edilir. For each loopta
        - index yoktur
        - baslangic degeri yoktur
        - bitis degeri yoktur
        burda for each arr e git her bir int i bana getir diyecek
         */
        int toplam=0;
        for (int each:arr) {
            toplam+=each;

        }
        System.out.println("Elementler toplami: "+toplam);//Elementler toplami: 72

        //arrayin elementlerinden 3 ile bolunebilenleri yazdirin

        for (int each : arr) {
            if (each%3==0) {  System.out.println(each + " ");}
        }
      //Elementler bolumu: 3



        // arrayin elementleri icinde kac tane tek sayi oldgunu bulun
        int sayac=0;
        for (int each : arr) {
            if(each%2!=0) sayac++;

        }
        System.out.println("Tek sayi adedi: "+sayac );//Elementler tek sayi: 12


            }
        }


