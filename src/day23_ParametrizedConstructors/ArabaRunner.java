package day23_ParametrizedConstructors;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba araba1=new Araba();
        System.out.println(araba1);
        Araba araba2=new Araba(10000,"BMW");
        System.out.println(araba2);
        Araba araba3=new Araba(2020,"renault", "megane", true, 10000);
        System.out.println(araba3);

    }
}
