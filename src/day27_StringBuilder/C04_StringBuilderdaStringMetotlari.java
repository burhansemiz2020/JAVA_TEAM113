package day27_StringBuilder;

public class C04_StringBuilderdaStringMetotlari {
    public static void main(String[] args) {
        /*
        StringBuilder Class inda olmayip string classinda olan metotlari
        kullanmak istersek;
        sb.toString() kullanarak stringbuilder i once stringe cevirir
        sonra istedigimiz string metotlarini kullaniriz.

        Bu konuda dikkat etmemiz gereken konu String donduren metotlar
        veya string classindan kullanacagimiz methodlar kalici degisiklik
        YAPMAZ
         */
        StringBuilder sb1=new StringBuilder("Java Candir.");
        StringBuilder sb2=new StringBuilder("Java Candir.");
        sb1.substring(5);
        System.out.println(sb1);//Java Candir
        //sb1=sb1.substring(5);
        System.out.println(sb1.compareTo(sb2));
        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString()));
        sb1.subSequence(3,6);
        System.out.println(sb1);//Java

    }
}
