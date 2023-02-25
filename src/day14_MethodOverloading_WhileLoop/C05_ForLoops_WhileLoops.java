package day14_MethodOverloading_WhileLoop;

import java.util.Scanner;

public class C05_ForLoops_WhileLoops {
    public static void main(String[] args) {
        /*
        50 ve 100 arasindaki (sinirlar dahil)
        sayilari toplayin
         */
        int toplam=0;
        for (int i = 50; i <=100 ; i++) {
            toplam+=i;
        }
        System.out.println("Toplam : " +toplam);

        /*
        kullanicidan toplanmak uzere sayilar alin
        toplam 500 u asinca
        kac sayi girdigini
        ve sayilarin toplamini yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi giriniz");
        /*
        For loops ta 3 kademe var
        while loop ta da
        baslangic bitis artis/azalis
        Baslangic ve bitis degeri belli olan
        veya kac kere tekrar edilecegi bilinen
        loop larda for loop kullaniyoruz ideal
        olan bu. Ancak tekrar sayisi belli olmayan
        baslangic veya bitisi baska bir variable a
        bagli olan durumlarda for loop yerine
        while loop tercih edilir
         */
        //ayni soruyu while loop la yapalim
        //for loopta 3 seyi takip ederiz
        /*
        1. baslangic degeri
        2. bitis sarti
        3. artis/azalis miktari
         bu while loopta otomatik olmuyor
         */
        toplam=0;
        int sayi=50;

        while (sayi<=100){
            toplam+=sayi;
            sayi++;

        }
        System.out.println("while ile toplam: " +toplam);

    }
}
