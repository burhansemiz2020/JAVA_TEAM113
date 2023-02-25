package day17_Arrays_Questions;

import java.util.Arrays;

public class C07_ArrayeElemanEklemeMetodu {
    public static void main(String[] args) {
         /*
        Soru 7- Verilen bir array’e istenen bir elemani
        ekleyip bize donduren bir method yazin,
        eski array’e yeni degeri atayin.
         */
        int[] arr = {2, 4, 7, 8};
        //arr ye method la 5 ekleyelim
        arr=arrayeElementEkle(arr, 5);
        arr=arrayeElementEkle(arr, 3);
        arr=arrayeElementEkle(arr, 8);
        arr=arrayeElementEkle(arr, 19);
        System.out.println(Arrays.toString(arr));

    }
    public static int [] arrayeElementEkle(int[] arr, int eleman) {
        int [] yeniArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i];
        }
        yeniArr[yeniArr.length-1] = eleman;
        return yeniArr;
    }
}
