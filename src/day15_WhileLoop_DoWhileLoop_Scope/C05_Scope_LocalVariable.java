package day15_WhileLoop_DoWhileLoop_Scope;

public class C05_Scope_LocalVariable {
    public static void main(String[] args) {
        String isim="Ali Can";
        int sayi;
        /*
        ***LOCAL VARIABLES***
        1- bir metot icerisinde olusturulan variable in scope u o metottur.
           baska bir metottan kullanilamaz.
           bu variable lara local variable denir.
        2- Her ne kadar bir metot icinde olsalarda looplarinda ayri bir scope u vardir
        loop icerisinde olusturulan variable lar loop disinda kullanilamazlar.
        local in de local i vardir. Local scope body ile sinirli asagidaki for kismi
        buna loop locali de denilmektedir. Looplarin ayri scope u vardir
        3- Local variable lari deger atamadan olusturabiliriz ama
           deger atamadan kullanamayiz


         */

        //sayi++;//asagidaki sayi variable i ni da burada kabul etmiyor
        /*
        YANI metot icinde olusturulan variable kendi scope u icinde calisir
         */
        for (int i = 0; i <10 ; i++) {
            int j= i+1;

        }
        //System.out.println(i);
        //System.out.println(j);

    }
    public static void baskaMetot(){
        //System.out.println(isim);//burda yukaridaki Ali Can scope unu kullanamayiz
        int sayi=5;
    }
}
