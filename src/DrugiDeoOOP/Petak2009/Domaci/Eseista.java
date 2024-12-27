package DrugiDeoOOP.Petak2009.Domaci;

import java.util.ArrayList;

public class Eseista extends Pisac{
    public Eseista(String ime, int godinaRodjenja, ArrayList<Knjiga> knjige) {
        super(ime, godinaRodjenja, knjige);
    }
    /*
    Napraviti klasu Esesista koja nasledjuje klasu Pisac i dodati metodu:
kratkiEseji() -> vraća broj eseja (knjiga) koji imaju manje od 50 strana.
     */
    public int kratkiEseji() {
        int brojac = 0;
        for (Knjiga k : getKnjige()) {
            if (k.getBrojStrana() < 50) {
                brojac++;
            }
        }
        return brojac;
    }
}
