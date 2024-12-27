package DrugiDeoOOP.Projekti.Mesara;

public class Pasteta extends Preradjevina{
    private String vrsta;
    boolean konzervisana;

    Pasteta(double tezina, double cena, double lager, String vrsta) {
        super(tezina, cena, lager);
        this.vrsta = vrsta;
        konzervisana = false;
    }

    void konzervisi() {
        konzervisana = true;
        staviCenu(uzmiCenu()*1.1);
    }

    void smazi() {
        if (uzmiLager() < 0.3)
            staviLager(0);
        else
            staviLager(uzmiLager() - 0.3);
    }

    public String toString() {
        return super.toString() + " Vrsta pastete: " + vrsta + "\nPasteta " + (konzervisana ? "je" : "nije") + " konzervisana.";
    }
}
