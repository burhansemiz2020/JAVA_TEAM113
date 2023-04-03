package day19_MDA_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_TekrarlardanKurtulma {
    public static void main(String[] args) {
        /*
        verilen bir array den tekrar eden sayilari silip
        her bir elementin sadece bir kez kullanildigi
        bir hale donusturelim.
         */
        int [] arr={3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};
        /*
        bir tane bos list olusturalim
        array deki her elemani ele alalim
        ele alinan element list te yoksa
        ekleyelim. yoksa eklemeyelim
         */
        List benzersizElementlerList=new ArrayList();

        for(int i=0;i<arr.length;i++){
            if (!benzersizElementlerList.contains(arr[i])){
                benzersizElementlerList.add(arr[i]);
            }
        }
        System.out.println(benzersizElementlerList);
        //istenen listeyi list olarak elde ettik
        //bunu arr ye atamaliyiz

        arr=new int [benzersizElementlerList.size()];
        for (int i = 0; i < arr.length; i++) {

           //arr[i] = benzersizElementlerList.get(i);

        }

        System.out.println(Arrays.toString(arr));


    }
}
