package DrugiDeoOOP.Petak2009.Domaci;

import java.util.ArrayList;

public class Romanopisac extends Pisac {
    public Romanopisac(String ime, int godinaRodjenja, ArrayList<Knjiga> knjige) {
        super(ime, godinaRodjenja, knjige);
    }

    /*
    Napraviti klasu Romanopisac koji nasledjuje klasu Pisac i specifična metoda je:
dugometrazniRoman() -> vraća "dugometražni roman" ako knjiga ima više od 500 strana.
     */
    public String dugometrazniRoman() {
        for (Knjiga k : getKnjige()) {
            if (k.getBrojStrana() > 500) {
                return "Dugometražni roman: " + k.getNaslov();
            }
        }
        return "NIJE dugometražnih romana";
    }
}
