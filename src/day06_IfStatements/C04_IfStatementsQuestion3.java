package day06_IfStatements;

import java.util.Scanner;

public class C04_IfStatementsQuestion3 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan notunu alin
         50 veya daha buyukse ”Sinifi Gectin”,
         50’den kucukse “Maalesef kaldin” yazdirin.
         */
        /*
        If Statement da sart parantezinden sonra
        suslu parantez kullanmazsak Java ilk noktali
        virgul e kadar olan kismi if body olarak
        kabul eder
        If body bir satir ise sorun olmaz ama
        bir satirdan coksa ilk satirdan sonrasi
        her durumda calisir
        sonuc olarak tek satir ise if body sinin varkligi
        onemli degil ama birden fazla satir varsa
        mutlaka suslu parantez yani if body
        kullanilmalidir
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();
        if (not>=50) {
            System.out.println("sinifi Gectiniz");
        }
        if (not<50){
            System.out.println("Maalesef kaldiniz");
            }
        }
    }

