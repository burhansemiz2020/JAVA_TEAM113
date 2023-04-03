package day19_MDA_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_getAndset {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        System.out.println(sayilar);
        System.out.println(sayilar.get(0));//3

        //son elementi yazdirin
        System.out.println(sayilar.get(sayilar.size() - 1));

        //set ; 2 elementini 12 yapin

        System.out.println(sayilar.set(2, 12));
        //5'i 7 yapalim
        System.out.println(sayilar.set(1, 7));
        System.out.println(sayilar);//[3, 7, 12]


    }
}
