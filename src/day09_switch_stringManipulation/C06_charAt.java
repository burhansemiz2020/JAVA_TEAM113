package day09_switch_stringManipulation;

public class C06_charAt {
    public static void main(String[] args) {
        String str="Java Candir";

        str.charAt(0);
        System.out.println(str.charAt(0));//J

        //bastan 6. harfi yazdir dersek
        //karakterkler 0 dan baslayacagi icin 6 yerine 5 yazariz
        System.out.println(str.charAt(5));

        //sondan ikinci harfi yazdirin derse
        //bunun icin uzunlugu bilmemiz lazim
        //karakter sayisi toplam 11 sondan
        //ikinci karakter 11-2 olur
        System.out.println(str.charAt(11-2));
        //son harfi yazdirin dersek 11-1
        System.out.println(str.charAt(11-1));


       // System.out.println(str.charAt(11));//boyle yaparsak consol da hata verir
                                            // string sinir disinda hatasi verir
        //System.out.println(str.charAt(15));//ayni hatayi verir

        //str=23 dedigimizde ise hemen hata verir
        /*
        yukarida ise consol da hata verdi.
        Java da iki tur hata ile karsilasiriz
        1. syntax hatasi ile javanin compile ederken
        anladigi ve altini kirmizi ile cizdigi hatalar
        str=23 derseniz string bir variable a integer
        deger atanam,ayacagi icin hemen altini cizer
        Bu nedenle bunlara : CompileTimeError CTE denir


       Bazen de syntax de hata olmaz Java sorunu
       calistiktan sonra farkeder
       ornegin
       str.charAt(15): burada verilen str dan
       bir karakter isteniyor compile time da str in
       uzunlugunu Java anlamaz ama calisma sirasinda 15.
       indezin olmadigini farkeder ve exception firlatir

         */

    }
}
