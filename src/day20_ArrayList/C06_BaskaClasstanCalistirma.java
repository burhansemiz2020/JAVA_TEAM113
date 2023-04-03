package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_BaskaClasstanCalistirma {
    public static void main(String[] args) {
        /*
        C05 teki istenmeyenleri burada kullanalim
         */
        List<String> urunler =new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Gofret");
        urunler.add("Cokoprens");
        urunler.add("Cokomel");

        String istenmeyenHarf="o";

        System.out.println(C05_Question_IstenmeyeniSil.istenmeyenHarfIcerenleriSil(urunler, istenmeyenHarf));
        //[Nutella]
        System.out.println(C05_Question_IstenmeyeniSil.istenmeyenHarfIcerenleriSil(urunler, "a"));
    }
}
