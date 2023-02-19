package day11_StringManipulations_ForLoop;

public class C05_replaceAll {
    public static void main(String[] args) {

        String str="   J&ava54 C+an01dir,,,,         ";
        //str i Java candir haline getiriniz

        str = str.trim();

        str=str.replaceAll("\\d", "");
        str=str.replaceAll(" ", "5");
        str=str.replaceAll("\\W", "");
        str=str.replaceAll("5", " ");

        System.out.println(str);
    }
}
