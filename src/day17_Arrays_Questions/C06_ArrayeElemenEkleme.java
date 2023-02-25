package day17_Arrays_Questions;

import java.util.Arrays;

public class C06_ArrayeElemenEkleme {
    public static void main(String[] args) {
        /*
        Soru 7- Verilen bir array’e istenen bir elemani
        ekleyip bize donduren bir method yazin,
        eski array’e yeni degeri atayin.
         */


        int[] a = {1,2,3};
        int[] b = {3,4,5,6,7};
        /*
        Normal sartlarda Array in uzunlugunu degistiremeyiz
        Ancak array e yeni bir array degeri atanabilir.
        Mesela
        a=b; buradaki esittir atama islemi
        b nin degerini a ya ata
        ekleme islemi icin yeni bir array olusturuyoruz
        burada eklemek istedigimiz degeri yazip a nin
        degerini b ye b nin kini de a ya atariz

        Array in uzunlugunu degistiremeyiz

         */
        a=b;
        System.out.println(Arrays.toString(a));


        int[] arr = {4, 5, 6};
        int eklenecekElement = 10;
        //arr= new int[4];//[0,0,0,0] olur bu nedenle eski degerleri
        //korumak icin once istenen uzunlukta yeni bir array olusturuyoruz
        //eski degerdeki tum elementleri yeni array e tasiyoruz
        //sonra istenen elementi de atayip
        //yeni istedigimiz hale gelince
        //eskiArr=yeniArr

        int [] yeniArr=new int[arr.length+1];// bu kisim 0 0 0 0 kismidir

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];
        }//yeniArr[4,5,5,6,0]
        yeniArr[yeniArr.length-1]=eklenecekElement;

        arr=yeniArr;
        System.out.println(Arrays.toString(arr));



    }
}
