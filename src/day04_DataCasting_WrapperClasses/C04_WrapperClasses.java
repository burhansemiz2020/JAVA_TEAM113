package day04_dataCasting_WrapperClasses;

public class C04_WrapperClasses {
    public static void main(String[] args) {
        //primitive ile non primitive farki
        //hazir metot farkidir
        //primitive lerde hazir metotlar yok
        /*Java primitive data turleri icin
        kolayca gecis yapabilecekleri
        non prim data turleri olusturmustur

        int==> Integer
        byte==>Byte
        char==>Character
        boolean==>Boolean
         */
        Integer sayi=10;
        /* int variable a atadaigimiz degerleri atayabiliyoruz
        arti olarak hazir metotlari var
        Bunun disinda da variable olusturmadan da
        bazi metotlari kullanabiliyoruz.
         */
        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.MAX_VALUE);//2147483647

        String sonucStr="345";
        System.out.println(sonucStr + 10); //34510

        //10 ekleyin

        //int sonuc=(int) olmuyor string int e donmuyor bunun icin Wrapper Classlar kullanilir

        int sonuc = Integer.parseInt(sonucStr);
        System.out.println(sonuc+10);//355 sonucunu aliriz

        char krk='3';
        System.out.println(Character.isDigit(krk));//true
        System.out.println(Character.isLetter(krk));//false
        //bu metotlar kullanilir testlerde sorulur

        System.out.println(Character.isAlphabetic(krk));


    }
}
