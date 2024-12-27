package DrugiDeoOOP.Projekti.Mlekara;

public class MlecniProizvod {
    private int tezina;
    private double cena;
    private double mm;
    private int lager;

    MlecniProizvod (int tezina, double cena, double mm, int lager) {
        this.tezina = tezina;
        this.cena = cena;
        this.mm = mm;
        this.lager = lager;
    }

    int uzmiTezinu() {
        return tezina;
    }

    void staviTezinu(int tezina) {
        this.tezina = tezina;
    }

    double uzmiCenu() {
        return cena;
    }

    void staviCenu(double cena) {
        this.cena = cena;
    }

    double uzmiMm() {
        return mm;
    }

    void staviMm(double mm) {
        this.mm = mm;
    }

    int uzmiLager() {
        return lager;
    }

    void staviLager(int lager) {
        this.lager = lager;
    }

    public String toString() {
        return this.getClass().getName() + " od " + tezina + " g, sa " + mm + " % mlecne masti, kosta " + cena + " dinara. \nNa lageru je " + lager + " g.";
    }
}
