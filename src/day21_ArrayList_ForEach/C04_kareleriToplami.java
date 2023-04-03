package day21_ArrayList_ForEach;

public class C04_kareleriToplami {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen int array’deki her elementin
        karelerini alip, karelerinin toplamini
        yazdiran bir method olusturun.
         */
        int[] arr={2,3,5, 6};
        kareleriToplaminiYazdir(arr);
    }
    public static void kareleriToplaminiYazdir(int[] arr) {
        int kareleriToplam = 0;
        for (int each : arr) {
            kareleriToplam += each * each;
        }

        System.out.println(kareleriToplam);



    }
}
