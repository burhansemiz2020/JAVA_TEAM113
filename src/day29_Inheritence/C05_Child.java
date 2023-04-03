package day29_Inheritence;

public class C05_Child extends C03_ParentClass {
    int c = 20;
    int a;

    String s = "Child class";
    String m;

    public void method1() {

        System.out.println("child class method1");
    }

    public static void main(String[] args) {
        /*
        chhild class tan bir obje olusturup ozelliklerinui yazdiralim
         */
        C05_Child obj=new C05_Child();
        System.out.println(obj.a);// deger atanmadigi icin deger default 0
        System.out.println(obj.c);//20
        System.out.println(obj.b);//parent class ta b var degeri 0 default
        System.out.println(obj.m);//null default string degeri
        System.out.println(obj.s);//Child class
        System.out.println(obj.t);//null default

        obj.method1();//child class method1
        obj.method2();//baba evinde metot 2 var Parent Method12 calisti

    }
}
