package day27_StringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java Candir.");
        System.out.println(sb1.delete(4, 5));//aradaki boslugu sildi ve StringBuilderin yeni halini getirdi.
        System.out.println(sb1);
        System.out.println(sb1.deleteCharAt(9));
        System.out.println(sb1);
        System.out.println(sb1.insert(9, "r"));
        System.out.println(sb1);
        System.out.println(sb1.insert(4, " "));
        System.out.println(sb1);
        String str=" can bize gelecekmis";
        sb1.insert(11, str, 0,5);//Java Candir can
        System.out.println(sb1);
        sb1.replace(12, 15, "CAN.");
        System.out.println(sb1);//Java Candir CAN. .
        System.out.println(sb1.replace(15, 17, ""));

    }
}
