package DrugiDeoOOP.Projekti.Mlekara;

public class Sir extends MlecniProizvod{
    private boolean dimljeni;

    Sir(int tezina, double cena, double mm, int lager) {
        super(tezina, cena, mm, lager);
        dimljeni = false;
    }

    void odimi() {
        dimljeni = true;
        staviCenu(uzmiCenu()*1.3);
    }

    void gricni(int kolicina) {
        if (uzmiLager() < kolicina)
            staviLager(0);
        else
            staviLager(uzmiLager() -  kolicina);
    }

    public String toString() {
        if (dimljeni) {
            return super.toString() + "\nU pitanju je dimljeni sir.";
        } else {
            return super.toString() + "\nSir nije dimljen.";
        }
    }
}
