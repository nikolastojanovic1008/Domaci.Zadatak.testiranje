package DrugiDeoOOP.Petak2009.Muzicari;

public class Album {
    private String naziv;
    private int godinaObjavljivanja;
    private int brojPesama;

    public Album(String naziv, int godinaObjavljivanja, int brojPesama) {
        this.naziv = naziv;
        this.godinaObjavljivanja = godinaObjavljivanja;
        this.brojPesama = brojPesama;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaObjavljivanja() {
        return godinaObjavljivanja;
    }

    public void setGodinaObjavljivanja(int godinaObjavljivanja) {
        this.godinaObjavljivanja = godinaObjavljivanja;
    }

    public int getBrojPesama() {
        return brojPesama;
    }

    public void setBrojPesama(int brojPesama) {
        this.brojPesama = brojPesama;
    }

    @Override
    public String toString() {
        return "Album{" +
                "naziv='" + naziv + '\'' +
                ", godinaObjavljivanja=" + godinaObjavljivanja +
                ", brojPesama=" + brojPesama +
                '}';
    }
}
