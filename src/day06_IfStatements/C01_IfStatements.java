package day06_IfStatements;

public class C01_IfStatements {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        if(a>b){System.out.println("a b'den buyuk");}//eger true olsaydi tirnak
                                                    // icindeki kisim calisacakti
        /*Bu kod false olsa da calismaz diyemeyiz
        bu kodun kontrol kismi calisti
        ama durumu yazdirmaya deger bulmadi
        if kodu calisti ama if body si devreye
        girmedi
         */
        int x=13;
        int y=55;
        if (x>b) {
            System.out.println("x y'den buyuk");
        }
        if (x%2==0) {
            System.out.println("x cift sayidir");
            }
        if (y>100) {
            System.out.println("y 100'den buyuktur");
        }
        /*buradaki sartlar birbirinden bagimsizdir.
        uygun sayilar olura uc if body si de calisabilir
        bazen de hicbir if body si devreye girmeyebilir
        eger konsolda
        Process finished with exit code 0 bu yaziyi gorurseniz
        kod calismis ama yazdirilacak deger yoktur
        sadece degerleri sartlari saglamadigi icin
        konsolda bir sey yazdirilmadi
        */
        /*
        Basit if cumleleri, kod’un geriye kalani
        ile baglantili degildir.
        Belirlenen boolean sarti kontrol eder,
        o sart saglanirsa if body calisir, sart
        saglanmazsa if body calismaz

         */
        boolean sonuc=x*7>y;
        /*
        bazen if statements da direk boolean bir deger
        sart olarak yazilabilir. bu durumda boolean variable
        degeri true ise if body calisir, false ise if body calismaz
         */
        if (sonuc) {
            System.out.println("istenen sart saglandi");

        }

    }
}
