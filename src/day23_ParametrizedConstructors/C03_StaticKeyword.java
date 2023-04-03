package day23_ParametrizedConstructors;

public class C03_StaticKeyword {
    static String hastaneIsmi="Yildiz Hastanesi";
    static String hastaneTelefonu="3343434";
    static String bashekimIsmi="Dr Kemal Aydin";

    String personelIsmi;
    String personelAdresi;
    String personelTelefonu;

    public static void main(String[] args) {
        C03_StaticKeyword personel1=new C03_StaticKeyword();
        System.out.println(personel1.personelIsmi);//null
        System.out.println(hastaneIsmi);//yildiz
        System.out.println(personel1.bashekimIsmi);//kemal

        C03_StaticKeyword personel2=new C03_StaticKeyword();
        personel2.personelIsmi="Dogan";
        System.out.println(personel2.personelIsmi);
        System.out.println(personel1.personelIsmi);

        personel2.bashekimIsmi="Sumeyra Gunel";
        System.out.println(personel1.bashekimIsmi);


        /*
        1. Static variable lar tum class icin gecerlidir.(bu nedenle bunlara class variable denir)
        2. Static variable lar tum objeler icin ayni degeri tasidiklari icin her obje icin ayrica
        olusturulmaz, sadece bir variable olur.
        3. Static variable lara ulasmak veya update etmek icin object ismi kullanmaya gerek yoktur.
        direk ulasilabilir. Baska classtan statik variable a ulasmak icin class ismi.statik variable
        ismi yazilir.

         */
    }
}
