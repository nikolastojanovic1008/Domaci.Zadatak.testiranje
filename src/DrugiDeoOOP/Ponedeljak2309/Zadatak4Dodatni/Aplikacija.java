package DrugiDeoOOP.Ponedeljak2309.Zadatak4Dodatni;

public class Aplikacija {
    private String ime;
    private int brojKorisnika;
    private double ukupnoVreme;

    public Aplikacija(String ime, int brojKorisnika, double ukupnoVreme) {
        this.ime = ime;
        this.brojKorisnika = brojKorisnika;
        this.ukupnoVreme = ukupnoVreme;
    }

    public int zarada(){
        int ukupnaZarada = getBrojKorisnika() * 10;
        return ukupnaZarada;
    }
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBrojKorisnika() {
        return brojKorisnika;
    }

    public void setBrojKorisnika(int brojKorisnika) {
        this.brojKorisnika = brojKorisnika;
    }

    public double getUkupnoVreme() {
        return ukupnoVreme;
    }

    public void setUkupnoVreme(double ukupnoVreme) {
        this.ukupnoVreme = ukupnoVreme;
    }

    @Override
    public String toString() {
        return "Aplikacija{" +
                "ime='" + ime + '\'' +
                ", brojKorisnika=" + brojKorisnika +
                ", ukupnoVreme=" + ukupnoVreme +
                '}';
    }
}
