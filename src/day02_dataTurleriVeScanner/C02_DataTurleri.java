package day02_dataTurleriVeScanner;

public class C02_DataTurleri {
    public static void main(String[] args) {
        //char ilkHarf='8.5' olmaz uc karakter var
        // tek karakter olmali
        char ilkHarf='a';
        System.out.println(ilkHarf);//char ifadeler hafizada 16 bit yer kaplar

        /*Byte short int long tam sayi iceren
        data turleridir. datanin niceligine gore
        kullanilirlar
         */
        System.out.println();
        byte ogrYasi1=15; //en dogru kullanim budur hafizada gereksiz yer isgal etmez
        short ogrYasi2=16;
        int ogrYasi3=14;
        long ogrYasi=15;

        System.out.println();

        double sayi1=3.123456789123456789;//double in hata payi var en sondaki sayiyi yuvarlar
        //double virgulden sonra 16 hane yazdirir cok kucu sayilara
        //indigi icin ondalikli kisimda hatalar olabilir
        //15/3=4.999999 gibi bir sonuc verebilir ya da 5.00000 gibi sonuclar verebilir
        System.out.println(sayi1);
        float sayi2=45.5433345784653789521228821f;
        System.out.println(sayi2);
        /*floatin double dan farkli oldugunu
         belirtmek icin sonuna f ya da F yazmak gerekmektedr
         derslerde integer ve double kullanilacak
         */


    }
}
