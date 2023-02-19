package day12_ForLoops;

public class C01_DikkatEdilecekler {
    public static void main(String[] args) {


        for (int i=20; i<10; i++) {
            System.out.println(i + " ");
        }
        /*
        burada forLoop calisti ancak ilk deger
        icin bitis sarti false verdigi icin
        loop body si hic devreye girmedi
         */
            for (int i=0; i<10; i--){

                System.out.println(i + " ");
                /*
                bu ornek sonsuz loop
                loop basladiktan sonra
                artis azalis yontemi sebebiyle
                bitis degerinden uzaklasiyorsa
                loop teorik olarak sonsuza kadar calsisir
                buna sonsuz loop deniyor
                 */

        }
    }
}
