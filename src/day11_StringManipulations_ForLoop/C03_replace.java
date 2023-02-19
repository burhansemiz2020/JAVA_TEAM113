package day11_StringManipulations_ForLoop;

public class C03_replace {
    public static void main(String[] args) {
        String str="Java candir";
        System.out.println(str.replace('J', 'H'));//Hava candir
        System.out.println(str.replace("a", ""));//Jv cndir
        System.out.println(str.replace("Java", "x"));//x candir
        System.out.println(str.replace("v", "yayaya"));//Jayayayaa candir
        System.out.println(str.replace("Java", "1236"));//1236 candir
        //str.replace("va", "lala");//yapilan degisiklik bu satir icindir
        //yazdirilmadigi icin gormeyiz atama yapilmadigi icin de kalici olmaz.

        //str daki space leri yok edin
        str=str.replace(" ", "");
        System.out.println(str);//str imiz artik Javacandir oldu


        //replaceFirst ORNEGI
        System.out.println(str.replaceFirst("a", ""));//Jvacandir
        System.out.println(str.replace("a", ""));//Jvcndir

        //String de method ile yapilan degisiklikler kalici olmaz
        //les changements sur string ne peuvent pas etre permanent.

        System.out.println(str.replaceFirst("c", "K"));
    }
}
