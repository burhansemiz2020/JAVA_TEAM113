package day18_MultiDimensionalArrays;

public class C06_MultiDimansionalArrays {
    public static void main(String[] args) {
        int[][] arr={{3,5,7},{1,2,3,4},{1,2},{7}};
        /*
        Array de kac tane cift sayi oldugunu bulunuz
        Find the even numbers int array
         */
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    sayac++;
                    System.out.println(arr[i][j]);
                }
            }
        }
        System.out.println("Toplam cift sayi adedi: " +sayac);
    }
}
