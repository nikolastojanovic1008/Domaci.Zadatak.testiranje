package DrugiDeoOOP.Cetvrtak1909.Zadatak2;

public class Romantika extends Film{


    public Romantika(int godinaObjavljivanja, double ukupnoZaradjenihPara, Glumac k) {
        super(godinaObjavljivanja, ukupnoZaradjenihPara, k);
    }

    @Override
    public double troskovi() {
        double troskoviSnimanja = getUkupnoZaradjenihPara()*0.1;
        return troskoviSnimanja;
    }
}
