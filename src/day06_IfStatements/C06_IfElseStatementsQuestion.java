package day06_IfStatements;

import java.util.Scanner;

public class C06_IfElseStatementsQuestion {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise
        ”Emekli olabilirsin" yazdirin, yoksa
         emekli olmasi icin calismasi gereken
         yil sayisini yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Yasinizi Giriniz");
        double yas= scan.nextDouble();
        if(yas>=65){
            System.out.println("Emekli olabilirsiniz");
        }

        else{
            System.out.println("Emekli olabilmek icin daha " + (65-yas)+ "\t yil calismalisin");
        }

    }
}
