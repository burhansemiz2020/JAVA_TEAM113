package day09_switch_stringManipulation;

import java.util.Scanner;

public class C02_switch {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Ay numarasini girin");
        int ayNo= scan.nextInt();

        switch (ayNo){
            case 1:
            case 2:
            case 3:
                System.out.println("Kis");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Ilkbahar");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Yaz");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Yanlis giris");








        }
    }
}
