package day10_StringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {
        String str="Java cok ama cok guzel";
        System.out.println(str.indexOf("c"));//bize c nin indexini sayi degeri ile verir
        System.out.println(str.indexOf("a"));//birden cok a oldugu icin ilk a nin
        // indexini verir ilk a nin indeksi 1 dir.
        System.out.println(str.indexOf("cok"));//Java burada ilk karakter nerden
        //basliyorsa o nun karakterini verir. burada bes sonucunu verir
        System.out.println(str.indexOf("cok", 6));//13
        /*
        bu ornekte fromindexten sonra str i arar ve
        bulursa str daki degerin indexini verir
        eger birden fazla varsa ilkinden baslayip
        devam edecegiz
         */
        System.out.println(str.indexOf("cok", 5));//5

        System.out.println(str.indexOf("java"));//aranan string yoksa -1 doner
        /*
        Verilen bir cumlede istenen bir String icin
        asagidakilerden uygun olani yazdirin
        1. aradiginiz kelime 1 kez kullanilmis
        2. aradiginiz kelime 2 kez kullanilmis
        3. aradiginiz kelime 3 kez kullanilmis
        4. aradiginiz kelime cumlede hic kullanilmamis
        */
        String cumle="Yasasin java, iyi ki java ogreniyorum ";
        String kelime="java";


        if (cumle.indexOf(kelime) == (-1)){
            System.out.println("aradiginiz kelime hic kullanilmamis");
        }else if (cumle.indexOf(kelime) != (-1)){
            int kelimeIlkIndex=cumle.indexOf(kelime);//burada java nin ilk indexini bulduk 8
            if (cumle.indexOf(kelime,(kelimeIlkIndex+1))==(-1)){
                System.out.println("aradiginiz kelime 1 kez kullanilmis");
            }else{
                int ikinciKelimeIndex=cumle.indexOf(kelime,(kelimeIlkIndex+1));
                if (cumle.indexOf(kelime,(ikinciKelimeIndex+1))==(-1)){
                    System.out.println("aradiginiz kelime 2 kez kullanilmis");

                    }else{
                        System.out.println("aradiginiz kelime 2 den fazla kullanilmis");
                }
            }
             }


    }
}
