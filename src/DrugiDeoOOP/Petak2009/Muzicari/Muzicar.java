package DrugiDeoOOP.Petak2009.Muzicari;

public abstract class Muzicar {
    private String ime;
    private int godinaPocetkaKarijere;
    private Album album;

    public Muzicar(String ime, int godinaPocetkaKarijere, Album album) {
        this.ime = ime;
        this.godinaPocetkaKarijere = godinaPocetkaKarijere;
        this.album = album;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodinaPocetkaKarijere() {
        return godinaPocetkaKarijere;
    }

    public void setGodinaPocetkaKarijere(int godinaPocetkaKarijere) {
        this.godinaPocetkaKarijere = godinaPocetkaKarijere;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
    public void prviHit() {
        if (album.getGodinaObjavljivanja() == godinaPocetkaKarijere) {
            System.out.println("Album \"" + album.getNaziv() + "\" je prvi hit muzičara " + ime);
        } else {
            System.out.println("Album \"" + album.getNaziv() + "\" nije prvi hit muzičara " + ime);
        }
    }
    public abstract double zarada();


    @Override
    public String toString() {
        return "Muzicar{" +
                "ime='" + ime + '\'' +
                ", godinaPocetkaKarijere=" + godinaPocetkaKarijere +
                ", album=" + album +
                '}';
    }
}
