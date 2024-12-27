package DrugiDeoOOP.Projekti.Pekara;

public class Pecivo extends Proizvod{
    public Pecivo(int tezina, double cena, int lager) {
        super(tezina, cena, lager);
    }
    void zvakni(int kolicina) {
        if (getLager() < kolicina)
            setLager(0);
        else
            setLager(getLager() -  kolicina);
    }
}
