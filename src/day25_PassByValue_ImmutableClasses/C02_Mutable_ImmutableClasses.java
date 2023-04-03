package day25_PassByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_Mutable_ImmutableClasses {
    public static void main(String[] args) {
        /*
        String ve wrapper class lar immutable olduklari icin
        degistirilemezler. Ancak array ve list mutable olduklari
        icin atama yapmasak da metot kullaninca degerleri degisir.
        String == immutable

         */

        String str="Java gun gectikce daha da keyifli oluyor";
        str.substring(5);
        str.substring(3,15);
        str.startsWith("Java");
        str.toLowerCase();
        System.out.println(str);

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(8);

        System.out.println(sayilar);

        sayilar.set(0,7);
        sayilar.remove(1);
        System.out.println(sayilar);
    }
}
