package day17_Arrays_Questions;

import java.util.Arrays;

public class C09_SortveBinarySearch {
    public static void main(String[] args) {
        /*
        Verilen bir arrayi natural order a gore siralamak icin
        arrays.sort methodu kullanilir.
         */
        int[] arr1={3,9,6,1,7};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        String[] arr2={"Hasan", "Huseyin","Mehmet","Mesut","Mercan", "ali"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        //siralamada harflerin ascii degerleri esas alinir
        //buyuk harflerin degerleri daha kucuk oldugu
        //icin ilk once onu sona atar
        /*
        sort yapildiktan sonra
                 array de bir elean aramak icin
                 */
        System.out.println(Arrays.binarySearch(arr2, "ali"));
    }
}
