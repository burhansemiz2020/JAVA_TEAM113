package day22_Constructor;

public class C05_DoktorRunner {
    public static void main(String[] args) {

            C04_Doktor doktor1 = new C04_Doktor();
            doktor1.isim= "Kemal";
            doktor1.yas=40;
            System.out.println(doktor1.soyisim); // S atanmamis
            System.out.println(doktor1.yas); // 40
            C04_Doktor doktor2 = new C04_Doktor();
            C04_Doktor doktor3;
        //System.out.println(doktor3.yas);
        /*
        Constructor calismadan vir obje olusturulup deger
        atamasi mumkun degildir.
         */
        System.out.println("Variablea atanmayan obje icin yas : " +new C04_Doktor().yas);
    }
}
