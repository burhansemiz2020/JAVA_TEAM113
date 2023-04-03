package day30_Inheritence;

public class BToyotaClass extends Araba{
    String marka="Toyota";
    String aku="Inci aku";
    String lastik="Bridgestone";

    public void motor(){
        System.out.println("Toyotalar cevreci Toyota motorlari kullanirlar.");
    }
    public void guvenlik(){
        System.out.println("Toyota araclar ekstra guvenlik onlemleri barindirir.");
    }
}
