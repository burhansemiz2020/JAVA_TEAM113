package day18_MultiDimensionalArrays;

import java.util.Arrays;

public class C03_MultiDimensionalArray {
    public static void main(String[] args) {
        /*

         */
        int[][] arr={{3,4,5},{2,3},{1}};
        /*
        int[][] iki katli array belirtir.
        ilk koseli parantez ana array i
        outerArray i kontrol eder
        ikinci koseli parantez ise
        icerideki arrayleri (innerArray)
        kontrol eder.
         */
        System.out.println(arr[1][1]);//3 yazdirir
        System.out.println(arr[0][2]);//5 yazdirir
        System.out.println(arr[2].length);
        System.out.println(Arrays.toString(arr[1]));//yazdirilmaz [I@4dd8dc3
        System.out.println(Arrays.deepToString(arr));//
        System.out.println(arr.length);//3
        /*
        multidimensional array lerde neyi
        yazdirdigimiza dikkat etmeliyiz.
        Bir array i yazdiracaksak Arrays.toString demeliydik
         */
    }
}
