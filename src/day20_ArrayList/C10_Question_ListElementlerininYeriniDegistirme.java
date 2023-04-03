package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C10_Question_ListElementlerininYeriniDegistirme {
    public static void main(String[] args) {
        /*
        2. indeksteki element ile
        5. indeksteki elementin
        yerini degistirin
         */
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(10);
        System.out.println(sayilar);

        int temp = sayilar.get(2);
        sayilar.set(2, sayilar.get(5));
        sayilar.set(5, temp);
        System.out.println(sayilar);
        /*
        ODEV:
        VERILEN BIR LISTEDE ISTENEN 2 INDEX TEKI ELEMENTLERIN
        YERINI DEGISTIRIP YENI LISTEYI BIZE DONDUREN BIR
        METOT OLUSTURUN.
         */
    }
}
