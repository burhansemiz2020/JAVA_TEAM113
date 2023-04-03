package day30_Inheritence;

public class CToyotaCorolla extends BToyotaClass{
    String lastik="Lassa 205-55-15";
    String model="Corolla";
    String yakit="Corolla dizel, benzinli ve elektrikli olabilir";

    public void motor(){
        System.out.println("Corolla araclar Turkiye de uretilen motor kullanir");
    }
    public void uretimYeri(){
        System.out.println("Corolla araclar turliyede uretilir");
    }
    public static void main(String[] args) {
        CToyotaCorolla corolla=new CToyotaCorolla();
        System.out.println(corolla.lastik);//Corolla classini alir en guncel olan en child
        // en genel olan en parent da Lassa 205-55-15
        System.out.println(corolla.model);//Corolla
        System.out.println(corolla.yakit);//Corolla  Corolla dizel, benzinli ve elektrikli olabilir
        corolla.motor();//corolla : Corolla araclar Turkiye de uretilen motor kullanir
        corolla.uretimYeri();//corolla: Corolla araclar turliyede uretilir
        System.out.println(corolla.marka);//parent tan kullanir Toyota
        System.out.println(corolla.aku);//Toyota
        corolla.guvenlik();//Toyota
        System.out.println(corolla.vites);//Araba

    }
}
