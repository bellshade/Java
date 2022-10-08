package learn.intermediate.JavaGeneric.AbstractGenericClass;

import learn.intermediate.JavaGeneric.AbstractGenericClass.model.Baju;
import learn.intermediate.JavaGeneric.AbstractGenericClass.model.Celana;

/**
 * Contoh Implementasi
 */
public class JavaAbstractGeneric {
    public static void main(String[] args) {

        MainGenericClass<Baju> pakaianBaju =
                new MainGenericClass("BA-01","Hitam",
                        new Baju(26,76,56));

        System.out.println(pakaianBaju.toString());
        // Pakaian{CodePakaian='BA-01', warnaPakaian='Hitam', sizeChart=Baju{panjangLengan=26cm, panjang=76cm, lebarDada=56cm}}


        MainGenericClass<Celana> pakaianCelana =
                new MainGenericClass("CE-09","Biru",
                        new Celana(70,78,100));

        System.out.println(pakaianCelana.toString());
        // Pakaian{CodePakaian='CE-09', warnaPakaian='Biru', sizeChart=Celana{lingkarPinggang=70cm, LingkarPaha=78cm, panjangCelana=100cm}}
    }
}
