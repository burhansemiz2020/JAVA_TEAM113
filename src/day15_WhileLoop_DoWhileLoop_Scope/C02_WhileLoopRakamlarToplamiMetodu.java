package day15_WhileLoop_DoWhileLoop_Scope;


public class C02_WhileLoopRakamlarToplamiMetodu {
    /*
       Verilen bir poztif tam sayinin rakamlar
       toplamini bize donduren bir metot
       olusturun
        */


    public static int rakamalarToplaminiBul(int verilenSayi){
        int sayi = verilenSayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        
        int basamakSayisi=(sayi+"").length();
        for (int i = 1; i < basamakSayisi ; i++) {
            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;
        }
    return rakamlarToplami;
    //Bu metot da yazdirma olmaz ama diger class altinda main metotta calisir
    }
        


    }


