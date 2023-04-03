package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayListMethods_Contains {
    public static void main(String[] args) {
        /*
        Uzun bir listeyi Java da list olarak kaydetmek istersek
        tekk tek eklemek istemezseniz pratik olarak bir array olusturup
        loop ile tum elementleri list e ekleyebiliriz
         */
        int[]arr={2,3,4,5,6,7,8,3,4,5,6,7,8};
        List<Integer> sayilar=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar);//[2, 3, 4, 5, 6, 7, 8, 3, 4, 5, 6, 7, 8]
        //Bu listede element olarak 3 var mi
        System.out.println(sayilar.contains(3));
        System.out.println(sayilar.contains(9));

        sayilar.clear();
        System.out.println(sayilar);//[]


    }
}
