package day17_Arrays_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class C08_KullanicidanDegerAlarakArrayOlustur {
    public static void main(String[] args) {
        /*
        Kullanicidan array olusturmak uzere
        pozitif sayilar alin.Kullaniciya islemi
        bitirmesi icin sifira basmasi gerektigini
        soyleyin.Bir onceki class tan metot kullanarak
        aldiginiz elementleri array e ekleyin.
         */
        Scanner scan=new Scanner(System.in);
        int girilenSayi=1;


        int[] arr=new int[0];
        while(girilenSayi!=0){
            System.out.println("Bir sayi giriniz: ");
            girilenSayi=scan.nextInt();

            if (girilenSayi!=0){
                arr=C07_ArrayeElemanEklemeMetodu.arrayeElementEkle(arr,girilenSayi);
            }



        }
        System.out.println(Arrays.toString(arr));
    }
}
