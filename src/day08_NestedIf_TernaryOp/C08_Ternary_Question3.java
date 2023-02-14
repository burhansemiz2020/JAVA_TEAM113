package day08_NestedIf_TernaryOp;

import java.util.Scanner;

public class C08_Ternary_Question3 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan bir harf isteyin,
        girilen karakter kucuk harf ise onu buyuk
        harf olarak yazdirin, yoksa girilen harfi yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir harf girin");
        char harf=scan.next().charAt(0);
        System.out.println(harf>='a' && harf<='z' ?
                Character.toUpperCase(harf)
                : harf);

        //Bu soruyu ascii table dan da yap
    }
}
