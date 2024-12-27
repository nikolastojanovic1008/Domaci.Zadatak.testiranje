package DrugiDeoOOP.utorak1709.Zadatak3;

public class Autor {
    /*
    Zadatak 4:
Napraviti klasu Autor koji u sklopu ima ime, godinu rodjenja,ukupan broj prodanih dela i jednu knjigu.
Napraviti metodu:
-ranaObjava() -> ispisati poruku ako je autor objavio svoju knjigu pre 25 godine
-zarada() -> Koliko je zaradio ukupno para od svih prodanih dela ako racunamo da imaju isti cenu kao ta jedna knjiga
     */
    private String ime;
    private int godinaRodjenja;
    private int brojProdatihDela;
    private Knjiga knjiga; // Instanca klase Knjiga

    public Autor(String ime, int godinaRodjenja, int brojProdatihDela, Knjiga knjiga) {
        this.ime = ime;
        this.godinaRodjenja = godinaRodjenja;
        this.brojProdatihDela = brojProdatihDela;
        this.knjiga = knjiga;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "ime='" + ime + '\'' +
                ", godinaRodjenja=" + godinaRodjenja +
                ", brojProdatihDela=" + brojProdatihDela +
                ", knjiga=" + knjiga +
                '}';
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public int getBrojProdatihDela() {
        return brojProdatihDela;
    }

    public void setBrojProdatihDela(int brojProdatihDela) {
        this.brojProdatihDela = brojProdatihDela;
    }

    public Knjiga getKnjiga() {
        return knjiga;
    }

    public void setKnjiga(Knjiga knjiga) {
        this.knjiga = knjiga;
    }

    public void ranaObjava() {
        int autoroveGodine = getKnjiga().getGoginaIzdanja() - getGodinaRodjenja();
        if (autoroveGodine <= 25) {
            System.out.println("Autor je objavio svoju knjigu pre 25. godine");
        } else {
            System.out.println("Autor NIJE objavio svoju knjigu pre 25. godine");
        }
    }

    public void zarada() {
        double ukupnaZarada = getBrojProdatihDela() * getKnjiga().getCena();

        System.out.printf("%s je zaradio ukupno %.2f RSD od svojih dela.%n", ime, ukupnaZarada);
    }
}
