package day25_PassByValue_ImmutableClasses;

public class C03_ImmutableClasses {
    public static void main(String[] args) {
        /*
        Java da bir class ve o class tan olusturulan objeler
        ya multible dir. ya da immutable dir. O zaman nasil
        deger degisiyor? Java metinsel ifadeleri atayabilecegimiz
        3 class olusturmustur. Bunlar
        String       ==immutable
        StringBuilder==mutable
        StringBuffer ==mutable

        Immutable class tan olusturulan classlarda immutable dir.
        String immutable oldugundan ayni str objesine yeni deger atandiginda
        java eski degeri degistiremez. Bunun yerine istenen yeni degere
        sahip yeni bir obje olusturur ve str in pointer ini yeni objeye yoneltir.
        kullanilmayan eski objeler garbage collector tarafindan toplanmak uzere beklerler.

         */
        String str="Java Candir";
        str=str.toLowerCase();
        System.out.println(str);
        str=str.toUpperCase();
        System.out.println(str);

        //asagidaki kod calistiginda java kac obje olusturur?
        String s="Hava";
        for (int i = 0; i < 100; i++) {
            s=s+".";
            System.out.println(s);//101 tane obje olusturur.
        }
    }
}
