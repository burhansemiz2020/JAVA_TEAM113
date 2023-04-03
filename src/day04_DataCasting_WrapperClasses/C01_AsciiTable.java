package day04_dataCasting_WrapperClasses;

public class C01_AsciiTable {
    public static void main(String[] args) {
        /*
        a ===>
        24 ===>11000
        ama a yi nasil cevirecegiz
        alfabedeki her karaktere bir sayi degere atayalim demisler
        a==>97
        97==>10100010
        char data turundeki variable ve degerler
        sayisal data turlerine atanirsa veya
        sayisal data turundeki datalar ile
        isleme sokulursa ASCII table daki degerleri
        ile isleme girerler
         */
        System.out.println(5 + 'a');//5+97 cunku a = 97
        /* char data turundeki islemler matematiske islemler olursa
        ascii data turune donustururlwer
         */
        char ilkharf=101;
        System.out.println(ilkharf);

        //kullanicinin verdigi harften bir sonraki harfi yazxdirin
         char girilenChar='f';
         System.out.println(girilenChar+1);
         //ama biz 103 u degil 103 un karsiligi olan char iadeyi
        //yazdirmak istersek exlicit casting yapmamiz lazim
        System.out.println("Girilen harfin bir sonrasi : " + (char) (girilenChar+1));
        girilenChar='M';
        System.out.println((char)(girilenChar-2));
        //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.




    }
}
