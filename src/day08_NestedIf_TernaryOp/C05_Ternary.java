package day08_NestedIf_TernaryOp;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {
        /*
        Kullanicidan bir tamsayi alip
        mutlak degerine cevirin yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tamsayi gir");
        int sayi= scan.nextInt();
        /*
        if (sayi>=0) System.out.println(sayi);

        else if(sayi==sayi*-1);
        System.out.println(sayi);
        */
        sayi=sayi>=0 ? sayi : sayi*-1;
        System.out.println(sayi);
    }
}
