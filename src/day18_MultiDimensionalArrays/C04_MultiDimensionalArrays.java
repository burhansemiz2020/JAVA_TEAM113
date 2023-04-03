package day18_MultiDimensionalArrays;

public class C04_MultiDimensionalArrays {
    public static void main(String[] args) {
        String [][] siniflar = {{"A", "B", "G", "M"},{"F", "P", "A", "V"},{"K", "D", "Q"}};
        //G yi yazdir
        System.out.println(siniflar[0][2]);
        //q yu Y yapin
        siniflar[2][2]="Y";
        //ilk sinifin mevcudunu yazdirin
        System.out.println(siniflar[0].length);//4
        //siniflarda toplam kac kisi

        System.out.println(siniflar.length);

        int toplamOgrSayisi=0;
        for(int i=0;i<siniflar.length;i++){
            toplamOgrSayisi+=siniflar[i].length;
        }
        System.out.println("Toplam ogrenci sayis: " +toplamOgrSayisi);
    }
}
