package day09_switch_stringManipulation;

public class C04_equalsMethod {
    public static void main(String[] args) {
        String str1="Java";
        String str2="JAVA";
        String str3="java";
        String str4="JaVa";

        System.out.println(str1.equals(str2));//false yazdirir
        System.out.println(str3.equals(str4));//false yazdirir

        //eger buyuk kucuk harfe dikkat etmeden stringleri karsilastirmak isterseniz

        System.out.println(str1.equalsIgnoreCase(str2));//true yazdirir
        System.out.println(str3.equalsIgnoreCase(str4));//true yazdirir

        String str5="Java";
        String str6="Ja";
        String str7="va";
        String str8=str6.concat(str7);
        System.out.println(str8);
        System.out.println(str1==str5);
        System.out.println(str1==str8);
        /*
        == ile stringleri karsilastirirsak
        hem metin degerine hem de referanslarina
        bakar equals ile stringleri karsilastirirsak
        sadece metin degerlerine bakar.

        == ile strinlgleri arsilastirdigimizda
        bekledigimizden farkli sonuclar alabilriz
        bu yuzden iki stringi karsilastiracaksak
        == degil equals kullancagiz

        Java da bir tane stack memory vardi.
        stack memory de primitive data lar ve degerleri
        ile nonprimitivelerin referanslari bulunur

        yukarida str8 i olustururken str8 in referansi stack memory de
        java degil ja ve va seklinde ayri ayridir.
        ancak bunun ileride istisnalari vardir.
        bu nedenle string icin simdilik == kullanmayacagiz.
        equals metne bakar bunu kullancagiz
        ozellikle ignorecase direk metne bakar
        burda kucuk buyuk farketmez
         */
    }
}
