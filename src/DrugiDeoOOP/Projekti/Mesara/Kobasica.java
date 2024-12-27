package DrugiDeoOOP.Projekti.Mesara;

public class Kobasica extends Preradjevina{
    private boolean dimljena;

    Kobasica(double tezina, double cena, double lager) {
        super(tezina, cena, lager);
        dimljena = false;
    }

    void odimi() {
        dimljena = true;
        staviCenu(uzmiCenu()*2);
    }

    void gricni(double kolicina) {
        if (uzmiLager() < kolicina)
            staviLager(0);
        else
            staviLager(uzmiLager() -  kolicina);
    }

    public String toString() {
        if (dimljena) {
            return super.toString() + "\nU pitanju je dimljena kobasica.";
        } else {
            return super.toString() + "\nKobasica nije dimljena.";
        }
    }
}
