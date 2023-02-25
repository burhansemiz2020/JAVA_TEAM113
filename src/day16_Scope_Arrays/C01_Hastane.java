package day16_Scope_Arrays;

public class C01_Hastane {
    public static void main(String[] args) {
        ADoktor dok1=new ADoktor();
        System.out.println(dok1.askerlikYaptimi);
        dok1.isim="Kemal";
        dok1.soyIsim="Yilmaz";
        dok1.dogumYili=1980;

        System.out.println(dok1.isim);

        ADoktor dok2=new ADoktor();
        System.out.println(dok2.isim);//instance variable sdece kendini baglar null
        dok2.soyIsim="Celik";
        System.out.println(dok2.soyIsim);
        System.out.println(dok1);
        /*
        dok1 nin data turu ADoktor dur. string gibi ama biz olusturduk.
        dok1 nonprimitive bir data turu olunca onun referansini yazdirir
         */
        System.out.println(dok1.fakulte);
        System.out.println(dok2.fakulte);//Static member 'day16_Scope_Arrays.ADoktor.
        // fakulte' accessed via instance reference
        dok1.isim="Burcu";
        System.out.println(dok2.isim);
        dok1.fakulte="Tip Fakultesi";
        System.out.println(dok2.fakulte);//tip fakultesi olur
        /*
        statik bir variable in degeri degisirse digerlerini de etkiler
         */
        ADoktor dok3=new ADoktor();
        System.out.println(dok3.dogumYili);//0
        System.out.println(dok3.fakulte);//doktor 3 ile ilgili hic bir atama yapmasakta
        //tip fakultesi yazdirdi
        System.out.println(ADoktor.fakulte);//static variable lar icin tavsiye edilen
        //erisim yontemi class ismi . statik uye ismi seklinde olur
        //Bu kullanim bicimine statik ontem denir ve sarilik kalkar
    }
}
