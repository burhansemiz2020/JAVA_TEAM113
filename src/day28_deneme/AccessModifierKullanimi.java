package day28_deneme;

import day28_accessModifier_Encapsulation.C03_EncapsuleDatalar;

public class AccessModifierKullanimi {
    public static void main(String[] args) {


        C03_EncapsuleDatalar obj=new C03_EncapsuleDatalar();
        /*
        Baska bir class dakivariable veya methoda ulasmak istedigimizde

        - ulasmak istedigimiz class uyesinin static olup olmamasi
          erisim yontemini etkiler
          static ise classIsmi.uyeIsmi yazarken
          static degilse obje olusturup objeIsmi.uyeIsmi

        - ulasmak istedigimiz uyenin access modifier ise o uyeye
        ulasip ulasamayacagimizi belirler

        ulasabilirsek o datayi okuyabilir veya o dataya yeni deger atayabiliriz

         */
        System.out.println(obj.toplamSatis);//read yetkisi
        obj.toplamSatis=100;//write

        //System.out.println(obj.satisTutari);//
        //obj.satisTutari=100;//
    }
}

