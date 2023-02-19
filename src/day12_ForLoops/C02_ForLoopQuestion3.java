package day12_ForLoops;

import java.util.Scanner;

public class C02_ForLoopQuestion3 {
    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bas sayiyi girin");
        int bas = scan.nextInt();
        System.out.println("bit sayiyi girin");
        int bit = scan.nextInt();

        int sayiToplam=0;
        /*
        yaptigimiz islem sayi alip sayi toplamina eklemek
         */
        if (bit<bas){
            System.out.println("Baslangic Degeri Bitis Degerinden Kucuk Olmalidir");
        }else{
            for (int i = bas; i<= bit; i++){
                sayiToplam += i; //sayiToplam=sayiToplam + i
            }
        }
        System.out.println("Sayilarin Toplami: " + sayiToplam);
        /*
        Ornek
        bas sayiyi girin
1000
bit sayiyi girin
10000000
Sayilarin Toplami: -2004759532

Process finished with exit code 0
burada int in sonuna gitti geri dondu
         */



    }
}
