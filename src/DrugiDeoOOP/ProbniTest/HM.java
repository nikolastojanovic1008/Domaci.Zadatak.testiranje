package DrugiDeoOOP.ProbniTest;

import java.util.ArrayList;

public class HM extends Prodavnica {
    public HM(int brojZaposlenih, ArrayList<Artikl> artikli) {
        super(brojZaposlenih, artikli);
    }
    /*
    Napraviti klasu HM koji nasledjuje klasu Prodavnica I oni svoje zaposlene placaju 150.
     */

    @Override
    public double ukupnaZarada() {
        double zarada = 0;
        for (Artikl artikl : getArtikli()) {
            zarada += artikl.getCena();
        }
        zarada = zarada - (getBrojZaposlenih() * 150);
        return zarada;
    }

}
