package day14_MethodOverloading_WhileLoop;

import java.util.Scanner;

public class C01_AsalSayiYazdir {
    public static void main(String[] args) {
        /*
        Verilen pozitif bir tamsayinin
        asal sayi olup olmadigini yaz
        diran bir metot olusturun
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz: ");
        int sayi=scan.nextInt();
        asalMiYazdir(sayi);
        /*
        Once public static
        sonra ne yapacagimiza bakiyoruz
        void diyoruz
        verilen sayi bir sayiya
        bolunemez
         */

    }
    public static void asalMiYazdir(int sayi){
        int flag=0;
        for (int i = 2; i < sayi ; i++) {
            if (sayi%i==0){
                flag++;
                break;
            }

        }
        if (sayi==2){
            System.out.println("Girilen 2 sayisi asal bir sayidir");
        }
        else if (flag==0){
            System.out.println("Girilen " + sayi + " sayisi asal bir sayidir.");
        }else {
            System.out.println("Girilen " + sayi + " sayisi asal bir sayi degildir.");
        }

    }
}
