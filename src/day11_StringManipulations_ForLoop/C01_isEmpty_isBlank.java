package day11_StringManipulations_ForLoop;

public class C01_isEmpty_isBlank {
    public static void main(String[] args) {
        String str = "Java candir";
        System.out.println(str.isEmpty());//bos degil false
        System.out.println(str.isBlank());//bosluklardan olusmuyor false
        str="   ";

        System.out.println(str.isEmpty());//false
        System.out.println(str.length());//3
        System.out.println(str.isBlank());//true

        str="";
        System.out.println(str.isEmpty());//true
        System.out.println(str.length());//0
        System.out.println(str.isBlank());//true
        /*
        icinde hic bisey yoksa empty
        icinde yazi yok space varsa blank
        son ornekte bi sey yok gibi ama
        0 var o yuzden true verdi
         */

    }
}
