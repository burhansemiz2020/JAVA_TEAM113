package day10_StringManipulation;

public class C06_lastIndexOf {
    public static void main(String[] args) {
        String str="Java bazen beyin yakar";
        System.out.println(str.indexOf("a"));//1
        System.out.println(str.lastIndexOf("a"));//3
        System.out.println(str.indexOf("a", 2));
        System.out.println(str.lastIndexOf("a", 19));//18
        System.out.println(str.indexOf("a", 4));//6
        System.out.println(str.lastIndexOf("a", 17));
        /*
        sondan basa bastan sona 6 da bulustular
         */
        System.out.println(str.indexOf('e'));//8 char da kabul eder
        System.out.println(str.lastIndexOf('e'));
        System.out.println(str.lastIndexOf("mustafa"));
        /*
        Verilen bir cumlede istenen bir String icin
        asagidakilerden uygun olani yazdirin
        1. aradiginiz kelime 1 kez kullanilmis
        2. aradiginiz kelime 1 den fazla kullanilmis
        4. aradiginiz kelime cumlede hic kullanilmamis
        */
        String cumle= "Yasasin java, iyi ki java ogreniyorum";
        String kelime= "java";

        int ilkIndex= cumle.indexOf(kelime);
        int lastIndex= cumle.lastIndexOf(kelime);

        if (ilkIndex == (-1)){
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        } else if (ilkIndex == lastIndex) {
            System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
        }else{
            System.out.println("aradiginiz kelime cumlede 1'den fazla kullanilmis");
        }

    }
}
