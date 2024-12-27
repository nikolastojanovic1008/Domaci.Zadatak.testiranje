package DrugiDeoOOP.Petak2009.Bolnica;

public class Oftalmolog extends Doktor{
    public Oftalmolog(String ime, int brojPacijenata, int godinaZaposlenja) {
        super(ime, brojPacijenata, godinaZaposlenja);
    }

    @Override
    public double plata() {
        double ukupnaPlata = getBrojPacijenata()*100;
        return ukupnaPlata;
    }
}
