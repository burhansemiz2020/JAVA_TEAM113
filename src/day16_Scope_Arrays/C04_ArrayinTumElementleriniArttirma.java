package day16_Scope_Arrays;

import java.util.Arrays;

public class C04_ArrayinTumElementleriniArttirma {
    public static void main(String[] args) {
        int[] fiyatlar = {15, 25, 30, 10, 50};
        System.out.println(Arrays.toString(fiyatlar));

        //tum urunlere 3 lira fiyat duzenlemesi yapalim
            /*
            array in sorularinin cogu array in
            elemanlari uzerinde sekillenir
            array icin for loop uygun bir metottur
             */
        for (int i = 0; i < fiyatlar.length; i++) {
            fiyatlar[i] += 3;

        }
        System.out.println(Arrays.toString(fiyatlar));

    }
}

