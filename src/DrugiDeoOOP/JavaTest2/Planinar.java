package DrugiDeoOOP.JavaTest2;

import java.util.ArrayList;

public class Planinar {
    /*
    Napraviti klasu Planinar
atributi:lista planina, max uspon(maksimalna visina na koju taj planinar moze da se popne)
Metode: -dodaj(Planina p) -> ubacuje datu planinu u listu ukoliko je njena visina manja ili jednaka max usponu
	-opasne() -> metoda vraca listu planina koje su opasne za penjanje
 	-izbaci() -> izbacuje planinu iz liste ukoliko je veca od max uspona nekog planinara i ako je opasna
	-najveca()-> vraca najvecu planinu iz planinarove liste
     */


    private ArrayList<Planina> planine;
    private double maxUspon;

    public Planinar(double maxUspon) {
        this.maxUspon = maxUspon;
        this.planine = new ArrayList<>();
    }


    public ArrayList<Planina> getPlanine() {
        return planine;
    }

    public void setPlanine(ArrayList<Planina> planine) {
        this.planine = planine;
    }

    public double getMaxUspon() {
        return maxUspon;
    }

    public void setMaxUspon(double maxUspon) {
        this.maxUspon = maxUspon;
    }

    public void dodaj(Planina p) {
        if (p.getVisina() <= maxUspon) {
            planine.add(p);
        } else {
            System.out.println("Planina " + p.getNaziv() + " je previsoka za ovog planinara.");
        }
    }

    public ArrayList<Planina> opasne() {
        ArrayList<Planina> opasnePlanine = new ArrayList<>();
        for (Planina p : planine) {
            if (p.isOpasnost()) {
                opasnePlanine.add(p);
            }
        }
        return opasnePlanine;
    }

    public void izbaci() {
        ArrayList<Planina> novaLista = new ArrayList<>();
        for (Planina p : planine) {
            if (!(p.getVisina() > maxUspon || p.isOpasnost())) {
                novaLista.add(p);
            }
        }
        this.planine = novaLista;
    }

    public Planina najveca() {
        if (planine.isEmpty()) {
            return null;
        }
        Planina najvisa = planine.get(0);
        for (Planina p : planine) {
            if (p.getVisina() > najvisa.getVisina()) {
                najvisa = p;
            }
        }
        return najvisa;
    }

    @Override
    public String toString() {
        return "Planinar [maxUspon=" + maxUspon + ", planine=" + planine + "]";
    }
}

