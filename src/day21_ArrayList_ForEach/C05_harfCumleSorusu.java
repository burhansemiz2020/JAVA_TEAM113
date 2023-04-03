package day21_ArrayList_ForEach;

import java.util.Arrays;

public class C05_harfCumleSorusu {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin,
        harf cumlede kullanilmissa kac kere
        kullanildigini yazdirin, kullanilmadiysa 
        “harf cumlede kullanilmamis” yazdirin.
         */
        String cumle="Yatin kalkin Java calisin";
        String istenenHarf="a";

        String[] karakterler=cumle.split("");
        System.out.println(Arrays.toString(karakterler));

        int sayac=0;
        for (String each: karakterler
             ) {
            if (each.equalsIgnoreCase(istenenHarf)) {
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println(("Harf cumlede kullanilmamis"));
        }else{
            System.out.println("Istenen harf cumlede "+sayac+" adet kullanilmis");
        }
    }
}
