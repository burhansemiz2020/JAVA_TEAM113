package day20_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class deneme {
    public static ArrayList<String> isimleriAl() {
        ArrayList<String> isimler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String isim;
        System.out.println("Lutfen isimleri girin (Q tuşuna basarak cikis yapin):");
        while (true) {
            isim = scanner.nextLine();
            if (isim.equalsIgnoreCase("Q")) {
                break;
            }
            isimler.add(isim);
        }
        return isimler;
    }

    public static void main(String[] args) {
        ArrayList<String> isimler = isimleriAl();
        System.out.println("Girilen isimler:");
        for (String isim : isimler) {
            System.out.println(isim);
        }
    }

}

