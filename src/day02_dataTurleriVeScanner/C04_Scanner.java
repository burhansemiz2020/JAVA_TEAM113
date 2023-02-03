package day02_dataTurleriVeScanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
                    //1. adim scanner objesini olusuturn
        Scanner scan=new Scanner(System.in);
                    //2. adim kullaniciya ne istediginizi soyleyin
        System.out.println("Lutfen Isminizi Giriniz");
                    //3. adim girilen bilgiyi icine koyabilecegimiz bir variable olusturun
                    //olusuturulan scanner objesi ile uygun metodu kullanarak bilgiyi alin
        String kullaniciIsmi=scan.next();//. yazinca sonuna bircok islev cikiyor
                                        // onlardan secim yapabilirsiniz

                                        /* Mustafa ismini yazana kadar konsolun
                                        slunda kirmizi uyari isigi yaniyordu
                                        ismi girimci sondu
                                         */
    }
}
