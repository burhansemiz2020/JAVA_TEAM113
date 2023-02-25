package day14_MethodOverloading_WhileLoop;

public class C03_MethodOverLoading {
    public static void main(String[] args) {
        /*
        Bir class ta ayni isme sahip
        farkli islem yapan method'lar
        olabilir. Java bu methodlar
        icinden hangisinin caliscagina
        parametrelerden karar verir.
        Bu isleme bir class da ismi
        ayni, parametreleri farkli
        methodlar olmasina;
        Method Overloading denir.
         */

        String str = "Bu is olacak";
        System.out.println(str.replace("Bu is", "java guzel"));
        System.out.println(str.replace('u', 'e'));
    }
}
