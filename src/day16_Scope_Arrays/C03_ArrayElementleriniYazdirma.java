package day16_Scope_Arrays;

import java.util.Arrays;

public class C03_ArrayElementleriniYazdirma {
    public static void main(String[] args) {
        int [] arr={3,5,6,7,8,1,2,};
        //tum arrayi yazdirma
        System.out.println(Arrays.toString(arr));//==> bu bir array
        //Array in tum elementlerini yan yana aralarinda bir bosluk olacak sekilde yazdirin
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " , ");//==>bu arrayin elementleri

        }




    }
}
