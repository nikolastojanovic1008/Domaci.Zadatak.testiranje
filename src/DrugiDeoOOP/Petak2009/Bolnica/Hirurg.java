package DrugiDeoOOP.Petak2009.Bolnica;

public class Hirurg extends Doktor {
    public Hirurg(String ime, int brojPacijenata, int godinaZaposlenja) {
        super(ime, brojPacijenata, godinaZaposlenja);
    }

    @Override
    public double plata() {
        double ukupnaPlata = getBrojPacijenata() * 230;
        return ukupnaPlata;
    }
}
