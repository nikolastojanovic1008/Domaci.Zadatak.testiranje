package DrugiDeoOOP.Petak2009.Muzicari;

public class RokMuzicar extends Muzicar{
    public RokMuzicar(String ime, int godinaPocetkaKarijere, Album album) {
        super(ime, godinaPocetkaKarijere, album);
    }

    @Override
    public double zarada() {
        return getAlbum().getBrojPesama() * 750;
    }
}
