package day24_StaticKeyword_StaticBlocks;

public class C02_PassByValue {
    public static void main(String[] args) {

        double fiyat = 200;
        /*
        int fiyat = 500;
        Java ayni metot icerisinde ayni isimde birden fazla variable
        olusturulmasina izin vermez.
         */

        indirimYap10(fiyat);
        System.out.println("1. method call'dan sonra fiyat : " + fiyat);
        indirimYap25(fiyat);
        System.out.println("2. method call'dan sonra fiyat : " + fiyat);
        System.out.println("Return yapilan methoddan donen fiyat: " + indirimliFiyatGetir10(fiyat));
        System.out.println("3. method call dan sonra donen fiyat: " + fiyat);
        /*
        main methoddai fiyati degistirmek icin main icinde atama yapmaliyiz
         */
        fiyat = indirimliFiyatGetir10(fiyat);
        System.out.println("main metotta atama yapildiktan sonra fiyat: "+fiyat);
    }
    public static void indirimYap10(double fiyat){//double fiyat=degeri metodun cagirildigi yerden
        fiyat=fiyat*0.9;
        System.out.println("%10 indirimli fiyat : "+fiyat);

    }
    public static void indirimYap25(double fiyat){//int fiyat=degeri metodun cagirildigi yerden
        fiyat=fiyat*0.75;
        System.out.println("%10 indirimli fiyat : "+fiyat);

    }
    public static double indirimliFiyatGetir10(double fiyat){
        fiyat=fiyat*0.9;
        return fiyat;
    }
}
