package day39_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_MapilkClass {
    public static void main(String[] args) {
        Map<Integer, String> okulMap=new HashMap<>();
        /*
        Bir map olusturulurken ve element eklerken
        bilgilere sonradan erisimin mumkun olabilmesi icin tum
        elemenltlerin ayni bilgileri barindirdigindan ve
        ayni siralama ile elemente eklendiginden emin olmaliyiz.
         */
        okulMap.put(101, "Ali, Cem, 10, H, MF");
        okulMap.put(102, "Veli, Can, 10, M, TM");
        okulMap.put(103, "Ali, Can, 11, M, Soz");
        okulMap.put(104, "Ayse, Cem, 11, H, TM");
        okulMap.put(105, "Ayse, Han, 10, H, MF");
        okulMap.put(106, "Veli, Han, 10, H, MF");

        System.out.println(okulMap);
        //Mapde kac element var?
        System.out.println(okulMap.size());//6
        //Sadece key degerelerini yazdiralim
        System.out.println(okulMap.keySet());//[101, 102, 103, 104, 105, 106]
        //tum value lari yazdiralim
        System.out.println(okulMap.values());
        //[Ali, Cem, 10, H, MF, Veli, Can, 10, M, TM,
        // Ali, Can, 11, M, Soz, Ayse, Cem, 11, H, TM,
        // Ayse, Han, 10, H, MF, Veli, Han, 10, H, MF]


        //Value nun cok bilgi icermesi onun sayisini arttirmaz
        //Mesela bu ornekte 6 tane value vardir. normalde 30 veri olsa da
        //6 value degeri altinda olduklarindan value toplam 6 dir.
        System.out.println(okulMap.values().size());//6

    }
}
