package day08_NestedIf_TernaryOp;

import java.util.Scanner;

public class C09_Ternary_Question5 {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayi giriniz");

        int a= scan.nextInt();
        int b= scan.nextInt();

        System.out.println(a>b ? b : a);
    }
}
