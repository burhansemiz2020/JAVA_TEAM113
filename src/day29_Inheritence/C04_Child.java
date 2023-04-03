package day29_Inheritence;

import day22_Constructor.C04_Doktor;

public class C04_Child extends C03_ParentClass {
    int c = 20;
    int a;

    String s = "Child class";
    String m;

    public void method1() {
        System.out.println("child class method1");
    }

    public static void main(String[] args) {
        C03_ParentClass objC03=new C03_ParentClass();
        objC03.a=20;
        objC03.b=22;
        objC03.s="p";
        objC03.t="k";

        objC03.method1();
        objC03.method2();
        C04_Child objC04 = new C04_Child();
        objC04.a=50;
        objC04.c=20;
        objC04.s="u";
        objC04.m="l";
        objC04.method1();

        /*
        C04 classini c03 e child yapinca child class ta olmayip parent classta olan
        b , t ve metot2 ozellik olarak objC04 e eklendi
         */
        objC04.b=8;
        objC04.t="y";
        objC04.method2();
        /*
        Java da parernt class lar child edilmez child class lar parent edinir.

        Bir classin baska bir class taki TUM OZELLIKLERI otomatik olarak edinmesini istiyorsak
        classimizi extends keyword ile o classa child yapariz.(Size baba diyebilir miyim?)
         */

    }
}
