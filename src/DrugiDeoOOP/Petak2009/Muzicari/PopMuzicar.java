package DrugiDeoOOP.Petak2009.Muzicari;

public class PopMuzicar extends Muzicar {
    public PopMuzicar(String ime, int godinaPocetkaKarijere, Album album) {
        super(ime, godinaPocetkaKarijere, album);
    }

    @Override
    public double zarada() {
        return getAlbum().getBrojPesama() * 1000;
    }
}
