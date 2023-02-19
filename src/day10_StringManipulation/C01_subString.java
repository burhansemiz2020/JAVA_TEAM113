package day10_StringManipulation;

public class C01_subString {
    public static void main(String[] args) {
       String str="Java ne kadar guzel";
       /*
       substring iki farkli sekilde kullanil;abilir
       1. tek parametre olursa o index den baslar sona kadar gider
       */
        System.out.println(str.substring(8));//kadar guzel
        System.out.println(str.substring(0));//Java ne kadar guzel
        System.out.println(str.substring(str.length() - 3));//zel

        System.out.println(str.substring(str.length()));//bir bos satir yazdirdi.
                                                        //aslinda l den sonra bisey
                                                        //olmadigi icin hiclik soz konusu
        //System.out.println(str.charAt(str.length()));
        /*
        str in uzunlugu 19 son harfin indexi 18
        19. index te karakter yok. Burda neden konsol da
        hata verdi???
        Eger length derseniz uzerine gelindiginde gereksiz der
        */
        /*
        2. iki parametre girilirse baslangicindex inden dahil baslar
        bitis indexine kadar devam eder
         */
        System.out.println(str.substring(5, 7));//ne den baslayip iki
                                                // karakter yazdiracak ne yazdiracak
        System.out.println(str.substring(3, 4));//a dan baslayip 4 te bitecek yani
                                                //sadece a yazdiracak
        System.out.println(str.substring(0, 1));// J yazdirir

        /*
        str in besinci indexteki karakterini yazdirin
         */
        System.out.println(str.charAt(5));//n
        //bunu substring ile de yapabiliriz
        System.out.println(str.substring(5, 6));//n
        System.out.println(str.substring(2, 2));
        //System.out.println(str.substring(5, 1));//aslinda hatali ama syntax te problem yok
                                                  //runtime error
    }
}
