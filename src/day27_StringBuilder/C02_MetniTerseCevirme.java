package day27_StringBuilder;

public class C02_MetniTerseCevirme {
    public static void main(String[] args) {
        //Verilen bir metni tersine cevirin

        String metin = "Java candir.";
        String tersMetin = "";
        for (int i = metin.length() - 1; i >= 0; i--) {
            tersMetin += metin.charAt(i);
        }
        System.out.println(tersMetin);

        //Ayni islemi String Builder ile cokd aha kolay sekilde yapabiliriz

        String str="Java candir.";
        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse());


    }
}
