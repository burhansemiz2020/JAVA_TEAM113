package day14_MethodOverloading_WhileLoop;

import java.util.Scanner;

public class C07_WhileLoops {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre isteyin
        asagidaki sartlari saglayana kadar
        her seferinde hatalari soyleyip
        yeni sifre isteyin, sartlari
        saglayan sifre oldugunda
        5. denemenizde basarili sifre olusturuldu
        seklinde aciklama yazin
        SARTLAR
        - ilk harf kucuk harf olmali
        - son harf buyuk harf olmali
        - bosluk icermemeli ve
        -8 karakter veya daha uzun olmali
         */
        Scanner scan = new Scanner(System.in);
        String sifre = "";
        int flag = 0;
        int denemeSayisi = 0;
        while (flag != 4) {
            flag = 0;
            //ilk harf kucuk olmali
            System.out.print("Sartlara uygun bir sifre giriniz : ");
            sifre = scan.nextLine();

            if (sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z') {//Bu ilk harf kucuk harf sarti
                flag++;

            } else {
                System.out.println("Ilk karakter kucuk harf olmali");
            }
            //son harf buyuk harf olmali
            if (sifre.charAt(sifre.length() - 1) >= 'A' && sifre.charAt(sifre.length() - 1) <= 'Z') {
                flag++;
            } else {
                System.out.println("Son harf buyuk harf olmali");
            }
            //bosluk icermemeli
            if (sifre.contains(" ")) {
                System.out.println("sifre bosluk icermemeli");
            } else {
                flag++;
            }
            //8 karakter veya daha fazla olmali
            if (sifre.length() >= 8) {
                        flag++;
        }else {
                System.out.println("Uzunluk en az 8 karakter olmali");

        }
            denemeSayisi++;//deneme sayisini unutmamak gerekiyor
        }
        System.out.println("Tebrikler! " +denemeSayisi+ ". denemede sifreniz basari ile kaydedildi" );
        /*
        curly braces lara cok dikkat et bunu anlamak icin ustteki
        baslangic curly braces in uzerine gelip asagidaki
        yerini gormek gerekiyor
         */
    }


    }



