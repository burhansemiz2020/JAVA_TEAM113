package day12_ForLoops;

import java.util.Scanner;

public class C03_ForLoopQuestion4 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif
        sayilar alin, sinirlar dahil olarak aralarindaki tum
         sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucuk olsa da program calissin
        */
        Scanner scan = new Scanner(System.in);

        System.out.println("Baslangic degerini tamsayi olarak giriniz");
        int bas = scan.nextInt();

        System.out.println("Bitis degerini tamsayi olarak giriniz");
        int bit = scan.nextInt();

        int sayiTop = 0;

        if (bas <= bit) {
            for (int i = bas; i >= bit; i--) {
                sayiTop += i;
            }

                System.out.println("Sayilarin Toplami: " + sayiTop);
            }
        }
    }