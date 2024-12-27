package DrugiDeoOOP.utorak1709.Zadatak3;

public class Knjiga {
    private String naziv;
    private int brojStrana;
    private int goginaIzdanja;
    private double cena;

    public Knjiga(String naziv, int brojStrana, int goginaIzdanja, double cena) {
        this.naziv = naziv;
        this.brojStrana = brojStrana;
        this.goginaIzdanja = goginaIzdanja;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return
                "naziv='" + naziv + '\'' +
                        ", brojStrana=" + brojStrana +
                        ", godinaIzdanja=" + goginaIzdanja +
                        ", cena=" + cena ;

    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        this.brojStrana = brojStrana;
    }

    public int getGoginaIzdanja() {
        return goginaIzdanja;
    }

    public void setGoginaIzdanja(int goginaIzdanja) {
        this.goginaIzdanja = goginaIzdanja;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void popust() {
        if (getBrojStrana() > 300) {
            setCena(getCena() * 0.8);

        }
        //System.out.println(getCena());
    }

    public void oldTimer() {
        if (2024 - getGoginaIzdanja() > 20) {
            System.out.println("U pitanju je starija knjiga");
        } else {
            System.out.println("Nije u pitanju starija knjiga");
        }
    }
}
