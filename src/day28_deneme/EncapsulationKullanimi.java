        package day28_deneme;

        import day28_accessModifier_Encapsulation.C03_EncapsuleDatalar;

        public class EncapsulationKullanimi {
            public static void main(String[] args) {

                System.out.println(C03_EncapsuleDatalar.getIsim());
                C03_EncapsuleDatalar obj=new C03_EncapsuleDatalar();
                obj.setSatisTutari(100);
                obj.setSatisTutari(200);
                obj.setSatisTutari(300);
                System.out.println("Toplam Satis : " +obj.toplamSatis);



            }
        }
        /*
        C03_EncapsuleDatalar classindaki isim variableinin
        degeri gorunsun ama degistirilemezin
        satisTutari ise deger girilebilsin ama ama girilen degerler sonradan okunamasin

        Eger bir variable icin read veya write ozelliklerinin birbirinden ayrilmasi isteniyorsa
        onceklikle access modifier ile kimsenin ulasammamasini saglayin

        private yaparak kimsenin ulasamayacagini garantiye aldiktan sonra
        READ yetkisi vermek istediklerimiz icin getter () metodu
        WRITE yetkisi vermek istediklerimiz icin setter () metodu
         */