package day09_switch_stringManipulation;

public class C05_concat {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Candir";
        String str3=" ";

        //Yukaridaki varaibler lari kullanarak
        //"Java Candir" yazdir

        System.out.println(str1 + str3 + str2);//buna concatenation demistik

        //string classinda bunu yapan bir method var

        System.out.println(str1.concat(str3).concat(str2));//bu ir hazir method
    }
}
