package DrugiDeoOOP.ProbniTest;

import java.util.ArrayList;

public class SportVision extends Prodavnica {
    /*
    Napraviti klasu SportVision I on za black Friday daje popust od 30% na sve artikle.
     */
    public SportVision(int brojZaposlenih, ArrayList<Artikl> artikli) {
        super(brojZaposlenih, artikli);
    }

    @Override
    public void blackFriday() {
        for (Artikl artikl : getArtikli()) {
            artikl.setCena(artikl.getCena() * 0.7);
        }
    }
}

