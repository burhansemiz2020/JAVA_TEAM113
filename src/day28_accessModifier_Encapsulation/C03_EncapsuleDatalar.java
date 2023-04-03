package day28_accessModifier_Encapsulation;

public class C03_EncapsuleDatalar {
    static private String isim="Yildiz Pazarlama";

    private int satisTutari;
    public int toplamSatis;

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatis+=satisTutari;
    }

    public static String getIsim() {
        return isim;

    }
}
