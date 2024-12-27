package DrugiDeoOOP.Petak2009.Domaci;

import java.util.ArrayList;

public class Pesnik extends Pisac {
    public Pesnik(String ime, int godinaRodjenja, ArrayList<Knjiga> knjige) {
        super(ime, godinaRodjenja, knjige);
    }

    /*
    Napraviti klasu Pesnik koji nasledjuje klasu Pisac i ima metodu:
brojZbirki() -> koja vraća broj knjiga koje imaju manje od 100 strana (pretpostavljamo da su zbirke poezije kraće).
     */
    public int brojZbirki() {
        int brojac = 0;
        for (Knjiga k : getKnjige()) {
            if (k.getBrojStrana() < 100) {
                brojac++;
            }
        }
        return brojac;
    }
}
