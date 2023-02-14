package day08_NestedIf_TernaryOp;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {
        /*
        kullanicidan bir sayi alin
        sayi cift ise "sayi cift"
        degilse
        "sayi tek"
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int input= scan.nextInt();
        //if else ile yapalim
        if (input%2==0) System.out.println("cift sayi");
        else System.out.println("tek sayi");

        //ternary ile yaparsak

        System.out.println(input%2==0 ? "cift sayi" : "tek sayi");

        /*
        TERNARY I OZELLIKLE SIMPLE OPERATION LARDA USAGE EDERSEK PLUS EFFICACE OLUR
         */
    }
}
