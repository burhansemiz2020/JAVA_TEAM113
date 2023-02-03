package day05_IncrementDecrementConcatenation;

public class C02_Preincrement_PostIncrement2 {
    public static void main(String[] args) {
        int a=10;
        System.out.println("a'nin degeri:"+ ++a);
        int b=a++;//once a nin degerini b ye ata sonra a nin degerini bir arttir
        System.out.println("b nin degeri:" +b);
        int c= b++ + a;//once atama sonra arttirma
        System.out.println("c nin degeri:"+c);
        System.out.println("son toplam: "+(a+b+c));
        /*
        a'nin degeri:11
        b nin degeri:11
        c nin degeri:23
        son toplam: 47
         */
    }
}
