package DrugiDeoOOP.Ponedeljak2309.Domaci;

import java.util.ArrayList;

public class OdbojkaskiKlub extends Klub{
    public OdbojkaskiKlub(String naziv, String grad, ArrayList<Igrac> igraci) {
        super(naziv, grad, igraci);
    }
    public String odbrambeniAs() {
        Igrac odbrambeni = null;
        int maxPoena = 0;
        for (Igrac igrac : getIgraci()) {
            if (igrac.getGodineIskustva() < 3 && igrac.getBrojPoena() > maxPoena) {
                maxPoena = igrac.getBrojPoena();
                odbrambeni = igrac;
            }
        }
        return odbrambeni.getIme();
        //return odbrambeni != null ? odbrambeni.getIme() : "Nema odbrambenog asa.";
    }

    @Override
    public double vrednostTima() {
        double vrednost = 0;
        for (Igrac igrac : getIgraci()) {
            vrednost += igrac.getBrojPoena() * 100;
        }
        return vrednost;
    }
}
