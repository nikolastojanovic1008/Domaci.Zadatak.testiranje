package DrugiDeoOOP.JavaTest2;

import java.util.ArrayList;

public class Pro extends Planinar {
    /*
    Napraviti klasu Pro koji nasledjuje klasu Planinar koji iz svoje liste izbacuje samo planine koje su vece
od njegovog maxUspon-a.
     */
    public Pro(double maxUspon) {
        super(maxUspon);
    }

    @Override
    public void izbaci() {
        ArrayList<Planina> novaLista = new ArrayList<>();
        for (Planina p : getPlanine()) {
            if (p.getVisina() <= getMaxUspon()) {
                novaLista.add(p);
            }
        }
        setPlanine(novaLista);
    }

    @Override
    public String toString() {
        return "Pro planinar sa maksimalnim usponom od " + getMaxUspon();
    }
}
