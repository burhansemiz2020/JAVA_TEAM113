package day15_WhileLoop_DoWhileLoop_Scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
        While loop ta bitis sarti kontrolu
        her zaman body den bir fazla calisir
        while loop ta kullanicidan alacagimiz
        degerlere once bizim deger atamamiz
        gerekir. Bu da bazen hatalara neden olur
         */
        int sayi=-10;
        int toplam=0;
        while(sayi>0){
            toplam+= sayi*sayi;
            sayi--;
        }
        System.out.println("while toplam : " +  toplam);
        sayi=-10;
        toplam=0;

        do{//burada ilk etapta kontrol olmuyor while gibi bu nedenle her turlu calisiyor
            toplam+=sayi*sayi;
            sayi--;
        }while (sayi>0);
        System.out.println("do while toplam: " + toplam);
    }
}
