package day05_IncrementDecrementConcatenation;

public class C03_Concatenation {
    public static void main(String[] args) {
        //Bir string baska bir string veya
        //baska

        String a="Java";
        String b="Guzeldir";
        System.out.println(a+b);
        System.out.println(a+"  "+b);//Java Guzeldir

        int c=10;
        int d=20;
        System.out.println(a+c+d);
        /*
        Eger string ile baska data turundeki
        bir deger ile toplanirsa Java
        sonucu String yapar
         */
        //String ile int toplanirsa Java10 gibi olur
        //String int den gucludur onu icine alir
        //onu stringlestirir
        /*
        Peki java30 yazmak istersek
         */
        System.out.println(a+(c+d));//Java30

        System.out.println();

        System.out.println(a+c*d);//Java200

        System.out.println();

        System.out.println(d+c+a);//30Java

        String s1="Java";


    }
}
