package day10_StringManipulation;

public class C03_startsWith_endsWith {
    public static void main(String[] args) {
        String str="Java harika";
        System.out.println(str.startsWith("java"));//false cunku kucuk j
        System.out.println(str.startsWith("Ja"));//true Ja ile baslar Java
        System.out.println(str.startsWith(str));//true cunku bu cumle Java
        // harika ile basladigi icin true olur yani "str == Java harika"
        /*
        contains ile starsWith arasindaki fark
        contains te icermeyi sorar
        startwith te baslangici sorar
         */
        System.out.println(str.startsWith(""));//cunku baslangic oncesinde
        // karakter arasi hiclik var
        System.out.println("==========");
        System.out.println(str.endsWith("a"));//true
        System.out.println(str.endsWith("ka"));//true
        System.out.println(str.endsWith("Java harika"));//true
        System.out.println(str.endsWith(""));//true hiclik
        System.out.println(str.endsWith(str.substring(str.length()-1)));
        /*
        Bu durumda en icerideki parantezden baslayacagiz
        length - 1 ==10 ve 10 en son karaktere isaret eder a
        str.substring 10 bize son harfi verir a
        str.endsWith a ile biter? evet a ile biter true
         */
    }
}
