package day05_IncrementDecrementConcatenation;

public class C02_Preincrement_PostIncrement2 {
    public static void main(String[] args) {
        int a=10;
        System.out.println("a'nin degeri:"+ ++a);//11
        int b=a++;//once a nin degerini b ye ata sonra a nin degerini bir arttir
        System.out.println("b nin degeri:" +b);//11
        int c= b++ + a;//once atama sonra arttirma//b=12 a=11 c=23
        System.out.println("c nin degeri:"+c);
        System.out.println("son toplam: "+(a+b+c));//a=11 b=13 c=23
        /*
        a'nin degeri:11
        b nin degeri:11+2
        c nin degeri:23
        son toplam: 47
         */
    }
}
