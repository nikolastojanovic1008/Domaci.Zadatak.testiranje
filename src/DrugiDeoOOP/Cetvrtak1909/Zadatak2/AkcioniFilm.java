package DrugiDeoOOP.Cetvrtak1909.Zadatak2;

public class AkcioniFilm extends Film{


    public AkcioniFilm(int godinaObjavljivanja, double ukupnoZaradjenihPara, Glumac k) {
        super(godinaObjavljivanja, ukupnoZaradjenihPara, k);
    }

    @Override
    public double troskovi() {
        double troskoviSnimanja = getUkupnoZaradjenihPara()*0.4;
        return troskoviSnimanja;
    }
}
