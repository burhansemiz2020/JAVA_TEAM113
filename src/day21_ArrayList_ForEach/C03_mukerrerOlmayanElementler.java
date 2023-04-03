package day21_ArrayList_ForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_mukerrerOlmayanElementler {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir array’de tekrar eden elementler icin,
        mukerrer olanlari silip, tum elemanlardan sadece 1 tane
        yapip eski array’e yeni halini atayip yazdirin.
         */
        int[] arr = {3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};
        List<Integer> benzersizElementListesi = new ArrayList<>();
        //herbir elemenai kontrol edip yoksa ekle varsa ekleme
        for (int each: arr
             ) {
            if (!benzersizElementListesi.contains(each)){
                benzersizElementListesi.add(each);

            }

        }
        System.out.println(benzersizElementListesi);
        arr=new int[benzersizElementListesi.size()];

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
        arr[i]=benzersizElementListesi.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
