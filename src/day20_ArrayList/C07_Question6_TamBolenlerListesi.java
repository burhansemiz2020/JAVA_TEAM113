package day20_ArrayList;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_Question6_TamBolenlerListesi {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan main methodda
        pozitif bir tamsayi alip,
        o tamsayiyi tam bolebilen tum pozitif
        tamsayilari bir liste olarak bize
        donduren bir method olusturun.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tamsayi giriniz: ");
        int girilenSayi = scan.nextInt();

        List<Integer> tamBolenler = pozitifBolenleriListele(girilenSayi);

        System.out.println(girilenSayi + " sayisinin tam bolenleri: " + tamBolenler);
    }
    public static List<Integer> pozitifBolenleriListele(int verilenSayi) {
        List<Integer> pozitifBolenlerListesi = new ArrayList<Integer>();
        for (int i = 1; i <= verilenSayi; i++) {
            if (verilenSayi % i == 0) {
                pozitifBolenlerListesi.add(i);
            }
        }
        return pozitifBolenlerListesi;
        /*
        Lutfen pozitif bir tamsayi giriniz: 45
        45 sayisinin tam bolenleri: [1, 3, 5, 9, 15, 45]
         */


    }
}
