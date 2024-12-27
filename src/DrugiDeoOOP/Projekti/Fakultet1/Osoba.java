package DrugiDeoOOP.Projekti.Fakultet1;

public class Osoba {
    /*
    Implementirati klasu Osoba koja ima ime, prezime, god rodjenja i metodu za predstavljanje,
    zatim kreirati klasu Student koja nasledjuje klasu Osoba i dodaje svoje specificne atribute,
    poput liste predmeta, broja indeksa i proseka ocena. Klasa Student dodaje i metodu za dodavanja predmeta,
    prikaza proseka i overide-uje metodu koja vraca opis, cineci je prilagodjenom za studente.
    Takodje, dodati metodu koja ispisPredmeta(), koja ispisuje sve predmete koje student slusa.
Lista predmeta sadrzi elemente tipa Predmet. Klasa Predmet sadrzi ime predmeta,
broj ESPB-a i ime profesora i metod koji vraca opis predmeta.
U main-u kreirati studenta i pozvati metode koje su implementirane
     */
    private String ime;
    private String prezime;
    private int godinaRodjenja;

    public Osoba(String ime, String prezime, int godinaRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
    public String predstaviSe() {
        return "Ja sam " + ime + " " + prezime + ", rođen/a " + godinaRodjenja + ".";
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godinaRodjenja=" + godinaRodjenja +
                '}';
    }
}
