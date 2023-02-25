package day15_WhileLoop_DoWhileLoop_Scope;

public class C06_Scope_ClassLevelVariable {
    /*

    Bir class icinde tum metotlarin erisebilecegi
    variable lar istenirse Class Level da(Class in
    icinde ama metotlarin disinda) olusturulmalidir.
    1- Class level da olusturulan variable larin
    scope u tum class tir. Ama static olup olmamasina gore degisir
    2- Class level da olusturulan variable lar deger atanmasa
    bile Java onlar icin tanimlanmis DEFAULT degerler atar.
    3- Class level da olusturulan variable lar static veya
    instance (static olmayan) olabilir
    4- static olarak tanimlanan variabler lar tum method larda
    kullanilabilirler.
    5- methot static ise, icine static olmayan hicbir sey almaz.

     */
    static int sayi = 10;
    static String isim;
    static boolean bl;
    static char chr;
    static int in1;
    int in2;
    boolean bl2;
    // deger atamasi yapmasak ta sorun yok local de
    public static void main(String[] args) {
        System.out.println(sayi);
        System.out.println("String " +isim); //null
        System.out.println("Boolean " + bl); //false
        System.out.println("Char " + chr); //' ' hiclik
        System.out.println("Int " +in1); //sayisal turler icin 0
        // burda deger atamasak ta yazdirabiliyoruz
        System.out.println();
        staticMethod();
        //staticOlmayanMethod()//bunu kabul etmiyor



        /*
        bunu calistirdigimizda asagidami metotlar calismaz cunku
        call yapilmadi bunlar main metot icine call yapilmaliydi
         */
    }

    public static void staticMethod(){
        sayi++;
        System.out.println(sayi);
        System.out.println(chr);
        //System.out.println(in2);//bu variable yukarda static olmadigi icin burada kullanilmaz//instance
        //System.out.println(bl2);//bu variable yukarda static olmadigi icin burada kullanilmaz/instance
    }

    public void staticOlmayanMetot(){
        sayi--;
        System.out.println(sayi);
        System.out.println(bl);//statik olmayan metotta statik olan variable lari kullanabiliriz
        System.out.println(in2);//instance
        System.out.println(bl2);//instance
    }

}
