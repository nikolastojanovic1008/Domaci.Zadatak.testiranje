package DrugiDeoOOP.Cetvrtak1909.Zadatak2;

public class Film {
    /*
    Napraviti klasu Film koji od atributa ima godinu objavljivanja, glavnog glumca I ukupno zaradjenih para.
Napraviti metode:
- godineGlavnogGlumca() -> kao rezultat vraca broj godina koje je glumac imao kad je snimio film
- troskovi() -> vraca nam koliki su troskovi ako racunamo da iznose 20% od ukupne zarade filma
     */
    private int godinaObjavljivanja;

    private double ukupnoZaradjenihPara;
    private Glumac k;

    public Film(int godinaObjavljivanja, double ukupnoZaradjenihPara, Glumac k) {
        this.godinaObjavljivanja = godinaObjavljivanja;
        this.ukupnoZaradjenihPara = ukupnoZaradjenihPara;
        this.k = k;
    }

    public int getGodinaObjavljivanja() {
        return godinaObjavljivanja;
    }

    public void setGodinaObjavljivanja(int godinaObjavljivanja) {
        this.godinaObjavljivanja = godinaObjavljivanja;
    }

    public double getUkupnoZaradjenihPara() {
        return ukupnoZaradjenihPara;
    }

    public void setUkupnoZaradjenihPara(double ukupnoZaradjenihPara) {
        this.ukupnoZaradjenihPara = ukupnoZaradjenihPara;
    }

    public Glumac getK() {
        return k;
    }

    public void setK(Glumac k) {
        this.k = k;
    }

    public int godineGlavnogGlumca() {
        int starostKodObjavljivanja = getGodinaObjavljivanja() - getK().getGodinaRodjenja();
        return starostKodObjavljivanja;
    }

    public double troskovi() {
        double troskoviSnimanja = getUkupnoZaradjenihPara() * 0.2;
        return troskoviSnimanja;
    }

}
