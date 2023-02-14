package day09_switch_stringManipulation;

import java.util.Locale;

public class C03_StringManipulations {
    public static void main(String[] args) {
        String str="Java Candir";
        //str i buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase());
        System.out.println(str);
        /*
        string manipulation yaptiktan sonra
        asil variable a atama yapilmazsa asil
        variable degismez
         */
        str=str.toUpperCase();
        System.out.println(str);
        System.out.println("====");

        System.out.println(str.toLowerCase());

        /*
        str i turkce karakterleri goz onunde bulundurarak
        turkce karakterlere cevirin
         */
        str=str.toLowerCase(Locale.forLanguageTag("TR"));
        System.out.println(str);//java candır yazdirdi



    }
}
