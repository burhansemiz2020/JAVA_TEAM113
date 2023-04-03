package day34_abstractClasses;

public class DGocmenKuslar extends BKuslar{

    /*
    Sadece ayirimi belirtmek icin abstract olmayan classlara CONCRETE class denilir.

    KURALLAR:
    1- abstract bir class:
        parwenti olan bir abstract classtaki abstract metotlari
        implement etmek zorunda degildir.
        isterse implement edip bodyli yani concrete hale getirir.
        isterse yok sayar.
    2- abstract bir silsileden sonra gelen
       ilk concrete class parent veya grandParents olan
       abstract classlarda concrete yapilmayan tum abstract
       classlari IMPLEMENT ETMEK ZORUNDADIR

     */


    @Override
    public void hareket() {

    }

    @Override
    public void beslenme() {

    }

    @Override
    public void omur() {

    }
}
