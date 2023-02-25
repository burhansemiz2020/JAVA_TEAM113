package day17_Arrays_Questions;

import java.util.Arrays;

public class C05_SagaKaydirma {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen bir array’deki tum elementleri
        bir saga kaydirip, sondaki elementi de
        basa tasiyacak bir method olusturun, array’i
        yeni haliyle kaydedin.

        Orn : input : [3,4,5,6]
        array’in son hali. : [6,3,4,5]
        BU SORUYU METHODSUZ COZELIM
         */
        int[] arr = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int temp = arr[arr.length - 1];//gecici torbayi yaptik

        for (int i = 0; i < arr.length-1; i++) {
            arr[arr.length-1-i] = arr[arr.length-2-i];

        //manuel yapmak icin
           //arr[3]=arr[2];
           //arr[2]=arr[1];
           //arr[1]=arr[0];
           //
           //arr[0]=temp;
           //System.out.println(Arrays.toString(arr));
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));

    }
}
