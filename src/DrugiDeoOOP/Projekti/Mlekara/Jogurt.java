package DrugiDeoOOP.Projekti.Mlekara;

public class Jogurt extends MlecniProizvod{
    String dodatak;

    Jogurt(int tezina, double cena, double mm, int lager, String dodatak) {
        super(tezina, cena, mm, lager);
        this.dodatak= dodatak;
    }

    void gucni(int kolicina) {
        if (uzmiLager() < kolicina)
            staviLager(0);
        else
            staviLager(uzmiLager() -  kolicina);
    }

    public String toString() {
        if (dodatak == null) {
            return super.toString() + "\nU pitanju je obican jogurt.";
        } else {
            return super.toString() + "\nDodatak: " + dodatak;
        }
    }
}
