package day25_PassByValue_ImmutableClasses;

import java.time.LocalTime;

public class C05_DateAndTime {
    public static void main(String[] args) {
        LocalTime saat=LocalTime.now();
        System.out.println(saat);

        System.out.println(saat.getNano());

        /*
        bir loop ile birden 10 bine kadar olan sayilari toplayin
        ve bu islemin kac nano saniye surdugunu bulun
         */

        int toplam=0;
        int basSuresiNano=saat.getNano();

        for (int i = 0; i < 10000; i++) {
            toplam+=i;
        }
        LocalTime saatSon=LocalTime.now();
        int bitSuresiNano=saat.getNano();
        System.out.println("Islem suresi : " +(bitSuresiNano-basSuresiNano));
    }
}
