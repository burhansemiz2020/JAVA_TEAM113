package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_Question_IstenmeyeniSil {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen String bir listede istenmeyen
        harf iceren elementleri silip, kalan
        kismini list olarak bize donduren
        bir method olusturun
         */
        List<String> liste = C04_ArrayListQuestion02KullaniciyaListeOlusturtmak.kullaniciyaListOlusturtma();
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kullanilmasini istemediginiz bir harf giriniz: ");
        String istenmeyenHarf = scan.nextLine().substring(0, 1);

        List<String> ayiklanmisList = istenmeyenHarfIcerenleriSil(liste, istenmeyenHarf);
        System.out.println(ayiklanmisList);


    }
    public static List<String> istenmeyenHarfIcerenleriSil(List<String> liste, String istenmeyenHarf) {
         //mesela listemiz ali, veli, ayse, fatma ve istenmeyen harf a
        //for loop ile elementleri ele alirken remove yaparsak
        //list in uzunlugu degisecegi icin sorun yasariz
        //o zaman farkli bir list olusturup, kontrolden gecenleri
        //yani silinmesi gerekmeyenleri yeni listeye kaydedelim
        List<String> kalanlarListesi = new ArrayList<>();
        for (int i = 0; i < liste.size(); i++) {
            if (!liste.get(i).contains(istenmeyenHarf)) {

                kalanlarListesi.add(liste.get(i));
            }
        }
        return kalanlarListesi;
        }




    }
