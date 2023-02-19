package day12_ForLoops;

import java.util.Scanner;

public class C06_ForLoopsQuestion10 {
    public static void main(String[] args) {
        /*
        Soru 10 (interview)- Kullanicidan bir String isteyin
        ve String’i tersine cevirip kaydedin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string girin");
        String input = scan.nextLine();
        String output="";
        for (int i = input.length()-1; i>=0; i--){
            output += input.charAt(i);
        }
        System.out.println(output);

    }
}
