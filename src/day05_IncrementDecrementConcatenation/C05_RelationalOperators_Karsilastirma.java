package day05_IncrementDecrementConcatenation;

import java.sql.SQLOutput;

public class C05_RelationalOperators_Karsilastirma {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        System.out.println(a==b);//false
        System.out.println(a==b-5);//true
        boolean c;
        System.out.println(c=15==b);//b 15 tir dogru
        c=15*a==10*b;//15*10=10*15 sonuc true
        System.out.println(c);
        //false
        //true
        //true
        //true
        System.out.println();
    }
}
