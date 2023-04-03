package day24_StaticKeyword_StaticBlocks;

public class C01_StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main method calisti");
        System.out.println("=======================");
        C01_StaticBlock obj1=new C01_StaticBlock();
    }
    static {
        /*
        static blocklar class ilk calismaya baladiginda calisir
        genel olarak class icin gerekli on ayarlamalari yapmak icin kullanilir.
        birden fazla static block varsa yukaridan asagi dogru sirali olarak calisir.
         */
        System.out.println("Static block calisti");
    }
    {
        System.out.println("Static olmayan Block calisti");
    }
}
