package day18_MultiDimensionalArrays;

public class C05_MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] arr={{3,5,7},{1,2,3,4},{1,2},{7}};
        //toplam element sayisi kactir?
        int elementSayisi=0;
        for (int i = 0; i < arr.length ; i++) {
            elementSayisi+=arr[i].length;

        }
        System.out.println("toplam element sayisi: "+elementSayisi);
        //tum elementlerin toplamini bulun
        int toplamElement=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                toplamElement+=arr[i][j];
            }
        }
        System.out.println("tum elementlerin toplamini: "+toplamElement);
        /*
        Multidimensional array lerde her bir elementi
        elden gecirmek istiyorsak katsayisi kadar
        nested for loop kullaniriz
        EGER 3 KATLI OLSAYDI 3 KATLI NESTED FOR LOOPS YAPILACAKTI
        BURADA IKI KATLI OLDUGUNDAN IKI KATLI NESTED YAPTIK
        arr[i][j] tum elementleri tek tek yazdirir.
        multidimensiona array lerde bu islemi her zaman yapacagiz
         */
    }
}
