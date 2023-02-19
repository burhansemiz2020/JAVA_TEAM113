package day11_StringManipulations_ForLoop;

public class C09_forLoop {
    public static void main(String[] args) {

        /*
        50 den baslayip , 100 e kadar 100 dahil
        sayilari yan yana aralarinda bir bosluk
        olacak sekilde yazdirin.
         */
        for (int i = 50; i<=100 ; i++){
            System.out.print(i + " ");//alt satira gecmemesi icin print yaptik ln i cikardik
        }
        System.out.println("");//print ile yazdirdigimizdan dolayi onceki loop un devami olmamasi
        //icin bir bos sout attik
        /*
        50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100

         */

        /*
        3 basamakli sayilardan 23 ile bolunebilenleri
        yan yana aralarinda bir bosluk birakarak yaziralim
         */
        for (int i = 100; i<=999 ; i++){
            if (i%23==0){
                System.out.print(i + " ");
                /*
                115 138 161 184 207 230 253 276 299 322 345 368 391 414 437 460 483 506 529 552 575 598 621 644 667 690 713 736 759 782 805 828 851 874 897 920 943 966 989

                 */
            }
        }

        System.out.println("");

        /*
        20 den baslayip 7 ser artarak
        100'e kadar yazdirin
        100 yazdirmamiz gerekiyorsa
        yazdirin ama 100 u gecmeyin //7 ile modulus yapmicaz
         */
        for (int i = 20; i<=100; i+=7){
            System.out.print(i + " ");
            /*
            20 27 34 41 48 55 62 69 76 83 90 97

             */

        }
        System.out.println("");

        /*
        100 den baslayarak 1 e kadar sinirlar dahil
        7 ile bolunebilen sayilari yazdirin
         */
        for (int i = 100; i>=1; i--){
            if (i%7==0){
                System.out.print(i + " ");
                /*
                98 91 84 77 70 63 56 49 42 35 28 21 14 7
                 */
            }
        }

    }
}
