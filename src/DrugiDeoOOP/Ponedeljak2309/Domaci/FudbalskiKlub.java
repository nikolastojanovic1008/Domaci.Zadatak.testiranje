package DrugiDeoOOP.Ponedeljak2309.Domaci;

import java.util.ArrayList;

public class FudbalskiKlub extends Klub{
    public FudbalskiKlub(String naziv, String grad, ArrayList<Igrac> igraci) {
        super(naziv, grad, igraci);
    }
    public String najboljiStrelac() {
        Igrac najbolji = null;
        int maxPoena = 0;
        for (Igrac igrac : getIgraci()) {
            if (igrac.getBrojPoena() > maxPoena) {
                maxPoena = igrac.getBrojPoena();
                najbolji = igrac;
            }
        }
        return najbolji.getIme();
        //return najbolji != null ? najbolji.getIme() : "Nema igrača";
    }

    @Override
    public double vrednostTima() {
        double vrednost = 0;
        for (Igrac igrac : getIgraci()) {
            vrednost += igrac.getBrojPoena() * 1000;
        }
        return vrednost;
    }
}
