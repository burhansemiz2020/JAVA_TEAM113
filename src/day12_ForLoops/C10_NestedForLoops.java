package day12_ForLoops;

public class C10_NestedForLoops {
    public static void main(String[] args) {
       /*
        *
        * *
        * * *
        * * * *
        */
        int satir=4;
        
        for (int i = 1; i<=4; i++){//dis dongu
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
    }
}
