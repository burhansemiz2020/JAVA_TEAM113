package day25_PassByValue_ImmutableClasses;

public class C04_StringHavuzu {

    public static void main(String[] args) {

        String str1="Java";
        String str2="Java";
        String str3= new String("Java");
        String str4="Ja"+"va";
        String s="Ja";
        String t="va";
        String str5=s.concat(t);
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str4));//true
        System.out.println(str1.equals(str5));//true

        System.out.println("========================");

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//true
        System.out.println(str1==str5);//false
        System.out.println(str1=="Java");
        /*
        String de equals kullanin == sizi surprizlerle karsilastirir
        double equals sign hem referansi hem de degeri karsilastirir.
        equals ise sadece degerleri karsilastirir.

        Eger string havuzunda olup, hem referansi, hem degeri ayni olan
        stringler double equals sign ile karsilastirilirlarsa sonuc
        true olur. Ancak new keyWord kullanilarak olusturulan veya
        metot kullanilan stringler double equals sign ile karsilastirilirlarsa
        sonuc false olur.
        Java da String havuzu diye bir sey var.



         */

    }

}