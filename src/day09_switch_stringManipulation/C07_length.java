package day09_switch_stringManipulation;

public class C07_length {
    public static void main(String[] args) {
        String str="Java gun gectikce guzellesiyor";

        //Bu cumledeki karakter sayisini yazdirin dersek

        System.out.println(str.length());
        //karakter sayisi ile index arasinda bir fark olur
        //bu fark 0 dan kaynaklanir
        /*
        burada 0 ile basladigi icin yukaridaki cumlenin son
        harfini yazdirmak icin 30-1 yapmamiz gerekir
         */
        System.out.println(str.charAt(30-1));
        /*
        ancak her seferinde yazmak yerine
         */
        System.out.println(str.charAt(str.length()-1));//yapariz ve ayni sonucu aliriz

        //mesela sondan ucuncu karakteri yazdir dersek:
        System.out.println(str.charAt(str.length()-3));

        /*
        NOT str.charAt(str.length()-3). burada parantezden sonra . koyup sout
        dersek direk sout un icine alir pratik bir yol
         */



    }
}
