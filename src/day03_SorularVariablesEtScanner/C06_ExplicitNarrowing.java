package day03_SorularVariablesEtScanner;

public class C06_ExplicitNarrowing {
    public static void main(String[] args) {
        double db1=45.32;

        int in1=(int) db1; //int<----double kabul etmiyor burda
                    //Ex.Narrowing yapariz
        System.out.println(in1);

        db1=39876543215852d; //buyuk sayi oldugu icin d yazdik
        in1=(int)db1;
        System.out.println(in1);

        in1=34;

        byte by1=(byte)in1; //short<-----int oldugu icin otomatik atma yapmaz
                        //
        System.out.println(by1);
        //byte-128 ile+127 arasi

        in1=130;

        by1=(byte)in1;

        System.out.println(by1);//sayi dogrusu ornegi defterde yazili

        //her 256 da sifirlanir
        //ve 256 nin katlarinda da sifirlanir


    }
}
