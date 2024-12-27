package DrugiDeoOOP.Projekti.Mesara;

public class Kulen extends Kobasica{
    Kulen(double tezina, double cena, double lager) {
        super(tezina, cena, lager);
        super.odimi();
    }

    void gricni(double kolicina) {
        if (uzmiLager() < kolicina)
            staviLager(0);
        else
            staviLager(uzmiLager() -  kolicina*2);
    }
}
