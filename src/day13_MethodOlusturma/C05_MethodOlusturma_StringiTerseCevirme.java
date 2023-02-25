package day13_MethodOlusturma;

public class C05_MethodOlusturma_StringiTerseCevirme {
    public static void main(String[] args) {
        /*
        Verilen bir string i tersine cevirip
        bize donduren bir method olusturun.

        */
        System.out.println(stringTersineCevir("Java Candir"));
        System.out.println(stringTersineCevir("Anlasildi mi?"));
        System.out.println(stringTersineCevir("Soyle Omer"));
    }
    public static String stringTersineCevir(String metin){//Java

        String tersMetin="";
        for (int i = metin.length()-1; i >= 0 ; i--) {
            tersMetin += metin.charAt(i);
        }

        return tersMetin;
    }
}
