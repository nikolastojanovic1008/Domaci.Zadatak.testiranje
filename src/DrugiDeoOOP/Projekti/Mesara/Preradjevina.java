package DrugiDeoOOP.Projekti.Mesara;

public class Preradjevina {
    private double tezina, cena, lager;

    Preradjevina (double tezina, double cena, double lager) {
        this.tezina = tezina;
        this.cena = cena;
        this.lager = lager;
    }

    double uzmiTezinu() {
        return tezina;
    }

    void staviTezinu(double tezina) {
        this.tezina = tezina;
    }

    double uzmiCenu() {
        return cena;
    }

    void staviCenu(double cena) {
        this.cena = cena;
    }

    double uzmiLager() {
        return lager;
    }

    void staviLager(double lager) {
        this.lager = lager;
    }

    public String toString() {
        return this.getClass().getName() + " od " + tezina*1000 + " g kosta " + cena + " dinara. Na lageru je " + lager + " kg.";
    }
}

