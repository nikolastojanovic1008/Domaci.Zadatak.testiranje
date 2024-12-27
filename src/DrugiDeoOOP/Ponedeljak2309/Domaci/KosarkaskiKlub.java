package DrugiDeoOOP.Ponedeljak2309.Domaci;

import java.util.ArrayList;

public class KosarkaskiKlub extends Klub{
    public KosarkaskiKlub(String naziv, String grad, ArrayList<Igrac> igraci) {
        super(naziv, grad, igraci);
    }
    /*public String sampionTima() {
        for (Igrac igrac : getIgraci()) {
            if (igrac.getBrojPoena() > 1000) {
                return igrac.getIme();
            }
        }
        return "Nema igrača sa više od 1000 poena.";
    }*/
    public ArrayList<String> sampionTima() {
        ArrayList<String> sampioni = new ArrayList<>();
        for (Igrac igrac : getIgraci()) {
            if (igrac.getBrojPoena() > 1000) {
                sampioni.add(igrac.getIme());
            }
        }
        return sampioni;
    }

    @Override
    public double vrednostTima() {
        double vrednost = 0;
        for (Igrac igrac : getIgraci()) {
            vrednost += igrac.getBrojPoena() * 50;
        }
        return vrednost;
    }
}
