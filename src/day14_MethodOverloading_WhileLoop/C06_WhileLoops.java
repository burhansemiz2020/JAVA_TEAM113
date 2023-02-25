package day14_MethodOverloading_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoops {
    public static void main(String[] args) {
         /*
        kullanicidan toplanmak uzere sayilar alin
        toplam 500 u asinca
        kac sayi girdigini
        ve sayilarin toplamini yazdirin
         */
        Scanner scan = new Scanner(System.in);//loop un icinde olusturmak iyi degil

        //bu soruyu for loop la yapamayiz
        int sayi = 0;//girilecek sayi veriable i
        int toplam = 0;//toplam larin cikacagi variable
        int girilenSayiAdedi = 0;
        while (toplam < 500) {//toplam 500 den kucuk oldugu surece bu islemi yap demektir
            System.out.println("Toplanmak uzere tamsayilar giriniz");//burasi loop ta olusturulmali
            sayi=scan.nextInt();
            toplam+=sayi;
            girilenSayiAdedi++;
        }
        System.out.println("Girilen sayi adedi: " + girilenSayiAdedi+ "\nGirdiginiz Sayilarin toplami: " + toplam);

    }
}
