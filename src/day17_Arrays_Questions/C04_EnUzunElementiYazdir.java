package day17_Arrays_Questions;

public class C04_EnUzunElementiYazdir {
    public static void main(String[] args) {
        /*
        Soru 6- Verilen String bir array’deki
        en uzun ve en kisa kelimeleri yazdiran bir method
        olusturun.
         */
        String[] arr = {"Melike", "Burkay", "Inci", "Eda", "Emre", "Ali"};
        enUzunEnKisaYazdir(arr);

        String[] arr2 = {"Melike", "Burkay", "Inci", "Eda", "Emre", "Huseyin", "Su"};
        enUzunEnKisaYazdir(arr2);

    }

    public static void enUzunEnKisaYazdir(String[] arr) {
        String enUzunKelime = arr[0];//uzunluk==0
        String enKisaKelime = arr[0];//uzunluk==0

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= enUzunKelime.length()) {

            }

            if (arr[i].length() <= enKisaKelime.length()) {
                enKisaKelime = arr[i];
            }


        }
        System.out.println("Array deki en uzun kelime: " + enUzunKelime);
        System.out.println("Array deki en kisa kelime: " + enKisaKelime);



    }

}
