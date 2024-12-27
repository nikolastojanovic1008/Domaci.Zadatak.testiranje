package DrugiDeoOOP.Petak2009.Bolnica;

public class Pedijatar extends Doktor{
    public Pedijatar(String ime, int brojPacijenata, int godinaZaposlenja) {
        super(ime, brojPacijenata, godinaZaposlenja);
    }

    @Override
    public double plata() {
        double ukupnaPlata = 150 * getBrojPacijenata();
        return ukupnaPlata;
    }
}
