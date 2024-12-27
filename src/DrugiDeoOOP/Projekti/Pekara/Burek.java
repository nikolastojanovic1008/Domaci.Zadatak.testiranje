package DrugiDeoOOP.Projekti.Pekara;

public class Burek  extends Proizvod{
    private String fil;

    public Burek(int tezina, double cena, int lager) {
        super(tezina, cena, lager);
    }
    public void filuj(String fil) {
        this.fil = fil;
        setCena(getCena() + 10);
    }

    public void smazi() {
        setLager(0);
    }

    public String toString() {
        if (fil == null) {
            return super.toString() + " Burek je prazan.";
        } else {
            return super.toString() + " Fil: " + fil;
        }
    }
}
