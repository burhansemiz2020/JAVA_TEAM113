package day11_StringManipulations_ForLoop;

public class C04_replaceAll {
    public static void main(String[] args) {
        String str="J1a23va34 5C54and65ir87";
        //str daki sayilari method ile temizleyin
        /*
        eger degistirmek istedigimiz sey birden cok ortak
        ozellikli se ise ornegin tum sayilari yok etmek
        istiyorsak
        -tum sayilar
        -sayi olmayanlarin tumu
        -tum space ler
        -space olmayan tum karakterler

        bu durumda bu ortak ozellikleri belirtmek icin
        Java regex tanimlamistir.
        Regex==regular expressions demektir
        Regex (Regular Expressions)
        \\s : space \\S : space olmayan hersey
        \\s+ : yanyana birden fazla space
        \\d : digits \\D : digit olmayan hersey
        \\w : harf veya rakam \\W : harf veya rakam olmayan hersey
        digit sayi
         */
        str=str.replaceAll("\\d", "");
        System.out.println("str in yeni hali: " + str);
    }
}
