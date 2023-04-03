package day30_Inheritence;

public class EChild extends DParentAccessModifier{
    static int sayiChildStatic;

    public static void main(String[] args) {
        /*
        Inheritence da private class uyeleri inherit edilemez.
         */

        EChild eChild = new EChild();
        System.out.println(eChild.sayiDefault);
        System.out.println(eChild.sayiProtected);
        System.out.println(eChild.sayiPublic);
        /*
        Icinde bulundugumuz classdaki static variabler lar
        obje uzerinden otomatik gelmezler ama manuel
        yazdigimizda Java kabullenir.
         */
        System.out.println(eChild.sayiChildStatic);
        //Ancak parent Class daki static variable lar
        //obje uzerinden kullanilamaz
        //eChild.sayiStaticPrivate;
        System.out.println(DParentAccessModifier.sayiStaticProtected);
        /*
        Bu kullanim icin inheritence a ihtiyac yok
        herhangi bir class daki statik variablei
        classIsmi.staticVariableIsmi seklinde kullanabiliriz.
        INHERITENCE A EN UYGUN ACCESS MODIFIER PROTECTED DIR.
        Eger bir classin icindeki bazi ozellikleri child classin kullanmasini
        engellemek istersek PRIVATE yapariz.
         */

    }
}
