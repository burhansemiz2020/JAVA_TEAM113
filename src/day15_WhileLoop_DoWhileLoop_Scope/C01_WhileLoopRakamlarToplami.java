package day15_WhileLoop_DoWhileLoop_Scope;

import java.util.Scanner;

public class C01_WhileLoopRakamlarToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rakamlari toplanacak pozitif tamsayi giriniz: ");
        int girilenSayi = scan.nextInt();
        int toplam = 0;

        while (girilenSayi>0){
            toplam+=girilenSayi%10;
            girilenSayi/=10;

        }
        System.out.println("Girilen sayinin rakamlar toplami: " +toplam);




    }
}
