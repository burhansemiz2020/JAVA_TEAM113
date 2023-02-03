package day05_IncrementDecrementConcatenation;

public class C04_StringveIntegerGecisler {
    public static void main(String[] args) {
        String s1="423";
        //s1'i int e cevirmek istersek
        int sayi=Integer.parseInt(s1);
        System.out.println(sayi++);//423 ama bundan sonraki sout larda 424 olacak
        int a = 20;
        int b = 40;
        //bu iki sayiyi kullanarak 2040 yazdirin
        System.out.println(a+""+b);//a 20 bosluk 40
        //System.out.println(""+a+b); bu da ayni sonucu verir
        //string strong dur kendine benzetir
    }
}
