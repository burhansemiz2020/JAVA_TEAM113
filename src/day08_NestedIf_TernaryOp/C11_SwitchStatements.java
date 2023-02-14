package day08_NestedIf_TernaryOp;

import java.util.Scanner;

public class C11_SwitchStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan bir harf isteyin
        o harf ile baslayan gun ismi
        var ise yazdirin, yoksa gecersiz
        harf yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        char harf=scan.next().charAt(0);
        harf=Character.toUpperCase(harf);

        if (harf=='P') System.out.println("Pazar, Pazartesi veya Persembe");
        else if (harf=='S') System.out.println("Sali");
        else if (harf=='C') System.out.println("Carsamba, Cuma, Cumartesi");
        else System.out.println("gecersiz harf");

        System.out.println("================");
        //Yukaridaki ornegi yapmanin daha duzenli ve kullanisli bir yolu var
        //Daha kullanislidir
        /*
        Switch staements switch in onundeki yazilan degiskene
        gore esit olan case i calistirir. Yani calistigi yerden
        sonuna kadar gider. Bunun icin aralara break koymak gerekir
         */

        switch (harf) {

            case 'S' :System.out.println("Sali");
            break;
            case 'P' :System.out.println("Pazartesi, Persembe, Pazar");
            break;
            case 'C' :System.out.println("Carsamba, Cuma, Cumartesi");
            break;
            default:System.out.println("Gecersiz harf");
        /*
        Sonuc olarak switch in okumasi ve yazmasi
        daha kolay
         */

        }

    }
}
