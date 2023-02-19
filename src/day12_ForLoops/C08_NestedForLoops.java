package day12_ForLoops;

public class C08_NestedForLoops {
    public static void main(String[] args) {
        /*
        dinamik olarak verilen satir ve sutun sayisina
        gore yildizlardan bir diktortgen olusturun

        * * * * *
        * * * * *
        * * * * *


         */
        int satirSayisi = 3;
        int sutunSayisi = 5;

        for (int k=1; k<=satirSayisi; k++ ) { // k satir sayisini kontrol ediyor
            for (int i=1; i<=sutunSayisi; i++){//i ise sutun sayisini
                System.out.print("* ");
            }
            System.out.println("");//bir satirdaki tum sutunlar bitince alt satira geciyor


        }
        System.out.println("=========");
        for (int i= 1; i<=satirSayisi; i++){
            for (int j= 1; j<=sutunSayisi; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("=========");



    }
}
