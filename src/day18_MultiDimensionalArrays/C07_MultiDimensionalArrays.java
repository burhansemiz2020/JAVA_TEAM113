package day18_MultiDimensionalArrays;

public class C07_MultiDimensionalArrays {
    public static void main(String[] args) {
        //
        /*
        20 ile 40 arasinda olan sayilarin 20 40 dahil
        toplamini bulun
        find the sum of the numbers enter the 20 and 40
         */
        int toplam=0;
        int[][] arr={{13,25,37},{41,12,23,34},{11,25},{17}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>=20&&arr[i][j]<=40){
                    toplam+=arr[i][j];
                }
            }
        }
        System.out.println("Toplam: " +toplam);
    }
}
