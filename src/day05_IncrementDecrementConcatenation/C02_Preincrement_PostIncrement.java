package day05_IncrementDecrementConcatenation;

public class C02_Preincrement_PostIncrement {
    public static void main(String[] args) {

        /*
        eger sayinin degeri sadece bir artacak ya da azalacaksa;
        arttirip sonra yazdirma/atama
        atayip/yazdirip sonra arttirma

        islemlerini tek satirda yapabiliriz.

         */


       //a nin degerini 1 arttirin
        int a = 20;
        int b =++a;//once arttirir sonra atama yapar
        /*
        a++;

        int b = a;
        */

        System.out.println("a : " + a + ", b:" +b);
        //a nin degerini b ye atayin sonra a nin degerini bir arttirin

       a=20;
       b=a++;//bu ise once atama yapar sonra arttirir.
        //hangisinin once olacagina artinin durumundan anliyoruz

        System.out.println("a : " + a + ", b:" +b);

        //java bu isi daha pratik yapmanin bir yolunu gosteriyor
        //istersek tek satirda yapabniliriz

        //a nin degerini yazdirip bir arttirin
        a=20;
        System.out.println("a :"+a);
        a++;

        a=20;
        System.out.println("a :" + a++);
        System.out.println("bir sonraki satirda a:"+a);

        a=20;
        System.out.println(--a);
        System.out.println("bir sonraki satirda a:"+a);

        int sayi=10;
        System.out.println(sayi++);
        System.out.println(sayi);

        int num=20;
        System.out.println(++num);
        System.out.println(num);

        System.out.println();

        int x=10;
        int y=x++;
        System.out.println(x);
        System.out.println(y);

        System.out.println();

        int num1=100;
        int num2=++num1;

        System.out.println(num1); //101
        System.out.println(num2); //101
        //eger ++ num1 den sonra olsaydi 101 ve 100 olacakti

        int xx=30;
        int yy=xx++;

        System.out.println();

        System.out.println(xx);//31
        System.out.println(yy);//30





    }
}
