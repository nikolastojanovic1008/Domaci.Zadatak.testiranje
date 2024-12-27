package DrugiDeoOOP.ProbniTest;

import java.util.ArrayList;

public class Zara extends Prodavnica {
    public Zara(int brojZaposlenih, ArrayList<Artikl> artikli) {
        super(brojZaposlenih, artikli);
    }

    @Override
    public double ukupnaZarada() {
        double zarada = 0;
        for (Artikl artikl : getArtikli()) {
            zarada += artikl.getCena();
        }
        zarada = zarada - (getBrojZaposlenih() * 200);
        return zarada;
    }
}
