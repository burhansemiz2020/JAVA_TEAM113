package day24_StaticKeyword_StaticBlocks;

import java.util.Arrays;

public class C03_PassByValue {
    public static void main(String[] args) {
        int[]arr={3,4,5};
        elementleriArttir(arr, 4);
        System.out.println("Method call'dan sonra arr : " +Arrays.toString(arr));//method'da array : [7, 8, 9]

    }
    public static void elementleriArttir(int[]arr, int artisMiktari){
        //arr=new int[3];//eger bu eklemeyi yaparsak main methodda 7 8 9 olmaz 3 4 5 yerinde kalir.
        //yeni araba gibi dusun yeni araba varsa izim arabamiz degismez
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=artisMiktari;

        }
        System.out.println("method'da array : "+ Arrays.toString(arr));//[7, 8, 9]

    }
}
