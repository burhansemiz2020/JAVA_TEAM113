package day05_IncrementDecrementConcatenation;

public class C01_IncrementDecrement {
    public static void main(String[] args) {
        int a = 20;

        //a'nin degerini 3 artirin
        //ve yeni degerini olusturacaginiz
        //b variable ina atayin

        //a=a+3;
        //a+=3;
        /*a++;
        a++;
        a++;*/
        a += 3;
        int b=a;
        System.out.println("a : " + a + ", b:" +b);

        //a nin degerini b ye atayin sonra a nin degerini 3 arttirin

        a=20;
        b=a;
        a+=3;
        System.out.println("a : " + a + ", b:" +b);//cift tirnak icinde olanlar
                                                // aciklama cift tirnak icinde olmayanlar
                                                //variable dir.

        a=20;
        // a nin degrini yazdirin ve sonra a yi bes arttirin
        System.out.println("a: " + a);
        a+=5;
        a=20;
        //a nin degerini 2 azaltin sonra a nin degerini yazdirin
        a-=2;
        System.out.println("a: " +a);



    }
}
