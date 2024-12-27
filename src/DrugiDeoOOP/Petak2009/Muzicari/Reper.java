package DrugiDeoOOP.Petak2009.Muzicari;

public class Reper extends Muzicar{
    public Reper(String ime, int godinaPocetkaKarijere, Album album) {
        super(ime, godinaPocetkaKarijere, album);
    }

    @Override
    public double zarada() {
        return getAlbum().getBrojPesama() * 500;
    }
}
