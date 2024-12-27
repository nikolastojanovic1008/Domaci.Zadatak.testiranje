package DrugiDeoOOP.Petak2009.Bolnica;

public abstract class Doktor {
    /*
    Zadatak 1:
Napraviti klasu Doktor koji od atributa ima ime, broj pacijenata i godinu zaposlenja.
Napraviti metode:
- godineStaza() -> racuna Koliko doktor ima godina staza
- plata() -> racuna koliku platu ima doktor ako zaradjuje 100 po pacijentu
Napraviti klasu Pedijatar koji nasledjuje klasu Doktor I on zaradjuje 150 po pacijentu.
Napraviti klasu Hirurg koji nasledjuje klasu Doktor I on zaradjuje 230 po pacijentu.
Napraviti klasu Oftalmolog koji nasledjuje klasu Doktor.
     */
    private String ime;
    private int brojPacijenata;
    private int godinaZaposlenja;

    public Doktor(String ime, int brojPacijenata, int godinaZaposlenja) {
        this.ime = ime;
        this.brojPacijenata = brojPacijenata;
        this.godinaZaposlenja = godinaZaposlenja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBrojPacijenata() {
        return brojPacijenata;
    }

    public void setBrojPacijenata(int brojPacijenata) {
        this.brojPacijenata = brojPacijenata;
    }

    public int getGodinaZaposlenja() {
        return godinaZaposlenja;
    }

    public void setGodinaZaposlenja(int godinaZaposlenja) {
        this.godinaZaposlenja = godinaZaposlenja;
    }

    @Override
    public String toString() {
        return "Doktor{" +
                "ime='" + ime + '\'' +
                ", brojPacijenata=" + brojPacijenata +
                ", godinaZaposlenja=" + godinaZaposlenja +
                '}';
    }

    public int godineStaza() {
        int godine = 2024 - getGodinaZaposlenja();
        return godine;
    }

    public abstract double plata();

}
